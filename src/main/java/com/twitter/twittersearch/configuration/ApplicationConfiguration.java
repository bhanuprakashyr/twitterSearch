package com.twitter.twittersearch.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Configuration
public class ApplicationConfiguration {

    @Value("${twitter.consumer.key}")
    private String consumerKey;

    @Value("${twitter.consumer.secret}")
    private String consumerSecret;

    @Value("${twitter.consumer.accessToken}")
    private String accessTokenKey;

    @Value("${twitter.consumer.accessTokenSecret}")
    private String accessTokenSecret;

    @Bean
    public ConfigurationBuilder twitterConfiguration(){
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessTokenKey)
                .setOAuthAccessTokenSecret(accessTokenSecret);
        return configurationBuilder;
    }

    @Bean
    public Twitter twitterFactory(){
        return new TwitterFactory(twitterConfiguration().build()).getInstance();
    }

}
