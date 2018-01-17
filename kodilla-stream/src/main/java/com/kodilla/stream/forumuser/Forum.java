package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(001, "wildcat", 'M', 1987, 6, 26, 10));
        usersList.add(new ForumUser(002, "radomi", 'F', 1994, 2, 16, 0));
        usersList.add(new ForumUser(003, "gazi", 'M', 2001, 6, 1, 5));
        usersList.add(new ForumUser(005, "master", 'F', 1977, 4, 26, 20));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }

}
