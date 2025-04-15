package org.example.types;

import java.util.Arrays;

public class ArraysDemo {
    private int[] oneDimArray = {1,2,3,4,5};
    private int[][] twoDimArray = {
            {1,2,3,4},
            {5,6,7,8}
    };
    // Acceso a elementos de un array
    int firstElement = oneDimArray[0];
    int lastElement = oneDimArray[oneDimArray.length - 1];

    // Modificando elementos de un array
    // sintaxis: arrayName[index] = newValue
    public void modifyArray() {
        this.oneDimArray[0] = 100;
        this.oneDimArray[2] = 300;
        for (int num : oneDimArray)
            System.out.println(num);
    }

    // Iterando un array
    public void traverseArray() {
      for(int i=0; i<this.oneDimArray.length-1; i++) {
          System.out.println(this.oneDimArray[i]);
      }
      // usar for-each si no se necesita modifcar los elementos
        for (int num : oneDimArray)
            System.out.println(num);
    }

    // Comparando matrices
    public void compararRespuestas() {
        char[] respuestasCorrectas = {'A', 'C', 'B', 'D', 'B'};
        char[] respuestasEstudiante = {'A', 'C', 'B', 'A', 'B'};
        int aciertos = 0;

        for (int i = 0; i < respuestasCorrectas.length - 1; i++) {
            if (respuestasCorrectas[i] == respuestasEstudiante[i])
                aciertos += 1;
        }
        System.out.println("Respuestas correctas: " + aciertos + "/" + respuestasCorrectas.length);
        if (Arrays.equals(respuestasCorrectas, respuestasEstudiante))
            System.out.println("¡El estudiante respondió exactamente igual que la hoja de respuestas!");
        else
            System.out.println("El estudiante no respondió exactamente igual.");
    }
}
