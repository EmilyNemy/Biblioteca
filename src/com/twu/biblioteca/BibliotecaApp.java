package com.twu.biblioteca;

import java.awt.*;
import java.util.*;


public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Biblioteca");
        System.out.println();

        System.out.println("Below is our Menu:");
        System.out.println(new MenuItem("1 - Books Available").retrieveNameOfMenuItem());
        System.out.println(new MenuItem("2 - Reserve a book").retrieveNameOfMenuItem());
        System.out.println(new MenuItem("3 - Membership details").retrieveNameOfMenuItem());
        System.out.println("");

        System.out.println("Movie Library Menu");
        System.out.println(new MenuItem("4 - Movies").retrieveNameOfMenuItem());
        System.out.println(new MenuItem("5 - To exit the program").retrieveNameOfMenuItem());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your preferred option: ");


        while (true && !userInput.equals(4)){
            int positionOfMenuItem = userInput.nextInt();
            BookBank bookInStore = new BookBank();
            if (positionOfMenuItem == 1)
                System.out.println(String.valueOf(bookInStore.storeForAvailableBooks()));

            else if (positionOfMenuItem == 2) {
                System.out.println("Enter the name of the book you want to reserve.");
                userInput.nextLine();
                String nameOfBookFromUser = userInput.nextLine();

                BookBank bookBank = new BookBank();


                existenceOfBook(bookInStore, nameOfBookFromUser, bookBank);
            }
            else if (positionOfMenuItem == 3)
                System.out.println("Please talk to a librarian. Thank you");

            else if(positionOfMenuItem == 4) {
            }
            else if (positionOfMenuItem == 5)
                break;

            else
                System.out.println("Select a valid option!!");
        }
    }

    private static void existenceOfBook(BookBank bookInStore, String nameOfBookFromUser, BookBank bookBank) {
        if(bookBank.checkIfBookExistsInLibrary(new Book(nameOfBookFromUser), bookInStore.storeForAvailableBooks())==true) {
            reserveBook(nameOfBookFromUser);
        }else {
            System.out.println("Sorry we don't have that book yet.");
        }
    }

    private static void reserveBook(String nameOfBookFromUser) {
        Book bookEntered = new Book(nameOfBookFromUser);
        if(bookEntered.checkAvailabilityOfBook()==true){
            System.out.println("Sorry, this book is reserved");
        }else {
            System.out.print("Thank You! Enjoy the book.");
        }
    }


}
