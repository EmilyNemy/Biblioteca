package com.twu.biblioteca;

public class Book {
    private String title;
    private boolean status;

    public Book(String title) {
        this.title = title;

    }

    public String titleOfBook(){
        return title;
    }

    public boolean reserveBook() {
        this.status = true;
        return true;

    }

    public boolean checkAvailabilityOfBook() {
        if(this.status == true){
            return true;
        }
        return false;
    }

}
