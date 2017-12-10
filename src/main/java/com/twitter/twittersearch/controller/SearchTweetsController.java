package com.twitter.twittersearch.controller;

import com.twitter.twittersearch.TwitterSearchApllicationException;
import com.twitter.twittersearch.model.Tweets;
import com.twitter.twittersearch.service.TweetsSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("searchTweets")
public class SearchTweetsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchTweetsController.class);

    @Autowired
    private TweetsSearchService tweetsSearchService;

    @RequestMapping(value = "/{searchString}", method = RequestMethod.GET, produces = "application/json")
    public Tweets searchForTweets(@PathVariable String searchString) throws TwitterSearchApllicationException {
        LOGGER.info("Received Request : search for string {}", searchString);
        return tweetsSearchService.getTweets(searchString);
    }
}
