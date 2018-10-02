package rps;

import java.util.ArrayList;
import java.util.Random;

public class NormalGame {
    private ArrayList<Figure> figures = new ArrayList<>();
    private Random gen = new Random();
    public NormalGame(){
        figures.add(new Scissors());
        figures.add(new Rock());
        figures.add(new Paper());
        figures.add(new Spock());
        figures.add(new Lizard());
    }

    public int result(Figure figure){
        Figure opponent = figures.get(gen.nextInt(figures.size()));
        System.out.println("On normal mode result: "+figure.matchMessage(opponent));
        return figure.matchResult(opponent);

    }
}
