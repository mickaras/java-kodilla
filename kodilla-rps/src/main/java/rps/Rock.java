package rps;

public class Rock implements Figure{
    private String name = "rock";
    @Override
    public int matchResult(Figure figure) {
        int result = 0;
        switch (figure.getName()){
            case "spock":{
                result = -1;
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
                result = 1;
                break;
            }
            case "rock":{
                result = 0;
                break;
            }
        }
        return result;
    }
    public String matchMessage(Figure figure) {
        String message="";
        switch (figure.getName()){
            case "spock":{
                message="Spock crushes rock!";
                break;
            }
            case "paper":{
                message="Paper wraps rock!";
                break;
            }
            case "scissors":{
                message="Rock crushes scissors!";
                break;
            }
            case "lizard":{
                message="Rock crushes lizard!";
                break;
            }
            case "rock":{
                message="That's a tie!";
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

