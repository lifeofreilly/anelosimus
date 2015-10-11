package com.gmail.lifeofreilly.anelosimus.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A representation of a social profile and associated information.
 * Representation classes describe the entities in the application’s API.
 */
public class SocialProfile {
    private final String handle;
    private final String publicProfile;

    /**
     * The sole constructor for a SocialProfile object
     *
     * @param handle  the user's handle
     * @param publicProfile link to public publicProfile
     */
    public SocialProfile(String handle, String publicProfile) {
        this.handle = handle;
        this.publicProfile = publicProfile;
    }

    /**
     * Gets the handle or name of the user
     *
     * @return handle or name of the user
     */
    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    /**
     * Gets the link to public profile
     *
     * @return link to public profile
     */
    @JsonProperty("publicProfile")
    public String getPublicProfile() {
        return publicProfile;
    }

}

