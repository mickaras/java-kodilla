package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Phoebe Pearson",'F', LocalDate.parse("1987-11-11"),22));
        userList.add(new ForumUser(2,"Dylan Murphy",'M',LocalDate.parse("1998-09-16"),32));
        userList.add(new ForumUser(3,"Morgan Walsh",'M',LocalDate.parse("2002-01-01"),12));
        userList.add(new ForumUser(4,"Aimee Murphy",'F',LocalDate.parse("1987-02-02"),12));
        userList.add(new ForumUser(5,"Ryan Talley",'M',LocalDate.parse("1987-03-03"),0));
        userList.add(new ForumUser(6,"Madelyn Carson",'F',LocalDate.parse("1987-04-04"),12));
        userList.add(new ForumUser(7,"Giancarlo Guerrero",'M',LocalDate.parse("1987-05-05"),12));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }


}
