package com.twitter.twittersearch.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yeriyub on 12/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class TwitterRestClientTest {

    @Before
    public void initialize(){
        RestTemplate restTemplate = new RestTemplate();

    }

    @Test
    public void testCall(){

    }
}