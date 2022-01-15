package com.companyname.bookstore.resource;

import com.codahale.metrics.annotation.Timed;
import com.companyname.bookstore.representation.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    private final String version;

    public BookResource(String version){
        this.version = version;
    }

    @GET
    @Timed
    @Path("/addBook")
    public Book addBook(@QueryParam("id") String id, @QueryParam("authorId") String authorId){
        return new Book(id,authorId);
    }
}
