package org.example.basics.oopBasics.abstractClass;

abstract class AbstractAnimal {
    abstract void makeSound();

    // Concrete method
    void slee() {
        System.out.println("Sleeping...");
    }
}

class Dog extends AbstractAnimal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Bark");
    }
}
