package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {
    private User user = new User("Jan", "Knot");
    private Item item = new Item("Kapcie", 10.50);
    private int quantity = 10;
    public OrderRequest retrieve(){
        return new OrderRequest(user, item, quantity);
    }
}
