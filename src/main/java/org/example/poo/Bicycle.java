package org.example.poo;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void setCadence(int newValue) {
        this.cadence = newValue;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }
}
