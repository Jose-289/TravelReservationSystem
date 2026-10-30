package edu.factory;
import edu.model.Transport;

public abstract class TransportFactory {
    public abstract Transport createTransport(String id, String name, double baseFare);
}
