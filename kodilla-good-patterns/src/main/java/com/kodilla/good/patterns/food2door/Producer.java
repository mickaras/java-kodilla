package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public abstract class Producer {
    private String name;
    private HashMap<Item, Integer> stuff;

    public Producer(String name, HashMap<Item, Integer> stuff) {
        this.name = name;
        this.stuff = stuff;
    }

    public String getName() {
        return name;
    }
    public HashMap<Item, Integer> getStuff() {
        return stuff;
    }

    public void setStuff(HashMap<Item, Integer> stuff) {
        this.stuff = stuff;
    }
    public abstract boolean process();
}
