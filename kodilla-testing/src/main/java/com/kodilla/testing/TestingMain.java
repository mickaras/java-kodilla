package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error!");
        }

        System.out.println("Test 6.2");
        Calculator calc = new Calculator();
        if (calc.add(2,2)==4){
            System.out.println("Add OK");
        }
        else{
            System.out.println("Add Failed");
        }
        if (calc.substract(2,2)==0){
            System.out.println("Substract OK");
        }
        else{
            System.out.println("Substract Failed");
        }

    }
}
