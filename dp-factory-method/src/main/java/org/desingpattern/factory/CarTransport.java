package org.desingpattern.factory;

import org.desingpattern.factory.vehicle.Car;
import org.desingpattern.factory.vehicle.IVehicle;

public class CarTransport  extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
