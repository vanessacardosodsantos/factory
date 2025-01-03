package org.desingpattern.factory;

import org.desingpattern.factory.vehicle.Bike;
import org.desingpattern.factory.vehicle.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
