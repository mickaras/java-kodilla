package com.kodilla.good.patterns.challenges;

public class KapcieOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Item item, int quantity) {
        return true;
    }
}
