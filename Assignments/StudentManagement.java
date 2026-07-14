

interface Student {
    void addStudent(String name);
    void displayStudent();
}

interface Marks {
    void addMarks(int marks);
    void displayMarks();
}

interface Activity {
    void logActivity(String action);
}

class StudentManagement implements Student, Marks, Activity {

    String name;
    int marks;

    public void addStudent(String name) {
        this.name = name;
        logActivity("Student Added");
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
    }

    public void addMarks(int marks) {
        this.marks = marks;
        logActivity("Marks Added");
    }

    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }

    public void logActivity(String action) {
        System.out.println("Activity: " + action);
    }

    public static void main(String[] args) {

        StudentManagement s = new StudentManagement();

        s.addStudent("Lahari");
        s.addMarks(95);

        s.displayStudent();
        s.displayMarks();
    }
}