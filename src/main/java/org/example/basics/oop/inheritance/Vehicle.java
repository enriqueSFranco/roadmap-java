package org.example.basics.oop.inheritance;

// 2. 👨🏻-👴🏻 Herencia (reutilizar código)
//Permite que una clase herede atributos y métodos de otra. Es como decir: "Un coche es un tipo de vehículo".
//Ejemplo:

public class Vehicle {
    private String licensePlate;
    private String color;
    private String model;
    private int year;

    public Vehicle(String licensePlate, String color, String model, int year) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Método común para todos los vehículos
    public void startEngine() {
        System.out.println("The engine is starting...");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping...");
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate='" + licensePlate + "', color='" + color + "', year=" + year + "}";
    }
}
