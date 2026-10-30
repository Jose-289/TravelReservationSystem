package edu.observer;

import java.util.ArrayList;
import java.util.List;

public class ActivityLogListener implements Observer {
    private List<String> logHistory = new ArrayList<>();

    @Override
    public void update(String eventType, String message) {
        String logEntry = "[ACTIVITY LOG] [" + eventType + "] " + message;
        logHistory.add(logEntry);
        System.out.println(logEntry);
    }

    public List<String> getLogHistory() {
        return logHistory;
    }
}
