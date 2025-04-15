package org.example.poo.polymorphism;

public interface PaymentProcessor {
    boolean validate();
    void authenticate();
    void processPayment(double amount);
}
