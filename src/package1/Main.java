package package1;

import package1.notification.Email;
import package1.notification.MobileApp;
import package1.notification.TextMessage;
import package1.order.Order;
import package1.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(120L, OrderStatus.RECEIVED);

        TextMessage textMessage = new TextMessage();
        Email email = new Email();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(email);
        order.registerObserver(mobileApp);

        order.notifyObservers();
        System.out.println("");
        order.changeOrderStatus(OrderStatus.SEND);

    }
}
