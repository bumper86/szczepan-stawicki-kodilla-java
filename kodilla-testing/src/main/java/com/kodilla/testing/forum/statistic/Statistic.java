package com.kodilla.testing.forum.statistic;

import java.util.List;

public interface Statistic {
    List<String> userNames(); // list of user names
    int postCount(); // total quantity of forum posts
    int commentsCount(); // total quantity of forum comments
}
