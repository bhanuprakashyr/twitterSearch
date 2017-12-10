package com.twitter.twittersearch.service;

import com.twitter.twittersearch.TwitterSearchApllicationException;
import com.twitter.twittersearch.model.Tweets;

public interface TweetsSearchService {
    Tweets getTweets(String searchString) throws TwitterSearchApllicationException;
}
