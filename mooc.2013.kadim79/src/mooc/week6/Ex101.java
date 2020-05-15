package mooc.week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex101 {

    public static void main(String[] args) {

        Book cheese = new Book("Cheese Problems Solved",
                "Woodhead Publishing", 2007);

        System.out.println("Printing from getter ! ");
        System.out.print(cheese.title() + ", ");
        System.out.print(cheese.publisher() + ", ");
        System.out.print(cheese.year() + "\n --------------------------\n");

        System.out.println(cheese + "\n");

        Library Library = new Library();

        Library.addBook(cheese);
        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales",
                "Penguin Group", 1992));

        Library.printBooks();

        ArrayList<Book> result = Library.searchByTitle("Cheese");
            for (Book book : result) {
                System.out.println(book);
            }


        System.out.println("---");
        for (Book book : Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library.searchByYear(1851)) {
                System.out.println(book);
            }
    }
}

class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }
}


class Library {


    String name;
    ArrayList<Book> bookList;
    Scanner input = new Scanner(System.in);

    public Library() {
        this.bookList = new ArrayList<>();
        System.out.print("Please enter the Library name: ");
        this.name = input.nextLine();
        System.out.println();
    }

    public void addBook(Book newBook) {
        this.bookList.add(newBook);
    }

    public void printBooks() {
        if (this.bookList == null) {
            System.out.println("No books to print in the Library!");
        }

        System.out.print("Printing Book from Library - " + this.name + ": \n");
        for (Book book : bookList) {
            System.out.println("|]|] => " + book);
        }
        System.out.println(".............................");
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> titleSearchList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (included(book.title(), title)) {
                titleSearchList.add(book);
            }
        }
        return titleSearchList;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> publisherSearchList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (included(book.publisher(), publisher)) {
                publisherSearchList.add(book);
            }
        }
        return publisherSearchList;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> yearSearchList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (included(Integer.toString(book.year()), String.valueOf(year))) {
                yearSearchList.add(book);
            }
        }
        return yearSearchList;
    }

    public static boolean included(String word, String searched) {
        return word.toLowerCase().contains(searched.trim().toLowerCase());
    }
}



