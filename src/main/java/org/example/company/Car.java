package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';

    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public short startEngine(){
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting.");

        return 0;
    }

    public short accelerate(){
        System.out.println(getClass().getSimpleName() + ": the car is accelerating.");

        return 0;
    }

    public short brake(){
        System.out.println(getClass().getSimpleName() + ": the car is braking.");
        return 0;
    }
}
