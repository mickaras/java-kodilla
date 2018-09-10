package com.kodilla.testing.forum.statistics;

public class StatCalculator{
    private int numUsers;
    private int numPosts;
    private int numComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public StatCalculator(Statistics stats) {
        this.numUsers = stats.usersNames().size();
        this.numPosts = stats.postsCount();
        this.numComments = stats.commentsCount();
        calculateAdvStatistics();
    }

    public void calculateAdvStatistics(){
        if(numUsers>0) {
            avgPostsPerUser = (double)numPosts / numUsers;
            avgCommentsPerUser = (double)numComments / numUsers;
        }
        else{
            avgPostsPerUser = 0;
            avgCommentsPerUser =0;
        }
        if(numPosts>0) {
            avgCommentsPerPost = (double)numComments / numPosts;
        }
        else{
            avgCommentsPerPost =0;
        }
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void showStats(){
        System.out.println("Posts per user: "+avgPostsPerUser+"/nComments per user: "+avgCommentsPerUser+"/n Comments per post: "+avgCommentsPerPost);

    }
}
