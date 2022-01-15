package com.companyname.bookstore;

import com.companyname.bookstore.health.VersionHealthCheck;
import com.companyname.bookstore.resource.BookResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BookStore extends Application<ServerConfiguration> {
    public static void main(String[] args) throws Exception {
        System.out.println("inside main function");
        new BookStore().run(args);
    }

    @Override
    public void run(ServerConfiguration configuration, Environment environment) {
        try {
            environment.healthChecks().register("version", new VersionHealthCheck(configuration.getVersion()));
            environment.jersey().register(new BookResource(configuration.getVersion()));
        }catch (Exception exception){
            System.out.println("Exception In run : " + exception);
        }
    }

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }
}






