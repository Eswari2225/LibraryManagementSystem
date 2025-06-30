import java.util.ArrayList;

public class Library {
    ArrayList<Book> allBooks = new ArrayList<>();
    ArrayList<User> allUsers = new ArrayList<User>();
    public void displayUser(){
        for(User i: allUsers){
            System.out.println(i);
        }
    }

    public void displayBooks(){
        for(Book i: allBooks){
            System.out.println(i);
        }
    }

    public void addBook(Book book){
        allBooks.add(book);
    }

    public void addUser(User user){
        allUsers.add(user);
    }

    public void issueBook(int userId, int bookId){
        for(User us : allUsers){
            if(us.getUserId() == userId ){
                for(Book bk: allBooks){
                    if(bk.getId() == bookId){
                        if(!(bk.getIssued())) {
                            bk.isIssued = true;
                            System.out.println("Successfully issued");
                        }
                        else{
                            System.out.println("Book is already issued");
                        }
                    }
                }
            }
        }

    }

    public void returnBook(int userId, int bookId){
        for(User us : allUsers){
            if(us.getUserId() == userId ){
                for(Book bk: allBooks){
                    if(bk.getId() == bookId){

                            bk.isIssued = false;
                            System.out.println("returned issued");

                    }
                }
            }
            System.out.println("Book not found!");

        }
    }



}
