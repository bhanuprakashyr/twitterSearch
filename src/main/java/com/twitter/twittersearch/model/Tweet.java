package com.twitter.twittersearch.model;

public class Tweet {
    private String tweetContent;
    private String tweetedBy;

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetContent='" + tweetContent + '\'' +
                ", tweetedBy='" + tweetedBy + '\'' +
                '}';
    }

    public String getTweetedBy() {
        return tweetedBy;
    }

    public void setTweetedBy(String tweetedBy) {
        this.tweetedBy = tweetedBy;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }
}
