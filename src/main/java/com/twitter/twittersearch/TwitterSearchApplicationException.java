package com.twitter.twittersearch;

public class TwitterSearchApplicationException extends Exception {

    public TwitterSearchApplicationException(String message,Throwable t){
        super(message,t);
    }

    public TwitterSearchApplicationException(String message){
        super(message);
    }
}
