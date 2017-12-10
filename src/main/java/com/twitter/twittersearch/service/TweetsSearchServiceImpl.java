package com.twitter.twittersearch.service;

import com.twitter.twittersearch.TwitterSearchApplicationException;
import com.twitter.twittersearch.model.Tweets;
import com.twitter.twittersearch.rest.TwitterRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetsSearchServiceImpl implements TweetsSearchService {

    private final TwitterRestClient twitterRestClient;

    @Autowired
    public TweetsSearchServiceImpl(TwitterRestClient twitterRestClient) {
        this.twitterRestClient = twitterRestClient;
    }

    @Override
    public Tweets getTweets(String searchString) throws TwitterSearchApplicationException {
        return twitterRestClient.getTweets(searchString);
    }
}
