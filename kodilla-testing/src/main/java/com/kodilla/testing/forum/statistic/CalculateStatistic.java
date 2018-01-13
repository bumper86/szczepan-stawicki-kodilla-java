package com.kodilla.testing.forum.statistic;

public class CalculateStatistic {
    int userCount;
    int postsCount;
    int commentCount;
    double averagePostPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void claculateAdvStatistic(Statistic statistic) {
        userCount = statistic.userNames().size();
        postsCount = statistic.postCount();
        commentCount = statistic.commentsCount();
        if (userCount==0){
            averagePostPerUser = 0;
            averageCommentsPerPost = 0;
            averageCommentsPerUser = 0;
        } else {
            if (postsCount == 0) {
                averagePostPerUser = 0;
            } else {
                averagePostPerUser = postsCount / userCount;
            }
            if (commentCount == 0) {
                averageCommentsPerPost = 0;
                averageCommentsPerUser = 0;
            } else {
                averageCommentsPerUser = commentCount / userCount;
                averageCommentsPerPost = commentCount / postsCount;
            }
        }
    }

    public void showStatistic(){
        System.out.println("Average comments per posts is: " + averageCommentsPerPost);
        System.out.println("Average comments per User is: " + averageCommentsPerUser);
        System.out.println("Average posts per User is: " + averagePostPerUser);
    }


}
