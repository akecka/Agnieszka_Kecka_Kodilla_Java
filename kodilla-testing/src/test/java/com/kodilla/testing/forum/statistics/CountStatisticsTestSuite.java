package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CountStatisticsTestSuite {

    @Test
    public void testCalculateZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        List<String> user = new ArrayList<>();
        user.add("mrsmith");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.commentsCount()).thenReturn(10);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(0, countStatistics.getPostCount(), 0.01);
        assertEquals(10, countStatistics.getCommentsCount(), 0);
        assertEquals(1, countStatistics.getUserCount(), 0);
        assertEquals(0, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(10, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(0, countStatistics.getAveragePostsPerUser(),0);
    }
    @Test
    public void testCalculateThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        List<String> user = new ArrayList<>();
        user.add("mrsmith");
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(1000,countStatistics.getPostCount(), 0.01);
        assertEquals(10, countStatistics.getCommentsCount(), 0);
        assertEquals(1, countStatistics.getUserCount(), 0);
        assertEquals(0.01, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(10, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(1000, countStatistics.getAveragePostsPerUser(),0);
    }

    @Test
    public void testCalculateZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        List<String> user = new ArrayList<>();
        user.add("mrsmith");
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(user);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(0, countStatistics.getCommentsCount(), 0.01);
        assertEquals(1000, countStatistics.getPostCount(), 0);
        assertEquals(1, countStatistics.getUserCount(), 0);
        assertEquals(0, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(0, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(1000, countStatistics.getAveragePostsPerUser(),0);
    }

    @Test
    public void testCalculateCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("mrsmith");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(0.5, countStatistics.getAverageCommentsPerPost(), 0.01);
        assertEquals(20, countStatistics.getPostCount(), 0);
        assertEquals(1, countStatistics.getUserCount(), 0);
        assertEquals(10, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(20, countStatistics.getAveragePostsPerUser(),0);
        assertEquals(10, countStatistics.getCommentsCount(), 0);
    }

    @Test
    public void testCalculateCommentsMoreThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("mrsmith");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(10);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(10, countStatistics.getPostCount(), 0.01);
        assertEquals(20, countStatistics.getCommentsCount(), 0);
        assertEquals(1, countStatistics.getUserCount(), 0);
        assertEquals(2, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(20, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(10, countStatistics.getAveragePostsPerUser(),0);
    }

    @Test
    public void testCalculateZeroUserCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(0, countStatistics.getPostCount(), 0);
        assertEquals(0, countStatistics.getCommentsCount(), 0);
        assertEquals(0, countStatistics.getUserCount(), 0);
        assertEquals(0, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(0, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(0, countStatistics.getAveragePostsPerUser(),0);

    }

    @Test
    public void testCalculateHundredUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int x = 0; x < 100; x++){
            String user = "user" + x;
            userList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);
        CountStatistics countStatistics = new CountStatistics(statisticsMock);
        //When
        countStatistics.calculateAdvStatistics();
        //Then
        assertEquals(100, countStatistics.getUserCount(), 0.01);
        assertEquals(200, countStatistics.getPostCount(), 0);
        assertEquals(100, countStatistics.getCommentsCount(), 0);
        assertEquals(0.5, countStatistics.getAverageCommentsPerPost(),0);
        assertEquals(1, countStatistics.getAverageCommentsPerUser(),0);
        assertEquals(2, countStatistics.getAveragePostsPerUser(),0);
    }
}
