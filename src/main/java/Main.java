import java.util.Scanner;

public class Main {
    public static String name = "John";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "John";

        Book book1 = new Book(1,"Strangers: A Memoir of Marriage","0593733312",false);
        Book book2 = new Book(2,"Project Hail Mary: A Novel","0593135202",false);
        Book book3 = new Book(3,"The Correspondent","0593798430",false);
        Book book4 = new Book(4,"Rites of the Starling","9781682816752",false);
        Book book5 = new Book(5,"Dear Debbie","1464249628",false);
        Book book6 = new Book(6,"The Night We Met","1538759225",false);
        Book book7 = new Book(7,"Vigil", "0525509623",false);
        Book book8 = new Book(8,"Dungeon Crawler Carl","059382024X",false);
        Book book9 = new Book(9,"Cracking the Coding Interview: 189 Programming Questions and Solutions","0984782869",false);
        Book book10 = new Book(10,"Python Crash Course, 3rd Edition: A Hands-On, Project-Based Introduction to Programming","1718502702",false);

        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};

        book2.isCheckedOut();

        displayData(books[3]);
        displayData(book2);






        scanner.close();
    }


    public static void displayData(Book book){

        System.out.println("Title: " + book.title);
        System.out.println("Id: " + book.id);
        System.out.println("ISBN-10: " + book.isbn);

        if (book.checkedOut){
            book.setCheckedOut(name);
        }
        else{
            System.out.println("In Stock");
        }
    }
}
