public class Book {
    int id;
    String isbn;
    String title;
    boolean checkedOut;
    String name;

    Book(int id,String title,String isbn,boolean checkedOut,String name){
        this.title = title;
        this.id = id;
        this.isbn = isbn;
        this.name = name;
    }

    public void isCheckedOut(){
        checkedOut = true;
    }
}
