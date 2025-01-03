package org.desingpattern.factory;

import org.desingpattern.factory.vehicle.IVehicle;
import org.desingpattern.factory.vehicle.Moto;

public class MotoTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Moto();
    }
}
