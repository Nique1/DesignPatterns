package package1.notification;

import package1.order.Order;

public interface Observer {
    void update(Order order);
}
