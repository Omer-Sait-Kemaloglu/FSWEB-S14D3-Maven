package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Holden: Engine is starting");
        return "Holden: Engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println("Holden: Accelerating");
        return "Holden: Accelerating";
    }

    @Override
    public String brake() {
        System.out.println("Holden: Braking");
        return "Holden: Braking";
    }
}
