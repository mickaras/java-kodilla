package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

interface OrderRepository {
    public boolean createOrder(User user, Item item, int quantity);
}
