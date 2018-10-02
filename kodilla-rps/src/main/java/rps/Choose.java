package rps;

import java.util.ArrayList;
import java.util.Scanner;

import static rps.Play.play;

public class Choose {
    public static Figure choose(String playerName){
        int position=0;
        ArrayList<Figure> choice = new ArrayList<>();
        choice.add(new Scissors());
        choice.add(new Paper());
        choice.add(new Rock());
        choice.add(new Spock());
        choice.add(new Lizard());
        System.out.println("Choose your figure: 1-Scissors, 2-Paper, 3-Rock, 4-Spock, 5-Lizard\n");

        System.out.println("x - End game");
        System.out.println("n - New game");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.contains("x")){
            System.out.println("Do you really want to end game?");
            if(scan.nextLine().contains("n")){
                choose(playerName);
            }
            else{
                System.exit(0);
            }
        }
        if (input.contains("n")){
            System.out.println("Do you really want to start new game?");
            if(scan.nextLine().contains("n")){
                choose(playerName);
            }
            else{
                play(playerName);
            }
        }
        if (!(input.contains("x")||input.contains("n")||input.matches("1")||input.matches("2")||input.matches("3")||input.matches("4")||input.matches("5"))){
            System.out.println("Please select correct key.");
            choose(playerName);
        }
        if (input.matches("1")||input.matches("2")||input.matches("3")||input.matches("4")||input.matches("5")){
            position = Integer.parseInt(input)-1;
        }
        return choice.get(position);
    }
}
