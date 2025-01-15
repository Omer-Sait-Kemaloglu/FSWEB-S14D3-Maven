package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar: Starting an electric engine with battery size of " + batterySize + " kWh.");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar: Driving with a range of " + avgKmPerCharge + " km per charge.");
        runEngine();
    }
}
