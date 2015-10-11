package com.gmail.lifeofreilly.anelosimus.resources;

import com.codahale.metrics.annotation.Timed;

import com.gmail.lifeofreilly.anelosimus.api.SocialProfiles;
import com.gmail.lifeofreilly.anelosimus.core.SocialSpider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Provides a resource which responds to GET requests and provides a json representation of a KeyRepresentation.
 * Resource classes model the resources exposed in the RESTful API.
 */
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class AnelosimusResource {
    private final String baseURL;

    /**
     * The sole constructor for a AnelosimusViewResource object
     *
     * @param baseURL the base url for additional address information
     */
    public AnelosimusResource(String baseURL) {
        this.baseURL = baseURL;
    }

    /**
     * Generates a new SocialProfiles representation when a GET request is made
     *
     * @return the SocialProfiles
     */
    @GET
    @Timed
    public SocialProfiles getProfiles() {
        SocialProfiles profiles = new SocialProfiles();
        profiles.setProfiles(new SocialSpider().getProfilesFromURL());
        return profiles;
    }

}
