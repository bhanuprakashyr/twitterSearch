package com.twitter.twittersearch.model;

import java.util.List;

/**
 * Created by yeriyub on 12/10/17.
 */
public class Tweets {
    private List<Tweet> tweets;

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }
}
