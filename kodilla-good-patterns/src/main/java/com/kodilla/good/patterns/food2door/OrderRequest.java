package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private User user;
    private Producer producer;
    private Item item;
    private double quantity;

    public OrderRequest(User user, Producer producer, Item item, double quantity) {
        this.user = user;
        this.producer = producer;
        this.item = item;
        this.quantity = quantity;
    }

    public void process(){
        producer.process(new OrderRequest(user, producer, item, quantity));
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public double getQuantity() {
        return quantity;
    }
    public Producer getProducer(){
        return producer;
    }
}
