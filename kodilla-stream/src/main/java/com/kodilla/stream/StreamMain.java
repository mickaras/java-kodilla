package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.YEARS;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\n7.1\n");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String string1 = "Tekst1";
        String string2 = "Testowy tekst 2";
        System.out.println(poemBeautifier.beautify(string1, (a) -> "***"+a+"***"));
        System.out.println(poemBeautifier.beautify(string2, (a) -> "==="+a.replaceAll("ek", "o")+"==="));
        System.out.println(poemBeautifier.beautify(string2, (a) -> a.toUpperCase()));
        System.out.println(poemBeautifier.beautify(string1, (a) -> "ABC "+a+" ABC"));

        System.out.println("\n7.2\n");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("\n7.3\n");
        Forum forum = new Forum();
        Map<Integer, ForumUser> userMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> YEARS.between(user.getBirthDate(), LocalDate.now()) >= 20)
                .filter(user -> user.getPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));


        System.out.println("# users: " + userMap.size());
        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}