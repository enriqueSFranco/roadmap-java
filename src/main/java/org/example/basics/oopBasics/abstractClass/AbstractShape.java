package org.example.basics.oopBasics.abstractClass;

public abstract class AbstractShape {
    abstract void draw();
    abstract double area();
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    double area() {
        return Math.PI * this.radius * radius;
    }
}

