package rps;

import java.util.Scanner;

import static rps.Play.play;

public class RpsRunner {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String playerName = scanner.next();
        while(true){
            play(playerName);
        }

    }

}
