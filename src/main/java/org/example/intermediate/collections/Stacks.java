package org.example.intermediate.collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        historial.push("login");
        historial.push("perfil");
        historial.push("inicio");

        System.out.println("Última acción (para deshacer): " + historial.pop());
        System.out.println("Acción actual: " + historial.peek());
    }
}
