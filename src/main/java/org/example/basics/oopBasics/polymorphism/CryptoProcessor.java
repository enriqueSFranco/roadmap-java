package org.example.basics.oopBasics.polymorphism;

public class CryptoProcessor implements PaymentProcessor {
    private String walletAddress;

    public CryptoProcessor(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean validate() {
        System.out.println("[Crypto] Validating wallet address...");
        return this.walletAddress != null && this.walletAddress.startsWith("0x") && this.walletAddress.length() == 42;
    }

    @Override
    public void authenticate() {
        System.out.println("[Crypto] Verifying blockchain signature...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("[Crypto] Transferring " + amount + " in ETH.");
    }
}
