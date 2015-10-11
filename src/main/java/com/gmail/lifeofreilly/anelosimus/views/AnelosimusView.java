package com.gmail.lifeofreilly.anelosimus.views;

import com.gmail.lifeofreilly.anelosimus.api.SocialProfiles;
import io.dropwizard.views.View;

public class AnelosimusView extends View {
    public final SocialProfiles profilesRepresentation;

    public AnelosimusView(SocialProfiles socialProfiles) {
        super("/anelosimus.ftl");
        this.profilesRepresentation = socialProfiles;
    }

    public SocialProfiles getSocialProfiles() {
        return profilesRepresentation;
    }

}
