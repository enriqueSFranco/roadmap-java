package org.example.tips;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
    💡 BONUS: Trucos útiles
    📏 arr.length → largo del array 1D
    🧱 matrix.length → filas
    🧩 matrix[0].length → columnas (si está lleno)
**/
public class ArraysTips {
    // Evitar recalcular la longitud en bucles
    public void iterateWithoutRecalculatingLength() {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = 0, size = numbers.length; i < size; i++) {
            // Operaciones con numbers[i]
        }
    }

    // Inicializar un array rápidamente con Arrays.fill
    public void initializeArrayWithDefaultValue() {
        int[] zeros = new int[10];
        Arrays.fill(zeros, 0); // llena con 0
    }

    // Copiar una parte de un array a otro usando System.arraycopy()
    public void copyArraySectionUsingSystemArrayCopy() {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August"};

        int sourceStartIndex = 2; // Wednesday
        int destinationStartIndex = 3; // April
        int numberOfElementsToCopy = 2;

        System.out.println("Original weekdays array:");
        printStringArray(weekdays);

        System.out.println("\nOriginal months array:");
        printStringArray(months);

        System.arraycopy(weekdays, sourceStartIndex, months, destinationStartIndex, numberOfElementsToCopy);

        System.out.println("\nUpdated months array after copy:");
        printStringArray(months);
    }

    // Inicializar un array con lógica usando streams
    public void initializeArrayWithSquares() {
        int[] squaredNumbers = IntStream.range(0, 10)
                .map(i -> i * i)
                .toArray();
        printIntArray(squaredNumbers);
    }

    // Método de utilidad para imprimir arrays de enteros
    public static void printIntArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Método de utilidad para imprimir arrays de strings
    public static void printStringArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }
}

