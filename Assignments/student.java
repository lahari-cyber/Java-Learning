// Parent Class
class Person {
    protected String name;

    // Parent Constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Person created");
    }

    // Parent Method
    public void displayPerson() {
        System.out.println("Name : " + name);
    }
}

// Child Class 1
class Student extends Person {
    private String course;

    // Child Constructor
    public Student(String name, String course) {
        super(name);
        this.course = course;
        System.out.println("Student created");
    }

    // Overriding
    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Course : " + course);
    }
}

// Child Class 2
class Teacher extends Person {
    private String subject;

    // Child Constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
        System.out.println("Teacher created");
    }

    // Overriding
    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Subject : " + subject);
    }
}

// Usage
public class student{
    public static void main(String[] args) {

        Student student = new Student("Lahari", "B.Tech");
        student.displayPerson();

        System.out.println();

        Teacher teacher = new Teacher("Ramesh", "Java");
        teacher.displayPerson();
    }
}

/*
Parent Class - Person

Child Classes -
Student
Teacher

Hierarchical Inheritance -
Student extends Person
Teacher extends Person

Parent Constructor - Person()

Child Constructors -
Student()
Teacher()

super() - Calls parent constructor

super.displayPerson() - Calls parent method

Method Overriding -
displayPerson()

Objects -
Student student = new Student("Lahari", "B.Tech");

Teacher teacher = new Teacher("Ramesh", "Java");
*/