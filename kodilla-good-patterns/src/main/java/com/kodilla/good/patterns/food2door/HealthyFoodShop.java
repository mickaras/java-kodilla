package com.kodilla.good.patterns.food2door;

import java.util.HashMap;

public class HealthyFoodShop implements Producer{
    private HashMap<Item, Double> dataBase;

    public HealthyFoodShop(HashMap<Item, Double> dataBase) {
        this.dataBase = dataBase;
    }
    public void process(OrderRequest orderRequest) {
        User user = orderRequest.getUser();
        Item item = orderRequest.getItem();
        double quantity = orderRequest.getQuantity();

        System.out.println(user.getName()+" ordered "+quantity+"kg  "+item.getName()+" for $"+quantity*item.getPrice()+" to "+user.getAddress());
        if(quantity<dataBase.get(item)){
            dataBase.replace(item, dataBase.get(item)-quantity);
            OrderInformation orderInformation = new MailService();
            orderInformation.inform(user);
        }
        else{
            System.out.println("But there's only "+dataBase.get(item)+"kg of "+item.getName()+" at Healthy Food Shop");
        }

    }
}
