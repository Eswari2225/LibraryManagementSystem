import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    ArrayList<ArrayList<Book>> issued = new ArrayList<ArrayList<Book>>();

    User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void issueBook(ArrayList<Book> book){
        issued.add(book);
    }

    public void returnBook(ArrayList<Book> book){
        issued.remove(book);
    }

    public void getIssuedBook(){
        for(ArrayList<Book> b : issued){
            System.out.println(b);
        }
    }
    public String toString(){
        return userId+" "+name;
    }
}


