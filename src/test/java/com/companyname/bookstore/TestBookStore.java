package com.companyname.bookstore;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestBookStore {

    @Test
    public void testSayHello() throws IOException {
        System.out.println("hello Test");
        BookStore bookStore = new BookStore();
        bookStore.main(new String[]{"en"});
    }
}

