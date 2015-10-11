package com.gmail.lifeofreilly.anelosimus;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class AnelosimusConfiguration extends Configuration {

    @NotEmpty
    private String baseURL;

    @JsonProperty
    public String getBaseURL() {
        return baseURL;
    }

    @JsonProperty
    public void setBaseURL(String name) {
        this.baseURL = name;
    }
}
