package rps;

public class Spock implements Figure{
    private String name = "spock";

    @Override
    public int matchResult(Figure figure) {
        int result = 0;
        String message;
        switch (figure.getName()){
            case "spock":{
                result = 0;
                break;
            }
            case "paper":{
                result = -1;
                break;
            }
            case "scissors":{
                result = 1;
                break;
            }
            case "lizard":{
                result = -1;
                break;
            }
            case "rock":{
                result = 1;
                break;
            }
        }
        return result;
    }
    public String matchMessage(Figure figure) {
        String message="";
        switch (figure.getName()){
            case "spock":{
                message="That's a tie!";
                break;
            }
            case "paper":{
                message="Paper proofs Spock mistake!";
                break;
            }
            case "scissors":{
                message="Spock breaks scissors!";
                break;
            }
            case "lizard":{
                message="Lizard poisons Spock!";
                break;
            }
            case "rock":{
                message="Spock crushes rock!";
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
