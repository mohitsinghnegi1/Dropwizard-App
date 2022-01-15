package com.companyname.bookstore;

import org.junit.jupiter.api.Test;

public class TestBookStore {

    @Test
    public void testMain() throws Exception {
        System.out.println("Inside TestMain");
        BookStore bookStore = new BookStore();
        bookStore.main(new String[]{"en"});
    }
}

