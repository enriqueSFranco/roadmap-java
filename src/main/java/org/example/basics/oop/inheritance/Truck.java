package org.example.basics.oop.inheritance;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String licensePlage, String color, String model, int year, double cargoCapacity) {
        super(licensePlage, color, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Sobrescribe el método startEngine() para dar un comportamiento específico
    @Override
    public void startEngine() {
        System.out.println("The truck engine is roaring to life!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Truck{cargoCapacity=" + cargoCapacity + " tons}";
    }
}
