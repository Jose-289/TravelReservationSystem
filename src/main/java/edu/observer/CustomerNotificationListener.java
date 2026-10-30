package edu.observer;

public class CustomerNotificationListener implements Observer {
    public void update(String eventType, String message) {
        System.out.println("[CUSTOMER NOTIFICATION] [" + eventType + "] Sent to client: " + message);
    }
}
