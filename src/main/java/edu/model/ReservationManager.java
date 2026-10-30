package edu.model;

import edu.observer.NotificationManager;
import java.util.HashMap;
import java.util.Map;

public class ReservationManager {
    private Map<String, Reservation> reservations = new HashMap<>();
    private NotificationManager notificationManager = new NotificationManager();

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void createReservation(Reservation reservation) {
        if (reservations.containsKey(reservation.getId())) {
            throw new IllegalArgumentException("Reservation with ID " + reservation.getId() + " already exists.");
        }
        reservations.put(reservation.getId(), reservation);
        notificationManager.notifyObservers("RESERVATION_CREATED",
                "Reservation " + reservation.getId() + " confirmed for " + reservation.getClientName() +
                        " on " + reservation.getTransport().getName() + " ($" + reservation.getFinalCost() + ").");
    }

    public void cancelReservation(String id) {
        Reservation reservation = reservations.get(id);
        if (reservation == null) {
            throw new IllegalArgumentException("Reservation ID " + id + " not found.");
        }
        if (reservation.getStatus() == ReservationStatus.CANCELLED) {
            throw new IllegalStateException("Reservation ID " + id + " is already cancelled.");
        }
        reservation.setStatus(ReservationStatus.CANCELLED);
        notificationManager.notifyObservers("RESERVATION_CANCELLED",
                "Reservation " + id + " for " + reservation.getClientName() + " has been successfully cancelled.");
    }

    public Reservation getReservation(String id) {
        return reservations.get(id);
    }

    public Map<String, Reservation> getAllReservations() {
        return reservations;
    }
}
