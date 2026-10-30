package edu.model;

public abstract class Transport {
    private String id;
    private String name;
    private double baseFare;

    public Transport(String id, String name, double baseFare) {
        this.id = id;
        this.name = name;
        this.baseFare = baseFare;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseFare() { return baseFare; }
}
