package rps;

import java.util.Scanner;

import static rps.Choose.choose;

public  class Play {
    public static void play(String playerName){
        int numMatches=0 ,i=0;
        Scanner scanner = new Scanner(System.in);
        int easyScore=0;
        int normalScore=0;
        int hardScore=0;
        System.out.println("Please input desired matches:");
        try {
            numMatches = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("That's not a number!");
            play(playerName);
        }
        while(i<numMatches){
            Figure figure = choose(playerName);
            System.out.println("You've chosen "+figure.getName());
            EasyGame easyGame = new EasyGame(figure);
            easyScore += easyGame.result(figure);
            NormalGame normalGame = new NormalGame();
            normalScore += normalGame.result(figure);
            HardGame hardGame = new HardGame(figure);
            hardScore += hardGame.result(figure);
            System.out.println("\n"+playerName+" score after "+(i+1)+" round:"+"\nEasy game: "+easyScore+"\nNormal game: "+normalScore+"\nHard game: "+hardScore+"\n");
            i++;
        }
        System.out.println("");
    }
}
