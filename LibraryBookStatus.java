class Book {
    String bookId;
    String title;
    String author;
    boolean issued = false;

    void assignData(String id, String t, String a) {
        bookId = id;
        title = t;
        author = a;
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {
        System.out.println("\nBOOK DETAILS");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (issued ? "Issued" : "Available"));
    }
}

public class LibraryBookStatus {
    public static void main(String[] args) {

        Book b1 = new Book();

        b1.assignData("B101", "Core Java", "Cay Horstmann");

        b1.displayBook();
        b1.issueBook();
        b1.displayBook();
        b1.returnBook();
        b1.displayBook();
    }
}