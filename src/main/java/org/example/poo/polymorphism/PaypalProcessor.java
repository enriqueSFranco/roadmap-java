package org.example.poo.polymorphism;

public class PaypalProcessor implements PaymentProcessor {
    private String email;
    private String passwordHash;

    public PaypalProcessor(String email, String passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
    }

    @Override
    public boolean validate() {
        System.out.println("[PayPal] Validating email format...");
        return email != null && email.contains("@");
    }

    @Override
    public void authenticate() {
        System.out.println("[PayPal] Authenticating via OAuth...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[PayPal] Sending $" + amount + " via PayPal.");
    }
}
