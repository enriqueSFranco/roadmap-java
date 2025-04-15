package org.example.poo.abstraction;

public class NotificationService {
    public void notify(Notification notification) {
        if(!notification.validateRecipient()) {
            System.err.println("Invalid recipient: " + notification.recipient);
            return;
        }
        notification.send();
        notification.logNotification();
    }
}
