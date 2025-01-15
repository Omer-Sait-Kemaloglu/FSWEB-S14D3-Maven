package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private final double avgKmPerLiter;
    private final int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("GasPoweredCar: Starting engine with " + cylinders + " cylinders");
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar: Driving with " + avgKmPerLiter + " km/l");
        runEngine();
    }
}
