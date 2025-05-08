package org.example.basics;

import java.util.Arrays;
import java.util.logging.Logger;


public class ArraysBasics {

    private static final Logger logger = Logger.getLogger(ArraysBasics.class.getName());

    public static void main(String[] args) {

        int[] oneDimArray = {1,2,3,4,5};

        int[][] twoDimArray = {
                {1,2,3,4},
                {5,6,7,8}
        };

        // Acceso a elementos de un array
        int firstElement = oneDimArray[0];
        int lastElement = oneDimArray[oneDimArray.length - 1];

        logger.info("Primer elemento de oneDimArray: " + firstElement);
        logger.info("Ultimo elemento de oneDimArray: " + lastElement);

        // Modificando elementos de un array
        // sintaxis: arrayName[index] = newValue
        oneDimArray[0] = 100;
        oneDimArray[2] = 300;

        // iterar sobre un array
        for (int num : oneDimArray)
            System.out.println(num);

        for (int i = 0, len = oneDimArray.length; i < len; i++) {
          System.out.println(oneDimArray[i]);
        }

        // usar for-each si no se necesita modifcar los elementos
        for (int num : oneDimArray)
            System.out.println(num);

        // Comparando matrices
        char[] respuestasCorrectas = {'A', 'C', 'B', 'D', 'B'};
        char[] respuestasEstudiante = {'A', 'C', 'B', 'A', 'B'};
        int aciertos = 0;

        for (int i = 0; i < respuestasCorrectas.length - 1; i++) {
            if (respuestasCorrectas[i] == respuestasEstudiante[i])
                aciertos += 1;
        }

        logger.info("Respuestas correctas: " + aciertos + "/" + respuestasCorrectas.length);

        if (Arrays.equals(respuestasCorrectas, respuestasEstudiante))
            logger.info("¡El estudiante respondió exactamente igual que la hoja de respuestas!");
        else
            logger.info("El estudiante no respondió exactamente igual.");
    }

}
