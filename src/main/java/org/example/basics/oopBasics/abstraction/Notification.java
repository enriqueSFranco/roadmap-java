package org.example.basics.oopBasics.abstraction;

//Consejos y Mejores Prácticas
//Use Clases Abstractas para la Implementación Parcial: Cuando tenga una clase base con algún comportamiento
// predeterminado, use clases abstractas para definir métodos y campos comunes.

//Prefiere Interfaces para Herencia Múltiple: Dado que Java no admite herencia múltiple con clases, las interfaces
// son una buena manera de lograr un comportamiento similar a la herencia múltiple.

//Mantenga las Interfaces Lean: Diseñe interfaces con métodos mínimos para garantizar que permanezcan
// enfocados y fáciles de implementar.

//Implementar Solo Métodos Necesarios: Cuando una clase implementa una interfaz, asegúrese de que solo
// implementa los métodos que son relevantes para su funcionalidad.

//Use Abstracción para Flexibilidad: Aplicar la abstracción para permitir futuros cambios y mejoras
// sin afectar la estructura de código existente.

public abstract class Notification {
    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        if (this.recipient == null || this.message == null)
            throw new IllegalArgumentException("Recipient and message cannot be null.");
        this.recipient = recipient;
        this.message = message;
    }

    // Métodos comunes
    public void logNotification() {
        System.out.println("Logging notification to: " + recipient);
    }

    public abstract boolean validateRecipient();
    public abstract void send();
}
