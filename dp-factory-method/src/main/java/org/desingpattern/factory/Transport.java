package org.desingpattern.factory;

import org.desingpattern.factory.vehicle.IVehicle;

//classe focada na interface, sem o new do objeto
public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
