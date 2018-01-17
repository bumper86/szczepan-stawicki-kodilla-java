package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

         Map<Integer, ForumUser> theResultOfForumUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthDay(), LocalDate.now()).getYears() > 20)
                .filter(forumUser -> forumUser.getPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

                theResultOfForumUsers.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);
    }
}
