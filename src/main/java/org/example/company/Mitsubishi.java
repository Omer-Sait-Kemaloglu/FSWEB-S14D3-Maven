package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public short startEngine(){
        System.out.println(getClass().getSimpleName() + ": the Mitsubishi's engine is starting.");
        return 0;
    }

    @Override
    public short accelerate(){
        System.out.println(getClass().getSimpleName() + ":  the Mitsubishi is accelerating.");
        return 0;
    }

    @Override
    public short brake(){
        System.out.println(getClass().getSimpleName() + ":  the Mitsubishi is braking.");
        return 0;
    }

}
