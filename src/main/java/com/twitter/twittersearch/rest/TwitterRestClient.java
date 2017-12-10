package com.twitter.twittersearch.rest;

import com.twitter.twittersearch.TwitterSearchApplicationException;
import com.twitter.twittersearch.model.Tweet;
import com.twitter.twittersearch.model.Tweets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;

@Component
public class TwitterRestClient {

    private final Twitter twitterApi;

    private static final Logger LOGGER = LoggerFactory.getLogger(TwitterRestClient.class);

    @Autowired
    public TwitterRestClient(Twitter twitterApi) {
        this.twitterApi = twitterApi;
    }

    public Tweets getTweets(String searchString) throws TwitterSearchApplicationException {
        Tweets tweets = new Tweets();
        List<Tweet> tweetList = new ArrayList<>();
        try {
            QueryResult searchResource = twitterApi.search(new Query(searchString));
            searchResource.getTweets().forEach(status -> {
                Tweet tweet = new Tweet();
                tweet.setTweetContent(status.getText());
                tweet.setTweetedBy(status.getUser().getName());
                LOGGER.debug("Adding received response to tweets list {}", tweet.toString());
                tweetList.add(tweet);

            });
            tweets.setTweets(tweetList);

        } catch (TwitterException e) {
            LOGGER.error("Exception occurred while call Twitter rest Api Exception : {}",e);
            throw new TwitterSearchApplicationException("Exception occurred while getting tweets",e);
        }
        return tweets;
    }
}
