package package1.notification;

import package1.order.Order;

public class Email {
    public void updateOrderStatus(Order order){
        System.out.println("Email Order number: " + order.getOrderNumber() + " has changed it status to: " + order.getOrderStatus());
    }
}
