package com.companyname.bookstore;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class BookStore{
    public static void main(String[] args) throws IOException {
        if(args.length>0){
            System.out.println("args: "+ args[0]);
            String lang = args[0];
            InputStream resourceStream = BookStore.class.getClassLoader().getResourceAsStream(lang + ".txt");
            assert resourceStream != null;
            BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(resourceStream, StandardCharsets.UTF_8));

            System.out.println(bufferedInputStream.readLine());





        }
//        Method m[] = BookStore.class.getDeclaredMethods(); Get a list of method that is declead in this class
//        for (int i = 0; i < m.length; i++)
//        {
//            System.out.println(m[i].toString());
//        }


        System.out.println("Hello world");
    }
}






