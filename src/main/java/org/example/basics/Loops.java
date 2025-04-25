package org.example.basics;

import java.util.Arrays;

public class Loops {
    // For clásico: útil cuando conocés la cantidad de iteraciones
    public void classicForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("classicForLoop: i = " + i);
        }
    }

    // For-each: para recorrer arrays o colecciones
    public void enhancedForLoop() {
        int[] numbers = {10, 20, 30};
        for (int number : numbers) {
            System.out.println("enhancedForLoop: number = " + number);
        }
    }

    // While: se ejecuta mientras la condición sea verdadera
    public void whileLoop() {
        int counter = 0;
        while (counter < 3) {
            System.out.println("whileLoop: counter = " + counter);
            counter++;
        }
    }

    // Do-while: se ejecuta al menos una vez
    public void doWhileLoop() {
        int counter = 0;
        do {
            System.out.println("doWhileLoop: counter = " + counter);
            counter++;
        } while (counter < 3);
    }

    // Loop infinito controlado con break
    public void infiniteLoopWithBreak() {
        int attempts = 0;
        while (true) {
            System.out.println("infiniteLoopWithBreak: attempt = " + attempts);
            if (attempts == 2) {
                break;
            }
            attempts++;
        }
    }

    // For con múltiples variables
    public void forWithMultipleVariables() {
        for (int i = 0, j = 5; i < j; i++, j--) {
            System.out.println("forWithMultipleVariables: i = " + i + ", j = " + j);
        }
    }

    // Uso de continue
    public void loopWithContinue() {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("loopWithContinue: i = " + i);
        }
    }

    // Uso de etiqueta y break en bucles anidados
    public void labeledBreakInNestedLoops() {
        outer:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer;
                }
                System.out.println("labeledBreak: i = " + i + ", j = " + j);
            }
        }
    }

    // 1. Loop sin cuerpo
    public void sumWithoutLoopBody() {
        int sum = 0;
        for (int i = 1; i <= 100; sum += i, i++);
        System.out.println("Sum from 1 to 100 = " + sum);
    }

    // 2. Invertir array in-place
    public void reverseArrayInPlace() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    // 3. Bitwise en lugar de módulo para determinar pares
    public void evenUsingBitwise() {
        for (int i = 0; i < 10; i++) {
            if ((i & 1) == 0) {
                System.out.println(i + " is even");
            }
        }
    }
    // 4. Eliminar elementos de un array sin estructuras extra
    public void removeElementsInPlace() {
        int[] array = {1, -1, 2, -1, 3, 4};
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                array[k++] = array[i];
            }
        }
        System.out.print("Filtered array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 5. Loop infinito elegante
    public void infiniteLoopClean() {
        for (;;) {
            System.out.println("Infinite loop (break after 1 run)");
            break;
        }
    }

    // 6. Control externo del loop
    public void externalStopLoop() {
        boolean stop = false;
        for (int i = 0; !stop && i < 10; i++) {
            System.out.println("externalStopLoop: i = " + i);
            if (shouldStop(i)) stop = true;
        }
    }

    private boolean shouldStop(int value) {
        return value == 5;
    }

    // 7. Múltiples condiciones en el for
    public void forWithMultipleConditions() {
        for (int i = 0, oddCount = 0; i < 10 && oddCount < 5; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
                oddCount++;
            }
        }
    }

    // 8. Iterar sobre dos arrays al mismo tiempo
    public void iterateTwoArrays() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            System.out.println(a[i] + " + " + b[i] + " = " + (a[i] + b[i]));
        }
    }

    // 9. Diagonales en matriz
    public void printMatrixDiagonals() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.print("\nSecondary diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println();
    }

    // 10. Búsqueda con return temprano
    public boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) return true;
        }
        return false;
    }
}
