package org.example.basics;


public class Strings {
    public static void main(String[] args) {
        // 🔹 1. ¿Qué es un String?
        // Un string (cadena) es una secuencia inmutable de caracteres
        String s = "Hola";
        s = s + " Mundo"; // Se crea un nuevo objeto String
        var firstName = "carlos";
        var surname = "salinas franco";

        // --- Operaciones con strings ---

        // concatenacion
        String fullName = firstName + " " + surname;

        // longitud de un String
        int fullNameSize = fullName.length();

        // obtener un caracter
        char firstCharacter = fullName.charAt(0);
        char lastCharacter = fullName.charAt(fullNameSize - 1);

        // substring
        System.out.println(fullName.substring(4));
        System.out.println(fullName.substring(4, fullNameSize - 1));

        // mayusculas y minusculas
        System.out.println(fullName.toUpperCase()); // mayusculas
        System.out.println(fullName.toLowerCase()); // minusculas

        // comprobar si contiene
        System.out.println("Hello Java".contains("Java")); // true
        System.out.println("Hello Java".contains("ava")); // true
        System.out.println("Hello Java".contains("CSharp")); // false

        // comparación (usar siempre equals en lugar del operador '==')
        System.out.println("Hello Java".equals("Hello JAVA")); // false
        System.out.println("Hello Java".equalsIgnoreCase("HELLO Java")); // true

        // eliminar espacios
        System.out.println("     Hello Java     ".trim()); // elimina espacios al principip y al final

        System.out.println("     Hello Java     ".replace(" ", "-"));

        // formateo de Strings
        var age = 23;
        System.out.printf("Hola, mi nombre es %s y tengo %d", fullName, age);
        // con Java 21
        // System.out.printf(STR."Hola, mi nombre es \{fullName} y tengo \{age}");


        /*
        🔹 2. String vs StringBuilder / StringBuffer (Java)
            🔸 String (Inmutable)
            - Cada concatenación crea un nuevo objeto en memoria.
            - Costoso en ciclos de CPU y memoria si haces muchas concatenaciones.

            🔸 StringBuilder (Mutable, No thread-safe)
            - Mucho más eficiente para concatenaciones múltiples.
            - Ideal para una sola hebra (thread).

            🔸 StringBuffer (Mutable, Thread-safe)
            - Similar a StringBuilder pero sincronizado.
            - Más lento que StringBuilder, pero útil en entornos multihilo.
        */


    }
}
