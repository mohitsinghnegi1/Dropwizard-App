package com.companyname.bookstore;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

public class BookStore extends Application<ServerConfiguration> {
    public static void main(String[] args) throws Exception {

        new BookStore().run(args);

    }

    @Override
    public void run(ServerConfiguration configuration, Environment environment) throws Exception {

    }

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }
}






