package com.twitter.twittersearch.service;

import com.twitter.twittersearch.TwitterSearchApllicationException;
import com.twitter.twittersearch.model.Tweets;
import com.twitter.twittersearch.rest.TwitterRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetsSearchServiceImpl implements TweetsSearchService {

    @Autowired
    private TwitterRestClient twitterRestClient;

    @Override
    public Tweets getTweets(String searchString) throws TwitterSearchApllicationException {
        return twitterRestClient.getTweets(searchString);
    }
}
