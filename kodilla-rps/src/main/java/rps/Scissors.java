package rps;

import java.util.ArrayList;

public class Scissors implements Figure{
    private String name = "scissors";
    @Override
    public int matchResult(Figure figure) {
        int result = 0;
        switch (figure.getName()){
            case "spock":{
                result = -1;
                break;
            }
            case "paper":{
                result = 1;
                break;
            }
            case "scissors":{
                result = 0;
                break;
            }
            case "lizard":{
                result = 1;
                break;
            }
            case "rock":{
                result = -1;
                break;
            }
        }
        return result;
    }
    public String matchMessage(Figure figure) {
        int result = 0;
        String message="";
        switch (figure.getName()){
            case "spock":{
                message="Spock breaks scissors!";
                break;
            }
            case "paper":{
                message="Scissors cut paper!";
                break;
            }
            case "scissors":{
                message="That's a tie!";
                break;
            }
            case "lizard":{
                message="Scissors cut lizard!";
                break;
            }
            case "rock":{
                message="Rock crushes scissors!";
                break;
            }
        }
        return message;
    }

    @Override
    public String getName() {
        return name;
    }
}
