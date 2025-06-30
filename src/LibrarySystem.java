import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library ob = new Library();
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        while(c == true) {
            System.out.println("1. Add Book\n" +
                    "2. Add User\n" +
                    "3. Issue Book\n" +
                    "4. Return Book\n" +
                    "5. View All Books\n" +
                    "6. View All Users\n" +
                    "7. Exit");

            int n = sc.nextInt();

            switch (n) {
                case 1: {
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    System.out.println("Enter title:");
                    String title=sc.next();
                    System.out.println("Enter Author:");
                    String author = sc.next();
                    System.out.println("Enter issued:");
                    boolean isIssued = sc.nextBoolean();

                    Book book = new Book(id,title,author,isIssued);
                    ob.addBook(book);
                    break;
                }

                case 2: {
                    System.out.println("Enter the User Id: ");
                    int userId = sc.nextInt();
                    System.out.println("Enter the Name of the User: ");
                    String name = sc.next();
                    User user = new User(userId, name);
                    ob.addUser(user);
                    break;
                }

                case 3: {
                    System.out.println("Enter the User Id: ");
                    int userId = sc.nextInt();
                    System.out.println("Enter Book ID:");
                    int bookId = sc.nextInt();

                    ob.issueBook( userId, bookId);
                    break;
                }

                case 4: {
                    System.out.println("Enter the User Id: ");
                    int userId = sc.nextInt();
                    System.out.println("Enter Book ID:");
                    int bookId = sc.nextInt();
                    ob.returnBook( userId, bookId);
                    break;
                }

                case 5: {
                    ob.displayBooks();
                    break;
                }

                case 6: {
                    ob.displayUser();
                    break;
                }

                case 7: {
                    c=false;
                    break;

                }
            }
        }
    }
}
