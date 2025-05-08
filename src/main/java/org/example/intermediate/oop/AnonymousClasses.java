package org.example.intermediate.oop;


/*
 * ✅ CLASES ANÓNIMAS EN JAVA
 *
 * Una clase anónima es una clase sin nombre que se declara e instancia en una sola expresión.
 * Se utilizan principalmente cuando se necesita una implementación puntual de una clase o interfaz,
 * especialmente para sobrescribir métodos sin tener que definir una clase completa por separado.
 *
 * Son útiles en contextos donde la implementación es breve y se utilizará una sola vez,
 * como en el manejo de eventos, callbacks, o al proporcionar implementaciones rápidas de interfaces.
 *
 * Sintaxis común:
 *
 * MiInterfaz obj = new MiInterfaz() {
 *     @Override
 *     public void metodo() {
 *         // implementación puntual
 *     }
 * };
 *
 * 🧪 Reflexión = ver y modificar "el interior" de los objetos mientras corre el programa.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

interface Animal {
    void hacerSonido();
}

// 🧩 ¿Qué pasa si uso una clase vacía como base de una clase anónima?
class Car {}

public class AnonymousClasses {
    private static final Logger LOGGER = Logger.getLogger(AnonymousClasses.class.getName());
    public static void main(String[] args) {
        // Clase anónima implementando la interfaz Animal
        Animal cat = new Animal() {
            @Override
            public void hacerSonido() {
                LOGGER.info("Miau");
            }
        };
        cat.hacerSonido();

        new Car() {
            // estos métodos solo pertenecen a la clase anónima
            public void startCar() {}
            public void turnOffCar() {}
            public void accelerateCar() {}
        }.startCar(); // ✅ Esto sí funciona
        // no podemos hacer: Car bmw = new Car() {}
        // car.startCar(); ❌ Esto da error porque 'startCar()' no existe en Car (Se podria usar reflexión, no recomendado)

        // Ordenar una lista con Comparator
        List<String> users = Arrays.asList("Ana", "Luis", "Carlos");

        // Using an anonymous class to create a custom Comparator
        Collections.sort(users, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length(); // s2.compareTo(s1);
            }
        });
    }
}
