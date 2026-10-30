package edu.factory;
import edu.model.Bus;
import edu.model.Transport;



public class BusFactory extends TransportFactory{
    @Override
    public Transport createTransport(String id, String name, double baseFare) {
        return new Bus(id, name, baseFare);
    }
}
