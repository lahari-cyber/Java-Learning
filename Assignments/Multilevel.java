// Parent Class
class Person {
    protected String name;
    protected int age;

    // Parent Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person created");
    }

    // Parent Method
    public void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

// Child Class
class Employee extends Person {
    protected double salary;

    // Child Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Employee created");
    }

    // Overriding Parent Method
    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Salary : $" + salary);
    }
}

// Grandchild Class
class Manager extends Employee {
    private String department;

    // Grandchild Constructor
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
        System.out.println("Manager created");
    }

    // Overriding Employee Method
    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("Department : " + department);
    }
}

// Main Class
public class Multilevel {
    public static void main(String[] args) {

        Manager manager = new Manager("Rahul", 30, 80000, "IT");

        System.out.println();
        manager.displayPerson();
    }
}