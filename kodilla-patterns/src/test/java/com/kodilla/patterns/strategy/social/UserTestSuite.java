package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kate = new User("Kate Honnold");
        User george = new User("George Hamilton");
        User alan = new User("Alan Rickman");

        //When
        String kateShouldShare = kate.sharePost();
        System.out.println("Kate should:" + kateShouldShare);
        String georgeShouldShare = george.sharePost();
        System.out.println("George should:" + georgeShouldShare);
        String alanShouldShare = alan.sharePost();
        System.out.println("Alan should:" + alanShouldShare);

        //Then
        Assert.assertEquals("Facebook", kateShouldShare);
        Assert.assertEquals("Twitter", georgeShouldShare);
        Assert.assertEquals("Snapchat", alanShouldShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kate = new Millenials("Kate Honnold");
        User george = new YGeneration("George Hamilton");
        User alan = new ZGeneration("Alan Rickman");
        //When
        String kateShouldShare = kate.sharePost();
        System.out.println("Kate should:" + kateShouldShare);
        kate.setSharingStrategy(new TwitterPublisher());
        kateShouldShare = kate.sharePost();
        System.out.println("Kate now should:" + kateShouldShare);

        String georgeShouldShare = george.sharePost();
        System.out.println("George should:" + georgeShouldShare);
        george.setSharingStrategy(new SnapchatPublisher());
        georgeShouldShare = george.sharePost();
        System.out.println("George now should:" + georgeShouldShare);

        String alanShouldShare = alan.sharePost();
        System.out.println("Alan should:" + alanShouldShare);
        alan.setSharingStrategy(new FacebookPublisher());
        alanShouldShare = alan.sharePost();
        System.out.println("Alan now should:" + alanShouldShare);

        //Then
        Assert.assertEquals("Twitter", kateShouldShare);
        Assert.assertEquals("Snapchat", georgeShouldShare);
        Assert.assertEquals("Facebook", alanShouldShare);

    }

}
