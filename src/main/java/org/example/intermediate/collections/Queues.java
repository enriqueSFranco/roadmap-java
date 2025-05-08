package org.example.intermediate.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<String> tickets = new LinkedList<>();
        tickets.offer("Ticket#001 - Error login");
        tickets.offer("Ticket#002 - No carga página");
        tickets.offer("Ticket#003 - Problema con base de datos");

        while(!tickets.isEmpty()) {
            String ticketActual = tickets.poll(); // atiende el siguiente ticket
            System.out.println("Atendiendo: " + ticketActual);
        }
    }
}
