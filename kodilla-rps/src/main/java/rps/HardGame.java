package rps;

import java.util.ArrayList;
import java.util.Random;

public class HardGame {
    private ArrayList<Figure> figures = new ArrayList<>();
    private Random gen = new Random();
    public HardGame(Figure figure){
        figures.add(new Scissors());
        figures.add(new Rock());
        figures.add(new Paper());
        figures.add(new Spock());
        figures.add(new Lizard());
        int size = figures.size();
        for (int i=0;i<size;i++) {
            if (figures.get(i).matchResult(figure)>0){
                figures.add(figures.get(i));
                figures.add(figures.get(i));
            }
        }
    }
    public int result(Figure figure){
        Figure opponent = figures.get(gen.nextInt(figures.size()));
        System.out.println("On hard mode result: "+figure.matchMessage(opponent));
        return figure.matchResult(opponent);
    }
}


