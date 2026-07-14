// Method Overloading Example

class Library {

    // Search by book title
    void searchBook(String title) {
        System.out.println("Searching book by Title: " + title);
    }

    // Search by book ID
    void searchBook(int bookId) {
        System.out.println("Searching book by Book ID: " + bookId);
    }

    // Search by title and author
    void searchBook(String title, String author) {
        System.out.println("Searching book: " + title + " by " + author);
    }
}

public class methodoverloading{

    public static void main(String[] args) {

        // Creating object of Library class
        Library librarian = new Library();

        // Calling different overloaded methods
        librarian.searchBook("Java Programming");
        librarian.searchBook(105);
        librarian.searchBook("Java Programming", "James Gosling");
    }
}
/*
Parent Class:
There is no parent class in this program because inheritance is not used.

Class:
Library

Methods:
searchBook(String title)
searchBook(int bookId)
searchBook(String title, String author)

Object:
Library librarian = new Library();

Polymorphism Used:
Method Overloading (Compile-Time Polymorphism)

Why?
The method name is the same (searchBook),
but the parameter list is different.

Compiler decides which method to call based on
the number and type of arguments. */