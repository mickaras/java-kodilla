package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] arg){
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new SlippersOrderService(), new SlippersOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
