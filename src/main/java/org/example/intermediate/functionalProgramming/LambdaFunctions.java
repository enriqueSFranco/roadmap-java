package org.example.intermediate.functionalProgramming;

import java.util.logging.Logger;

// Una interfaz funcional es una interfaz que solo tiene un método abstracto.
// Se usa para representar una sola acción o comportamiento.
// La anotación @FunctionalInterface es opcional pero recomendable.
@FunctionalInterface
interface Operacion {
    int aplicar(int a, int b);
}

public class LambdaFunctions {
    private static final Logger LOGGER = Logger.getLogger(LambdaFunctions.class.getName());

    public static void main(String[] args) {

        // Una función lambda es una forma corta de escribir una función sin nombre.
        // Aquí estamos diciendo que 'suma' es una función que toma dos enteros y devuelve su suma.
        Operacion suma = (a, b) -> {
            return a + b;
        };

        // Usamos la función lambda llamando al método de la interfaz
        int resultado = suma.aplicar(10, 5);

        LOGGER.info("Suma: " + resultado);

        Operacion multiplicacion = (a, b) -> a * b;
        LOGGER.info("Multiplicacion: " + multiplicacion.aplicar(10, 10));
    }
}
