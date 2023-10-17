package package1.notification;

import package1.order.Order;

public class MobileApp implements Observer{
    @Override
    public void update(Order order){
        System.out.println("Mobile App Order number: " + order.getOrderNumber() + " has changed it status to: " + order.getOrderStatus());
    }
}
