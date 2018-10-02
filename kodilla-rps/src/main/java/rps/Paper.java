package rps;

public class Paper implements Figure {
    private String name = "paper";
    @Override
    public int matchResult(Figure figure) {
        int result = 0;
        String message;
        switch (figure.getName()){
            case "spock":{
                result = 1;
                break;
            }
            case "paper":{
                result = 0;
                break;
            }
            case "scissors":{
                result = -1;
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
                message="Paper proofs Spock mistake!";
                break;
            }
            case "paper":{
                message="That's a tie!";
                break;
            }
            case "scissors":{
                message="Scissors cut paper!";
                break;
            }
            case "lizard":{
                message="Lizard eats paper!";
                break;
            }
            case "rock":{
                message="Paper wraps rock!";
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
