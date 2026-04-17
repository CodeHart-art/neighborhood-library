public class Book {
    int id;
    String isbn;
    String title;
    boolean checkedOut;
    String checkedOutTo;

    Book(int id,String isbn,String title,boolean checkedOut,String checkedOutTo){
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
    public void setCheckedOut(String name){
        System.out.println("This booked is checked out by " + name);
    }
    public void isCheckedOut(){
        checkedOut = true;
        System.out.println("is this working");
    }
}
