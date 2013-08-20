package com.twu.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 8/7/13
 * Time: 2:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem {

    private String nameOfMenuItem;

    public MenuItem(String nameOfMenuItem) {
        this.nameOfMenuItem = nameOfMenuItem;
    }

    public String retrieveNameOfMenuItem(){
        return nameOfMenuItem;
    }
}
