package package1.notification;

import package1.order.Order;

public class TextMessage {
    public void updateOrderStatus(Order order){
        System.out.println("SMS Order number: " + order.getOrderNumber() + " has changed it status to: " + order.getOrderStatus());
    }
}
