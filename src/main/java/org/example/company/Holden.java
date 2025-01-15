package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public short startEngine(){
        System.out.println(getClass().getSimpleName() + ":  the Holden's engine is starting.");
        return 0;
    }

    @Override
    public short accelerate(){
        System.out.println(getClass().getSimpleName() + ": the Holden is accelerating.");
        return 0;
    }

    @Override
    public short brake(){
        System.out.println(getClass().getSimpleName() + ": the Holden is braking.");
        return 0;
    }
}
