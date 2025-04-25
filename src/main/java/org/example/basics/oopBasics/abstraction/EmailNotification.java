package org.example.basics.oopBasics.abstraction;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public boolean validateRecipient() {
        System.out.println("[Email] Validating email address format...");
        return recipient.contains("@") && recipient.contains(".");
    }

    @Override
    public void send() {
        System.out.println("[Email] Sending email to " + recipient + " with message:\n" + message);
    }
}
