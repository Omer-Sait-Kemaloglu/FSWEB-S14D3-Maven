package org.example.arge;

public class GasPoweredCar  extends  CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders){
      super(name, description);
      this.avgKmPerLitre = avgKmPerLitre;
      this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        System.out.println("GasPoweredCar: Starting a gas-powered engine with " + cylinders + " cylinders.");
    }

    @Override
    public void drive(){
        System.out.println("GasPoweredCar: Driving with fuel efficiency of " + avgKmPerLitre + " km/l.");
        runEngine();
    }
}
