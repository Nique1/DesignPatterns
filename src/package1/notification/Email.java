package package1.notification;

import package1.order.Order;

public class Email implements Observer{
    @Override
    public void update(Order order){
        System.out.println("Email Order number: " + order.getOrderNumber() + " has changed it status to: " + order.getOrderStatus());
    }
}
