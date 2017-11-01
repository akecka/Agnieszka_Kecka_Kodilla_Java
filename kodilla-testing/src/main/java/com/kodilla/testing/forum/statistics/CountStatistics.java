package com.kodilla.testing.forum.statistics;

public class CountStatistics {
    Statistics statistics;
    private double userCount;
    private double postCount;
    private double commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public Statistics getStatistics() {
        return statistics;
    }

    public double getUserCount() {
        return userCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public CountStatistics(Statistics statistics){
            this.statistics = statistics;
        }

        public void calculateAdvStatistics(){

            userCount = statistics.usersNames().size();
            postCount = statistics.postsCount();
            commentsCount = statistics.commentsCount();
            if(userCount == 0){
                averagePostsPerUser = 0;
            }else{
                averagePostsPerUser = postCount/userCount;
            }
            if (userCount == 0){
                averageCommentsPerUser = 0;
            }else{
                averageCommentsPerUser= commentsCount/userCount;
            }
            if(postCount == 0){
                averageCommentsPerPost = 0;
            }else{
                averageCommentsPerPost = commentsCount/postCount;
            }

        }

}
