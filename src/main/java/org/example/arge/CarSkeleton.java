package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
        this.name = "Default Car";
        this.description = "Default Description";
    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println(name + ":  Engine is starting...");
    }

    public void drive(){
        System.out.println(name + ": The car is driving...");
        runEngine();
    }

    protected void runEngine(){
        System.out.println( name + ":Engine is running smoothly...");
    }

    @Override
    public String toString(){
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
