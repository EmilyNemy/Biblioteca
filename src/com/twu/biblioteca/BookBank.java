package com.twu.biblioteca;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 8/8/13
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookBank {
    public HashMap storeForAvailableBooks() {
        HashMap books = new HashMap();

        books.put(001, new Book("Tales of the two cities").titleOfBook());
        books.put(002, new Book("Wothering heights").titleOfBook());
        books.put(003, new Book("Pride and Prejudice").titleOfBook());

        return books;
    }

    public boolean checkIfBookExistsInLibrary(Book book, HashMap bookStore){
        Set set = bookStore.entrySet();
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            if (me.getValue().equals(book.titleOfBook())){
                return true;
            }else
                return false;
        }
        return false;
    }
}
