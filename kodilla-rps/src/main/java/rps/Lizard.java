package rps;

public class Lizard implements Figure{
    private String name = "lizard";

    @Override
    public int matchResult(Figure figure) {
        int result = 0;
        switch (figure.getName()){
            case "spock":{
                result = 1;
                break;
            }
            case "paper":{
                result = 1;
                break;
            }
            case "scissors":{
                result = -1;
                break;
            }
            case "lizard":{
                result = 0;
                break;
            }
            case "rock":{
                result = -1;
                break;
            }
        }
        return result;
    }
    public String matchMessage(Figure figure){
        String message="";
        switch (figure.getName()){
            case "spock":{
                message="Lizard poisons Spock!";

                break;
            }
            case "paper":{
                message="Lizard eats paper!";
                break;
            }
            case "scissors":{
                message="Scissors cut lizard!";
                break;
            }
            case "lizard":{
                message="That's a tie!";
                break;
            }
            case "rock":{
                message="Rock crushes lizard!";
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


