package package1.notification;

import package1.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order){
        System.out.println("Mobile App Order number: " + order.getOrderNumber() + " has changed it status to: " + order.getOrderStatus());
    }
}
