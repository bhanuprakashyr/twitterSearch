package com.twitter.twittersearch.rest;

import com.twitter.twittersearch.TwitterSearchApplicationException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

public class TwitterRestClientTest {

    @Mock
    private Twitter twitter;

    private TwitterRestClient twitterRestClient;

    @Before
    public void initialize() {
        MockitoAnnotations.initMocks(this);
        twitterRestClient = new TwitterRestClient(twitter);
    }

    @Test(expected = TwitterSearchApplicationException.class)
    public void shouldHandleExceptionsThrownFromLibrary() throws Exception {
        //given
        when(twitter.search(any())).thenThrow(TwitterException.class);

        //when
        twitterRestClient.getTweets("xyz");
    }
}