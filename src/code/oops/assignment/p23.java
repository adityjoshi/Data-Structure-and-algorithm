package code.oops.assignment;

public class p23 {
    public static void main(String[] args) {
    Book book = new Book("haary potter","122","jk");
    book.display();
    book.setTitle("gk 26");
    book.display();
    }
}
 class Book {
    private String title;
    private String ISBN;
    private String author ;

    public Book() {

    }

    public Book(String title,String ISBN,String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

     public String getAuthor() {
         return author;
     }

     public String getISBN() {
         return ISBN;
     }

     public String getTitle() {
         return title;
     }
     public void setAuthor(String author) {
        this.author = author;
     }
     public void setISBN(String ISBN) {
        this.ISBN=ISBN;
     }
     public void setTitle(String title) {
        this.title=title;
     }
     public void display() {
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("ISBN: " + ISBN);
     }
 }
