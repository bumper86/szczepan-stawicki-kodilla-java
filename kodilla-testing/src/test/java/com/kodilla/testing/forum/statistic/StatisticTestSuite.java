package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void testCalculateStaticticNoPosts(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        lists.add("John Smith");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(0);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);
        System.out.println(calculateStatistic.showStatistic());

        //Then
        Assert.assertEquals(0,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(0, calculateStatistic.averagePostPerUser);
    }
    @Test
    public void testCalculateStaticticPosts(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        lists.add("John Smith");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(1000);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(0,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(1000, calculateStatistic.averagePostPerUser);
    }
    @Test
    public void testCalculateStaticticNoComments(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        lists.add("John Smith");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(100);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(0,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(100, calculateStatistic.averagePostPerUser);
    }

    @Test
    public void testCalculateStaticticCommentsLessThenPosts(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        lists.add("John Smith");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(50);
        when(statisticMock.postCount()).thenReturn(1000);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(0.05,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(50, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(1000, calculateStatistic.averagePostPerUser);
    }

    @Test
    public void testCalculateStaticticCommentsMoreThenPosts(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        lists.add("John Smith");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(50);
        when(statisticMock.postCount()).thenReturn(10);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(5,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(50, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(10, calculateStatistic.averagePostPerUser);
    }

    @Test
    public void testCalculateStaticticNoUsers(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(0);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(0,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(0, calculateStatistic.averagePostPerUser);
    }

    @Test
    public void testCalculateStaticticHundredUser(){
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<String>();
        for(int i=0; i < 100; i++){
            lists.add("aa");
        }
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(50);
        when(statisticMock.postCount()).thenReturn(1000);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.claculateAdvStatistic(statisticMock);

        //Then
        Assert.assertEquals(0.05,calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0.5, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(10, calculateStatistic.averagePostPerUser);
    }
}
