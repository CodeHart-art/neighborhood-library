import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(1,"Strangers: A Memoir of Marriage","0593733312");
        Book book2 = new Book(2,"Project Hail Mary: A Novel","0593135202");
        Book book3 = new Book(3,"The Correspondent","0593798430");
        Book book4 = new Book(4,"Rites of the Starling","9781682816752");
        Book book5 = new Book(5,"Dear Debbie","1464249628");
        Book book6 = new Book(6,"The Night We Met","1538759225");
        Book book7 = new Book(7,"Vigil", "0525509623");
        Book book8 = new Book(8,"Dungeon Crawler Carl","059382024X");
        Book book9 = new Book(9,"Cracking the Coding Interview: 189 Programming Questions and Solutions","0984782869");
        Book book10 = new Book(10,"Python Crash Course, 3rd Edition: A Hands-On, Project-Based Introduction to Programming","1718502702");

        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};

        book1.isCheckedOut();
    }
}
