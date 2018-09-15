package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private int id;
    private String username;
    private char sex;
    private LocalDate birthDate;
    private int postsCount;

    public ForumUser(int id, String username, char sex, LocalDate birthDate, int postsCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return  username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount;
    }
}
