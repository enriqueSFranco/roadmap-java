package org.example.poo.polymorphism;

//3. Polimorfismo (una acción, diferentes formas)
//Significa que una misma acción se comporta distinto según el objeto que la ejecuta.

public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    private String cvv;

    public CreditCardProcessor(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean validate() {
        System.out.println("[CreditCard] Validating card number and CVV...");
        return this.cardNumber != null && cardNumber.length() == 16 && this.cvv.length() == 3;
    }

    @Override
    public void authenticate() {
        System.out.println("[CreditCard] Authenticating via 3D Secure...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[CreditCard] Processing payment of $" + amount);
    }
}
