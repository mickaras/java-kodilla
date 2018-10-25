package com.kodilla.good.patterns.food2door;

public class MailService implements OrderInformation {
    public void inform(User user){
        System.out.println("Order confirmation sent to "+user.getName());
    }
}
