package org.example;

import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Toyota Camry", "Gas-powered vehicle", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("Tesla Model 3", "Electric vehicle", 400.0, 75);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Hybrid vehicle", 20.0, 10, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        System.out.println("\nTesting " + car.getClass().getSimpleName());
        car.startEngine();
        car.drive();
        System.out.println("Type: " + car.getClass().getSimpleName());
    }
}
