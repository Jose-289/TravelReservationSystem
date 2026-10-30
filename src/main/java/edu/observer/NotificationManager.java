package edu.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String eventType, String message) {
        for (Observer observer : observers) {
            observer.update(eventType, message);
        }
    }
}
