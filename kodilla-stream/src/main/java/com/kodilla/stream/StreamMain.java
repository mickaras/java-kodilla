package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;



public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String string1 = "Tekst1";
        String string2 = "Testowy tekst 2";
        System.out.println(poemBeautifier.beautify(string1, (a) -> "***"+a+"***"));
        System.out.println(poemBeautifier.beautify(string2, (a) -> "==="+a.replaceAll("ek", "o")+"==="));
        System.out.println(poemBeautifier.beautify(string2, (a) -> a.toUpperCase()));
        System.out.println(poemBeautifier.beautify(string1, (a) -> "ABC "+a+" ABC"));


    }
}