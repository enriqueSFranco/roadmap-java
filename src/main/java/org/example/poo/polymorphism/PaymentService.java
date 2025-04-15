package org.example.poo.polymorphism;

public class PaymentService {
    public void executePayment(PaymentProcessor processor, double amount) {
        if (!processor.validate())
            throw new IllegalArgumentException("Payment validation failed.");
        processor.authenticate();
        processor.processPayment(amount);
    }
}
