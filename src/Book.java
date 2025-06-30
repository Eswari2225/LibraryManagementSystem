public class Book {
    private int id;
    private String title;
    private String author;
    boolean isIssued;

    Book(int id, String title, String author, boolean isIssued){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsIssued(boolean isIssued){
        this.isIssued = isIssued;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean getIssued(){
        return isIssued;
    }

    public String toString(){
        return id+" "+title +" "+author +" "+isIssued;
    }
}
