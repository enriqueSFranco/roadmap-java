package org.example.basics.oop.polymorphism;

public interface PaymentProcessor {
    boolean validate();
    void authenticate();
    void processPayment(double amount);
}
