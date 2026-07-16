import java.util.ArrayList;
import java.util.List;

// ===== Course class with encapsulation =====
class Course {
    // Private fields - no direct access (encapsulation)
    private String courseCode;
    private String courseName;
    private int courseCredits;
    private int totalSeats;
    private int availableSeats;

    // Constructor
    public Course(String courseCode, String courseName, int courseCredits, int totalSeats) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats; // initially all seats are free
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCredits(int courseCredits) {
        if (courseCredits > 0) {
            this.courseCredits = courseCredits;
        } else {
            System.out.println("Credits must be positive.");
        }
    }

    // Check availability
    public boolean isAvailable() {
        return availableSeats > 0;
    }

    // Enroll a student (reduce available seats)
    public boolean enrollStudent() {
        if (isAvailable()) {
            availableSeats--;
            return true;
        } else {
            System.out.println("No seats available for " + courseName);
            return false;
        }
    }

    // Cancel a student's seat (increase available seats)
    public boolean cancelEnrollment() {
        if (availableSeats < totalSeats) {
            availableSeats++;
            return true;
        } else {
            System.out.println("All seats already free for " + courseName);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Code: " + courseCode + " | Name: " + courseName +
               " | Credits: " + courseCredits +
               " | Seats: " + availableSeats + "/" + totalSeats +
               " | " + (isAvailable() ? "Available" : "Full");
    }
}

// ===== Course Registration System =====
class CourseRegistrationSystem {
    private List<Course> courses;

    public CourseRegistrationSystem() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getCourseName());
    }

    public void removeCourse(String courseCode) {
        Course course = findCourse(courseCode);
        if (course != null) {
            courses.remove(course);
            System.out.println("Course removed: " + courseCode);
        } else {
            System.out.println("Course not found: " + courseCode);
        }
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("---- All Courses ----");
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public Course findCourse(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                return c;
            }
        }
        return null;
    }

    public int calculateTotalCredits() {
        int total = 0;
        for (Course c : courses) {
            total += c.getCourseCredits();
        }
        return total;
    }

    // Register a student into a course (checks availability internally)
    public void registerStudent(String courseCode) {
        Course course = findCourse(courseCode);
        if (course == null) {
            System.out.println("Course not found: " + courseCode);
            return;
        }
        if (course.enrollStudent()) {
            System.out.println("Registered successfully in " + course.getCourseName() +
                    ". Seats left: " + course.getAvailableSeats());
        }
    }

    // Cancel a student's registration
    public void cancelRegistration(String courseCode) {
        Course course = findCourse(courseCode);
        if (course == null) {
            System.out.println("Course not found: " + courseCode);
            return;
        }
        if (course.cancelEnrollment()) {
            System.out.println("Cancelled. Seats now available: " + course.getAvailableSeats());
        }
    }

    // Display only courses that still have seats
    public void displayAvailableCourses() {
        System.out.println("---- Available Courses ----");
        boolean any = false;
        for (Course c : courses) {
            if (c.isAvailable()) {
                System.out.println(c);
                any = true;
            }
        }
        if (!any) {
            System.out.println("No courses currently have open seats.");
        }
    }
}

// ===== Test / Driver class =====
public class registration {
    public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();

        system.addCourse(new Course("CS101", "Java Programming", 4, 2)); // only 2 seats
        system.addCourse(new Course("CS102", "Data Structures", 3, 3));
        system.addCourse(new Course("CS103", "Database Systems", 3, 0)); // no seats

        system.displayAllCourses();

        System.out.println("\n--- Registering students ---");
        system.registerStudent("CS101");
        system.registerStudent("CS101");
        system.registerStudent("CS101"); // should fail - full

        System.out.println("\n--- Checking availability ---");
        system.displayAvailableCourses();

        System.out.println("\n--- Cancelling one seat in CS101 ---");
        system.cancelRegistration("CS101");

        system.displayAllCourses();

        System.out.println("\nTotal Credits: " + system.calculateTotalCredits());
    }
}
/*
==========================
COURSE REGISTRATION SYSTEM
==========================

1. Course Class
---------------
The Course class stores the details of one course.

It has:
- courseCode -> Course ID
- courseName -> Name of the course
- courseCredits -> Number of credits
- totalSeats -> Total seats in the course
- availableSeats -> Seats that are still empty

These variables are private because of encapsulation.
They can only be accessed using getter and setter methods.

================================================

2. Constructor
--------------
The constructor is used to give values when a Course object is created.

Example:

new Course("CS101", "Java Programming", 4, 2);

This creates a course with:
Course Code = CS101
Course Name = Java Programming
Credits = 4
Total Seats = 2

================================================

3. Getter Methods
-----------------
Getter methods return the values of private variables.

Example:
getCourseName()
returns the course name.

================================================

4. Setter Methods
-----------------
Setter methods change the values.

Example:
setCourseName()

changes the course name.

================================================

5. isAvailable()
----------------
Checks whether seats are available.

If availableSeats is greater than 0,
it returns true.

Otherwise,
it returns false.

================================================

6. enrollStudent()
------------------
This method registers one student.

If seats are available,
availableSeats is reduced by 1.

If no seats are available,
it prints a message.

================================================

7. cancelEnrollment()
---------------------
This method cancels one registration.

If a student cancels,
availableSeats increases by 1.

================================================

8. toString()
-------------
This method prints the course details in a neat format.

================================================

9. CourseRegistrationSystem Class
---------------------------------
This class manages all the courses.

It stores all Course objects in an ArrayList.

================================================

10. addCourse()
---------------
Adds a new course to the list.

================================================

11. removeCourse()
------------------
Removes a course using the course code.

================================================

12. displayAllCourses()
-----------------------
Displays all the courses.

================================================

13. findCourse()
----------------
Searches for a course using its course code.

================================================

14. calculateTotalCredits()
---------------------------
Adds the credits of all the courses and returns the total.

================================================

15. registerStudent()
---------------------
Finds the course and registers a student.

If seats are available,
registration is successful.

Otherwise,
it prints that the course is full.

================================================

16. cancelRegistration()
------------------------
Cancels a student's registration and increases the available seats.

================================================

17. displayAvailableCourses()
-----------------------------
Displays only the courses that have seats available.

================================================

18. Main Method
---------------
The program starts from the main method.

Steps:
1. Create the Course Registration System.
2. Add three courses.
3. Display all courses.
4. Register students.
5. Check available courses.
6. Cancel one registration.
7. Display all courses again.
8. Display the total credits.

================================================

OOP Concepts Used
-----------------
1. Class
   - Course
   - CourseRegistrationSystem

2. Object
   - Course objects
   - CourseRegistrationSystem object

3. Encapsulation
   - Private variables with getters and setters

4. Constructor
   - Used to initialize course details

5. Method Overriding
   - toString() method

================================================

Program Flow
------------
Start
   ↓
Create Registration System
   ↓
Add Courses
   ↓
Display Courses
   ↓
Register Students
   ↓
Check Available Courses
   ↓
Cancel Registration
   ↓
Display Courses
   ↓
Calculate Total Credits
   ↓
End
*/