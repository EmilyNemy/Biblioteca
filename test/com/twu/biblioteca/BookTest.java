package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void viewListOfBooksInLibrary(){
        HashMap bookStore = new HashMap();
        bookStore.put(001, new Book("Tales of the two cities").titleOfBook());
        bookStore.put(002, new Book("Wothering heights").titleOfBook());
        bookStore.put(003, new Book("Pride and Prejudice").titleOfBook());
        BookBank bookList = new BookBank();
        assertEquals(bookStore, bookList.storeForAvailableBooks());
    }
    @Test
    public void shouldReserveBook(){
        Book bookOne = new Book("Tales of the two cities");
        assertEquals(true, bookOne.reserveBook());
    }
    @Test
    public void checkAvailabilityOfBook(){
        Book book = new Book("Tales of the two cities");
        assertEquals(false,book.checkAvailabilityOfBook());
    }
    @Test
    public void checkForExistenceOfBook(){
        HashMap bookStore = new HashMap();
        bookStore.put(001, new Book("Tales of the two cities" ).titleOfBook());
        bookStore.put(002, new Book("Wothering heights").titleOfBook());
        bookStore.put(003, new Book("Pride and Prejudice").titleOfBook());
        BookBank bookList = new BookBank();
        Book book = new Book("Tales of the two cities" );
        assertEquals(true,bookList.checkIfBookExistsInLibrary(book, bookStore));
    }
}
