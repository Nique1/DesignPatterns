package package1.order;

import package1.notification.Observer;

public interface Observable  {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
