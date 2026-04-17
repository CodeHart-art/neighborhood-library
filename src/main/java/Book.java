public class Book {
    int id;
    String isbn;
    String title;
    boolean isCheckedOut;
    String checkedOutTo;

    Book(int id,String isbn,String title,boolean isCheckedOut,String checkedOutTo){
        this.title = title;
        this.id = id;
        this.checkedOutTo = checkedOutTo;
        this.isbn = isbn;
    }
    Book(int id,String title,String isbn){
        this.isbn = isbn;
        this.title = title;
        this.id = id;
    }
}
