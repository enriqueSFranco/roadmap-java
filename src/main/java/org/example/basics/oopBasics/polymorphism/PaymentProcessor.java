package org.example.basics.oopBasics.polymorphism;

public interface PaymentProcessor {
    boolean validate();
    void authenticate();
    void processPayment(double amount);
}
