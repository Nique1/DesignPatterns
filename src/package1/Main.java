package package1;

import package1.notification.Email;
import package1.notification.MobileApp;
import package1.notification.TextMessage;
import package1.order.Order;
import package1.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(120L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        textMessage.updateOrderStatus(order);
        email.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
    }
}
