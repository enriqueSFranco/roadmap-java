package org.example;

import org.example.basics.oop.abstraction.EmailNotification;
import org.example.basics.oop.abstraction.Notification;
import org.example.basics.oop.abstraction.NotificationService;
import org.example.basics.oop.abstraction.SmsNotification;
import org.example.basics.oop.inheritance.Truck;
import org.example.basics.oop.inheritance.Vehicle;
import org.example.basics.oop.polymorphism.*;
import org.example.intermediate.enumerations.*;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {

            // Herencia
            // TODO: Usar el patron Builder
            Vehicle truck = new Truck("TRK-1234", "Blue", "Volvo", 2024, 10.5);
            // Usar métodos comunes
            truck.startEngine();
            // Mostrar detalles de los vehículos
            System.out.println(truck); // ToString de Truck
            // Llamar a métodos de la clase base (Vehicle)
            truck.stopEngine();

            // Polimorfismo
            // TODO: Implementar patrones de diseño
            PaymentService service = new PaymentService();
            PaymentProcessor creditCard = new CreditCardProcessor("1234567812345678", "123");
            PaymentProcessor paypal = new PaypalProcessor("user@example.com", "securePass");
            PaymentProcessor crypto = new CryptoProcessor("0xAbC1234D5678Ef9012345678901234567890AbCD");

            System.out.println("\n--- Processing Credit Card ---");
            service.executePayment(creditCard, 150.00);

            System.out.println("\n--- Processing PayPal ---");
            service.executePayment(paypal, 200.00);

            System.out.println("\n--- Processing Crypto ---");
            service.executePayment(crypto, 0.75);

            // Abstraccion
            NotificationService notificationService = new NotificationService();
            Notification email = new EmailNotification("john.doe@example.com", "Welcome to our platform!");
            Notification sms = new SmsNotification("+15551234567", "Your code is 123456.");
            System.out.println(notificationService + "\n" + email + "\n" + sms);
            // Enums
            System.out.println(Day.MONDAY.getDescription());
            System.out.println(Day.TUESDAY.getDescription());
            System.out.println(Day.FRIDAY.getDescription());

            System.out.println(CalculatorOperations.MULTIPLY.apply(10, 10));

//            int numerator = 10;
//            int[] denominators = {5, 0, 2, 0, 4};
//            for (int denominator : denominators) {
//                try {
//                    double result = CalculatorOperations.DIVIDE.apply(numerator, denominator);
//                    System.out.println("Result of " + numerator + " / " + denominator + " = " + result);
//                    System.out.println("---------------");
//                } catch (Exception e) {
//                    System.out.println("Error al dividir por " + denominator + ": " + e.getMessage());
//                }
//            }
//

            Locale spanish = Locale.of("es");
            Locale english = Locale.ENGLISH;

            System.out.println(OrderStatus.DELIVERED.getLabel(spanish)); // "Enviado"
            System.out.println(OrderStatus.DELIVERED.getLabel(english));  // "Shipped"
            Enumi18nHelper.getLabel(OrderStatus.PROCESSING, spanish);
            Enumi18nHelper.getLabel(OrderStatus.PROCESSING, english);

        }  catch (Exception e) {
            System.err.println("Se produjo una excepción:");
            e.printStackTrace();
        }

    }
    // Enums con switch
    public void reactToLight(TrafficLight light) {
        switch (light) {
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Slow down");
            case GREEN -> System.out.println("Go");
        }
    }
}