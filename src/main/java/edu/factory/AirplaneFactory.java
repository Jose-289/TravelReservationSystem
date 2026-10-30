package edu.factory;

import edu.model.Airplane;
import edu.model.Transport;

public class AirplaneFactory extends TransportFactory{
    @Override
    public Transport createTransport(String id, String name, double baseFare) {
        return new Airplane(id, name, baseFare);
    }
}
