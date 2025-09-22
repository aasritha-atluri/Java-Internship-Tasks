import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter author: ");
                    String a = sc.nextLine();
                    books.add(new Book(t, a));
                    System.out.println("Book added!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println(" The library is empty. No books to display!");
                    } else {
                        System.out.println("\n--- Books in Library ---");
                        for (Book b : books)
                            System.out.println(b.title + " by " + b.author);
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String st = sc.nextLine();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(st)) {
                            System.out.println("Found: " + b.title + " by " + b.author);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter title to remove: ");
                    String rt = sc.nextLine();
                    boolean removed = books.removeIf(b -> b.title.equalsIgnoreCase(rt));
                    if (removed) {
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("No such book found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}

