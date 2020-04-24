package com.codepath.apps.restclienttemplate.models;

import androidx.room.Embedded;

public class TweetWithUser {

    // @Embedded notation flattens the properties of the User object into the object
    @Embedded
    User user;

    @Embedded(prefix = "tweet_")
    Tweet tweet;
}
