package com.twitter.twittersearch.service;

import com.twitter.twittersearch.rest.TwitterRestClient;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class TweetsSearchServiceImplTest {

    private TweetsSearchServiceImpl tweetsSearchService;

    @Mock
    private TwitterRestClient twitterRestClient;

    @Before
    public void initialize(){
        MockitoAnnotations.initMocks(this);
        tweetsSearchService = new TweetsSearchServiceImpl(twitterRestClient);
    }

    @Test
    public void shouldCallTheRestClient() throws Exception {
        tweetsSearchService.getTweets("xyz");
        verify(twitterRestClient,times(1)).getTweets(Matchers.anyString());
    }

}