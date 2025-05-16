package org.example.basics.oopBasics.abstractClass;


/*
------ Clase abstracta -------

Una clase abstracta es una clase que no puede instanciarse por sí misma y que puede contener métodos abstractos
que deben ser implementados por las subclases.

------ Metodo abstracto -------
Un metodo abstracto es un metodo que se declara sin una implementación.
Las subclases de la clase abstracta deben proporcionar una implementación de estos métodos.
* */

public abstract class AbstractClassMain {
    public static void main(String[] args) {
        Dog schnauzer = new Dog();
        schnauzer.makeSound();
        schnauzer.slee();

        Circle circle = new Circle(5);
        circle.draw();
        System.out.println("Area: " + circle.area());
    }
}
