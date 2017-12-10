package com.twitter.twittersearch.service;

import com.twitter.twittersearch.TwitterSearchApplicationException;
import com.twitter.twittersearch.model.Tweets;

public interface TweetsSearchService {
    Tweets getTweets(String searchString) throws TwitterSearchApplicationException;
}
