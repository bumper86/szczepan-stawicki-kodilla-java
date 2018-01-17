package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postNumber;

    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postNumber = postNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postNumber=" + postNumber +
                '}';
    }
}
