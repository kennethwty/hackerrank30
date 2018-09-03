package src;

import java.util.Scanner;

/*
    By: Tszyan "Kenneth" Wong

    Task:
        Given a Book class and a Solution class, write a MyBook class that does the following:

        Inherits from Book
        Has a parameterized constructor taking these 3 parameters:
            1. string title
            2. string author
            3. int price
        Implements the Book class' abstract display() method so it prints these 3 lines:
            1. Title, a space, and then the current instance's title.
            2. Author, a space, and then the current instance's author.
            3. Price, a space, and then the current instance's price.

    Input Format:
        You are not responsible for reading any input from stdin.
        The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments).
        It then calls the display method on the Book object.

    Output Format:
        The void display() method should print and label the respective title, author, and price of the MyBook object's instance (with each value on its own line) like so:

        Title: $title
        Author: $author
        Price: $price

    Sample Input:
        The following input from stdin is handled by the locked stub code in your editor:

        The Alchemist
        Paulo Coelho
        248

    Sample Output:
        The following output is printed by your display() method:

        Title: The Alchemist
        Author: Paulo Coelho
        Price: 248
*/
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    int price;
    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }

}

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
