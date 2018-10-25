package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    private User user;
    private Producer producer;
    private Item item;
    private double quantity;

    public OrderRequestRetriever(User user, Producer producer, Item item, double quantity) {
        this.user = user;
        this.producer = producer;
        this.item = item;
        this.quantity = quantity;
    }

    public OrderRequest retrive(){
        return new OrderRequest(user, producer, item, quantity);
    }
}
