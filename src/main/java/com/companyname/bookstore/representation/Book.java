package com.companyname.bookstore.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    private String id;
    private String authorId;

    public Book() {
       // Needed by Jackson deserialization
    }

    public Book(String id,String authorId) {
        this.id = id;
        this.authorId = authorId;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getAuthorId() {
        return authorId;
    }
}
