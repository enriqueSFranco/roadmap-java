package org.example.basics.oop.abstraction;

public class SmsNotification extends Notification {

    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public boolean validateRecipient() {
        System.out.println("[SMS] Validating phone number format...");
        return recipient.matches("\\+?[0-9]{10,15}");
    }

    @Override
    public void send() {
        System.out.println("[SMS] Sending SMS to " + recipient + ": " + message);
    }
}
