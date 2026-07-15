import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Simple Product class
class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class shoppingCart {

    // Bad: array with fixed size
    private Product[] items = new Product[10]; // max 10 items only

    // Good: ArrayList with dynamic size
    private List<Product> itemsList = new ArrayList<>(); // unlimited items!

    public void addProduct(Product product) {
        itemsList.add(product);
    }

    public static void main(String[] args) {

        // 2. Adding elements
        List<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Alic");
        students.add("Alie");
        students.add("Alce");

        System.out.println(students);

        // Add at specific position
        students.add(1, "Eve");

        // Add all from another collection
        List<String> moreStudents = new ArrayList<>();
        moreStudents.add("Frank");
        moreStudents.add("Mike");

        students.addAll(moreStudents);

        // 3. Accessing elements
        String first = students.get(0);
        System.out.println("First Student: " + first);

        // 4. Removing elements
        students.remove(1); // remove by index
        students.remove("Bob"); // remove by object

        System.out.println("After removal: " + students);

        // Remove all elements matching a condition
        students.removeIf(name -> name.startsWith("F"));

        System.out.println("After removeIf: " + students);

        // 5. Checking contents
        boolean hasAlice = students.contains("Alice");
        boolean hasBob = students.contains("Bob");

        System.out.println("Contains Alice? " + hasAlice);
        System.out.println("Contains Bob? " + hasBob);

        // Index of particular element
        int index = students.indexOf("Alie");
        System.out.println("Index of Alie: " + index);

        // 6. Size and capacity
        int size = students.size();
        boolean empty = students.isEmpty();

        System.out.println("Size: " + size);
        System.out.println("Is Empty? " + empty);

        // 7. Iteration - For Each Loop
        System.out.println("\n-- For Each Loop --");
        for (String student : students) {
            System.out.println(student);
        }

        // Traditional For Loop
        System.out.println("\n-- Traditional For Loop --");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + i + ": " + students.get(i));
        }

        // Iterator
        System.out.println("\n-- Iterator --");
        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }

        // Lambda forEach
        System.out.println("\n-- Lambda forEach --");
        students.forEach(student -> System.out.println(student));

        // 8. Clearing the list
        students.clear();

        System.out.println("After clear: " + students);
        System.out.println("Is Empty? " + students.isEmpty());
    }
}