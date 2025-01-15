package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Ford: Engine is starting");
        return "Ford: Engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Ford: Accelerating");
        return "Ford: Accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Ford: Braking");
        return "Ford: Braking";
    }
}