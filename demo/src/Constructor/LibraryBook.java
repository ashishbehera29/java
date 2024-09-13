package Constructor;

public class LibraryBook {

    private String title;
    private String author;
    private String isbn;
    private boolean isCheckedOut;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("You have successfully checked out \"" + title + "\" by " + author);
        } else {
            System.out.println("Sorry, \"" + title + "\" is already checked out.");
        }
    }

    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("You have successfully returned \"" + title + "\" by " + author);
        } else {
            System.out.println("\"" + title + "\" was not checked out.");
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        LibraryBook book2 = new LibraryBook("1984", "George Orwell", "978-0-452-28423-4");

        book1.displayBookDetails();
        book2.displayBookDetails();

        book1.checkOut();

        book1.checkOut();

        book1.returnBook();

        book1.displayBookDetails();
    }
}
