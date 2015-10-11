package com.gmail.lifeofreilly.anelosimus.core;

import com.gmail.lifeofreilly.anelosimus.api.SocialProfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.twitter.Extractor;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SocialSpider {


    public List<SocialProfile> getProfilesFromURL() {
        List<SocialProfile> socialProfiles = new ArrayList<>();
        Document doc;

        /*
        try {
           doc = Jsoup.connect("http://100worstpeopleontwitter.tumblr.com/").get();

            List<String> names;
            Extractor extractor = new Extractor();
            names = extractor.extractMentionedScreennames(doc.text());

            for (String name : names) {
                System.out.println("Mentioned @" + name);
                socialProfiles.add(new SocialProfile(name, "https://twitter.com/" + name));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        socialProfiles.add(new SocialProfile("SoVeryBritish", "https://twitter.com/" + "SoVeryBritish"));
        socialProfiles.add(new SocialProfile("touchlinedrama", "https://twitter.com/" + "touchlinedrama"));

        return socialProfiles;
    }
}
