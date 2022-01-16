package com.companyname.bookstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import javax.validation.constraints.NotEmpty;

public class ServerConfiguration extends Configuration {

    @NotEmpty
    private String version;

    @JsonProperty
    public String getVersion() {
        return version;
    }

    @JsonProperty
    public void setVersion(String version) {
        this.version = version;
    }
}
