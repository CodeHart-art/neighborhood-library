public class Book {
    int id;
    String isbn;
    String title;
    boolean checkedOut;

    Book(int id,String title,String isbn,boolean checkedOut){
        this.title = title;
        this.id = id;
        this.isbn = isbn;
    }
    public void checkedOutTo(String name){
        System.out.println("This booked is checked out by " + name);
    }
    public void isCheckedOut(){
        checkedOut = true;
    }
}
