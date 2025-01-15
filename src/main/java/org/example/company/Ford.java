package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override

    public short startEngine(){
        System.out.println(getClass().getSimpleName() + ":  the Ford's engine is starting.");
        return 0;
    }

    @Override

    public short accelerate(){
        System.out.println(getClass().getSimpleName() + ":  the Ford is accelerating.");
        return 0;
    }

    @Override
    public short brake(){
        System.out.println(getClass().getSimpleName() + ": the Ford is braking.");
        return 0;
    }
}
