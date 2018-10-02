package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class ExtraFoodShop extends Producer {
    public ExtraFoodShop(String name, HashMap<Item, Integer> stuff) {
        super(name, stuff);
        name = "Extra food shop";

    }

    @Override
    public boolean process() {
        return false;
    }
}
