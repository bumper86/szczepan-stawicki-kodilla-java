package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User michael = new ZGeneration("Micheal Sweets");
        User karl = new YGeneration("Karl Urlich");

        //When
        String johnSocialPublisher = john.sharePost();
        System.out.println("John use " + johnSocialPublisher);
        String michaelSocialPublisher = michael.sharePost();
        System.out.println("Michael use " + michaelSocialPublisher);
        String karlSocialPublisher = karl.sharePost();
        System.out.println("Karl use " + karlSocialPublisher);

        //Then
        Assert.assertEquals("Facebook", johnSocialPublisher);
        Assert.assertEquals("Snapchat", michaelSocialPublisher);
        Assert.assertEquals("Twitter", karlSocialPublisher);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User sam = new Millenials("Sam Wit");

        //When
        String samSocialPublisher = sam.sharePost();
        System.out.println("Sam use " + samSocialPublisher);
        sam.setSocialPublisher(new SnapchatPublisher());
        samSocialPublisher = sam.sharePost();
        System.out.println("Sam now use " + samSocialPublisher);

        //Then
        Assert.assertEquals("Snapchat", samSocialPublisher);

    }
}
