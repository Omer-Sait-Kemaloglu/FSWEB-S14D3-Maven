package org.example.arge;

public class HybridCar extends CarSkeleton {
    private final double avgKmPerLiter;
    private final int batterySize;
    private final int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar: Starting hybrid engine with " + cylinders + " cylinders and " + batterySize + " kWh battery");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar: Driving with " + avgKmPerLiter + " km/l and battery support");
        runEngine();
    }
}