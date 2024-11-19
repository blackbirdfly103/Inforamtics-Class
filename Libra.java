public class Libra {
    public static void main(String[] args) {
        // Task 4: Create two or more Book objects with different attributes.
        Book p1 = new Book("W", "S", 100);
        Book p2 = new Book("Q", "A", 1);
        // Task 5: Call the displayDetails method for each object.
        p1.displayDetails();
        p2.displayDetails();
    }
}

// Define the Book class
class Book {
    private String titl;
    private String  autho;
    private Integer  numberOfPage;

    public Book(String title, String author, int numberOfPages) {
        titl = title;
        autho = author;
        numberOfPage = numberOfPages;
    }

    public void displayDetails(){
        System.out.println("Title: " + titl);
        System.out.println("Author: " + autho);
        System.out.println("Number of pages: " + numberOfPage);
    }
}