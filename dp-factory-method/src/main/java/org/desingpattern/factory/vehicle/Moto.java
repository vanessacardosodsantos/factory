package org.desingpattern.factory.vehicle;

public class Moto implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");

    }
}
