package edu.model;

public class Reservation {
    private String id;
    private String clientName;
    private Transport transport;
    private double finalCost;
    private ReservationStatus status;

    public Reservation(String id, String clientName, Transport transport, double finalCost) {
        this.id = id;
        this.clientName = clientName;
        this.transport = transport;
        this.finalCost = finalCost;
        this.status = ReservationStatus.CONFIRMED;
    }

    public String getId() { return id; }
    public String getClientName() { return clientName; }
    public Transport getTransport() { return transport; }
    public double getFinalCost() { return finalCost; }
    public ReservationStatus getStatus() { return status; }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
