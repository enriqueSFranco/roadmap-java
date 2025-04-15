package org.example.types;

import java.util.*;

public class DataStructuresDemo {
    // // --- 1. PRIMITIVOS: Calcular salario neto ---
    public void calcuarSalarioNeto() {
        double salarioBase = 3000.0;
        double impuesto = 0.18;  // 18% de impuestos
        boolean tieneBonificacion = true;
        char categoria = 'A';  // Puede ser A, B, C...

        double bonificacion = tieneBonificacion ? 250.0 : 0.0;
        double salarioNeto = salarioBase * (1 - impuesto) + bonificacion;

        System.out.printf("Empleado categoría %c, salario neto: %.2f%n", categoria, salarioNeto);
    }

    // --- 2. LISTAS: Registro de lenguajes conocidos por un dev y ordenarlos ---
    public void gestionarLenguajesProgramador() {
        List<String> lenguajes = new ArrayList<>(Arrays.asList("Java", "Typescript", "C#"));
        System.out.println("Lenguajes sin ordenar: " + lenguajes);

        Collections.sort(lenguajes);
        System.out.println("Lenguajes ordenados alfabéticamente: " + lenguajes);
    }
    // --- 3. SETS: Evitar duplicados en emails de empleados ---
    public void gestionarEmailsUnicos() {
        Set<String> emails = new HashSet<>();
        emails.add("juan@empresa.com");
        emails.add("ana@empresa.com");
        emails.add("juan@empresa.com");  // duplicado
        emails.add("carla@empresa.com");

        System.out.println("Emails únicos registrados: " + emails);
    }

    // --- 4. MAPS: Relacionar empleados con su ID y buscarlos por nombre ---
    public void gestionarEmpleadosConMap() {
        Map<String, Integer> empleados = new HashMap<>();
        empleados.put("Carlos", 1001);
        empleados.put("Lucía", 1002);
        empleados.put("Elena", 1003);

        String nombreBuscado = "Elena";
        if (empleados.containsKey("Elena")) {
            System.out.println("ID de " + nombreBuscado + ": " + empleados.get(nombreBuscado));
        } else {
            System.out.println(nombreBuscado + " no está registrado.");
        }
    }

    // --- 5. STACK: Historial de acciones del usuario en una app (Deshacer) ---
    public void gestionarHistorialAcciones() {
        Stack<String> historial = new Stack<>();
        historial.push("login");
        historial.push("perfil");
        historial.push("inicio");

        System.out.println("Última acción (para deshacer): " + historial.pop());
        System.out.println("Acción actual: " + historial.peek());
    }

    // --- 6. QUEUE: Cola de tickets de soporte ---
    public void gestionarSoporteTecnico() {
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
