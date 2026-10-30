package edu.factory;

import edu.model.Train;
import edu.model.Transport;

public class TrainFactory extends TransportFactory{
    @Override
    public Transport createTransport(String id, String name, double baseFare) {
        return new Train(id, name, baseFare);
    }
}
