package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class Application {
    public static void main(String[] args){

        HashMap<Item, Double> exampleStuff = new HashMap<>();
        Item apple = new Item("apple", 2.21);
        Item pear = new Item("pear", 3.21);
        Item cherry = new Item("cherry", 6.21);
        exampleStuff.put(apple, 50.0);
        exampleStuff.put(pear, 150.0);
        exampleStuff.put(cherry, 250.0);

        Producer extraFoodShop = new ExtraFoodShop(exampleStuff);
        Producer glutenFreeShop = new GlutenFreeShop(exampleStuff);
        Producer healthyFoodShop = new HealthyFoodShop(exampleStuff);

        OrderRequest order1 = new OrderRequest(new User("Tony", "Nowhere"), extraFoodShop, apple, 5.0);
        OrderRequest order2 = new OrderRequest(new User("Tony", "Nowhere"), glutenFreeShop, pear, 34.0);
        OrderRequest order3 = new OrderRequest(new User("Tony", "Nowhere"), healthyFoodShop, cherry, 263.0);

        order1.process();
        order2.process();
        order3.process();
    }
}
