package com.twu.biblioteca;


import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class MenuItemTest {

    @Test
    public void chooseMenuItemOne() {
        MenuItem menuItemOne = new MenuItem("Books Available");
        assertEquals("Books Available", menuItemOne.retrieveNameOfMenuItem());

    }

}
