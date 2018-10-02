package com.kodilla.exception.test;

public class ExceptionHandling {

        public static void main(String[] arg){
            SecondChallenge secondChallenge = new SecondChallenge();
            String finish="";
            try {
                finish = secondChallenge.probablyIWillThrowException(1,1.3);
            }
            catch (Exception e){
                System.out.println("No idea what went wrong!");
            }
            finally {
                System.out.println(finish);
            }
        }
}
