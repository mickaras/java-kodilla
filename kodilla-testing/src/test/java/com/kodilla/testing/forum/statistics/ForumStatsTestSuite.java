package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {

    @Test
    public void testMockNoPosts(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(5);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(0);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 0,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),1.0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 0,0);
    }

    @Test
    public void testMock1000Posts(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(5);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(1000);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 0.005,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),1.0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 200,0);
    }

    @Test
    public void testMockNoComments(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(5);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(0);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(10);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 0,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 2,0);
    }

    @Test
    public void testMockLessCommentsThanPosts(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(5);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(2);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 2.5,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),1.0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 0.4,0);
    }

    @Test
    public void testMockMoreCommentsThanPosts(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(5);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(10);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 0.5,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),1.0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 2,0);
    }

    @Test
    public void testMockNoUsers(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(0);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(0);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 0,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),0,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 0,0);
    }

    @Test
    public void testMock100Users(){
        ArrayList<String> mockArrayList = mock(ArrayList.class);
        when(mockArrayList.size()).thenReturn(100);

        Statistics statsMock = mock(Statistics.class);
        when(statsMock.commentsCount()).thenReturn(5);
        when(statsMock.usersNames()).thenReturn(mockArrayList);
        when(statsMock.postsCount()).thenReturn(2);
        StatCalculator statCalculator = new StatCalculator(statsMock);


        Assert.assertEquals(statCalculator.getAvgCommentsPerPost(), 2.5,0);
        Assert.assertEquals(statCalculator.getAvgCommentsPerUser(),0.05,0);
        Assert.assertEquals(statCalculator.getAvgPostsPerUser(), 0.02,0);
    }
}
