import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(1,"Strangers: A Memoir of Marriage","0593733312",false,"");
        Book book2 = new Book(2,"Project Hail Mary: A Novel","0593135202",false,"");
        Book book3 = new Book(3,"The Correspondent","0593798430",false,"");
        Book book4 = new Book(4,"Rites of the Starling","9781682816752",false,"");
        Book book5 = new Book(5,"Dear Debbie","1464249628",false,"");
        Book book6 = new Book(6,"The Night We Met","1538759225",false,"");
        Book book7 = new Book(7,"Vigil", "0525509623",false,"");
        Book book8 = new Book(8,"Dungeon Crawler Carl","059382024X",false,"");
        Book book9 = new Book(9,"Cracking the Coding Interview: 189 Programming Questions and Solutions","0984782869",false,"");
        Book book10 = new Book(10,"Python Crash Course, 3rd Edition: A Hands-On, Project-Based Introduction to Programming","1718502702",false,"");

        Book[] books = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};


        while (true) {
            System.out.println("--------");
            System.out.print("""
            Welcome to the library Please Select an option
            (A)Show available books
            (C)Show checked out Books
            (E)Exit application : """);
            String menuA = scanner.nextLine();




            if (menuA.equalsIgnoreCase("a")) {

                System.out.println("Here are all available books");
                for (Book book : books) {
                    System.out.println("-----");
                    displayAvailable(book);


                }

                System.out.print("Do you want to check out a Book(Y/N): ");

                String menuB = scanner.nextLine();
                if (menuB.equalsIgnoreCase("y")){
                    System.out.print("Enter your name: ");
                     String name = scanner.nextLine();

                    System.out.print("Enter ID for book you want to check out: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();

                    for (Book book : books) {
                        if (bookID == book.id){
                            book.isCheckedOut();
                            book.name = name;
                            System.out.println("------");
                            System.out.println(name + " checked out " + book.title);
                        }
                    }
                }


            }

            else if (menuA.equalsIgnoreCase("c")) {

                System.out.print("Here are checked out books: ");

                for (Book book : books){
                    if (book.checkedOut){
                        System.out.println("-----");
                        System.out.println("Title: " + book.title);
                        System.out.println("Id: " + book.id);
                        System.out.println("ISBN-10: " + book.isbn);
                        System.out.println("Checked out by: " + book.name );
                    }
                }

                    System.out.println("Do you want to return a book (Y/N): ");
                    String checkInOption = scanner.nextLine();
                    if (checkInOption.equalsIgnoreCase("y")){
                        System.out.print("Enter ID of book you wish to return: " );
                        int bookId = scanner.nextInt();
                        scanner.nextLine();

                        for (Book book : books) {
                            if (bookId == book.id) {
                                book.isCheckedIn();
                            }
                    }
                }



            }
            else if (menuA.equalsIgnoreCase("e")) {

                System.out.println("Exiting Program...");
                System.exit(0);
            }
            else {
                System.out.println("ERROR PICK OPTIONS ON SCREEN");
            }



        }

    }

    public static void displayAvailable(Book book){
        if (book.checkedOut){
            System.out.print("");
        }
        else {
            System.out.println("Title: " + book.title);
            System.out.println("Id: " + book.id);
            System.out.println("ISBN-10: " + book.isbn);
        }

        }
    }

