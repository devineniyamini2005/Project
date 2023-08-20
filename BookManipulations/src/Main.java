import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:\n");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    Book book = new Book();
                    System.out.print("Enter the isbn no:\n");
                    book.setIsbnno(scanner.nextInt());
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the book name:\n");
                    book.setBookName(scanner.nextLine());
                    System.out.print("Enter the author name:\n");
                    book.setAuthor(scanner.nextLine());
                    library.addBook(book);
                    System.out.println();
                    break;
                case 2:
                    ArrayList<Book> books = library.viewAllBooks();
                    if (books.isEmpty()) 
                    {
                        System.out.println("No books in the library.");
                        System.out.println();
                    } 
                    else 
                    {
                        for (Book b : books) {
                            System.out.println("ISBN no: " + b.getIsbnno());
                            System.out.println("Book name: " + b.getBookName());
                            System.out.println("Author name: " + b.getAuthor());
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter the author name:\n");
                    String authorName = scanner.nextLine();
                    ArrayList<Book> authorBooks = library.viewBooksByAuthor(authorName);
                    if (authorBooks.isEmpty()) {
                        System.out.println("None of the book published by the author " + authorName);
                    }
                    else {
                        for (Book b : authorBooks) {
                            System.out.println("ISBN no: " + b.getIsbnno());
                            System.out.println("Book name: " + b.getBookName());
                            System.out.println("Author name: " + b.getAuthor());
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter the book name:\n");
                    String bookName = scanner.nextLine();
                    int count = library.countnoofbook(bookName);
                    System.out.println("Count of books with the name " + bookName + ": " + count);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting the application.THANK YOU!!!!!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
