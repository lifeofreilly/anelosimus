package com.gmail.lifeofreilly.anelosimus.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * A representation of a collection of SocialProfiles
 * Representation classes describe the entities in the application’s API.
 */
public class SocialProfiles {
    List<SocialProfile> profiles;

    /**
     * Gets a list of social profiles
     *
     * @return list of social profiles
     */
    @JsonProperty("profiles")
    public List<SocialProfile> getProfiles() {
        return profiles;
    }


    /**
     * Sets the list of social profiles
     */
    public void setProfiles(List<SocialProfile> socialProfiles) {
        this.profiles = socialProfiles;
    }

}

