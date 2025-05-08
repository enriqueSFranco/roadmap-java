package org.example.intermediate.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class Lists {
    private static final Logger logger = Logger.getLogger(Lists.class.getName());

    public static void main(String[] args) {
        // ArrayList
        // declaracion
        ArrayList<String> manhwas = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        logger.info("longitud de manhwas antes de agregar elementos es: " + manhwas.size());


        // agregar elementos
        manhwas.add("solo leveling");
        manhwas.add("el regreso del jugador congelado");
        manhwas.add("la vida despues del fin");

        // longitud
        logger.info("longitud de manhwas despues de agregar elementos es: " + manhwas.size());

        // acceder a los elemntos
        logger.info("primer elemento es: " + manhwas.getFirst());
        logger.info("ultimo elemento es: " + manhwas.getLast());
        logger.info("elemento en el indice 1 es: " + manhwas.get(1));

        // modificando los elementos
        manhwas.set(1, "el restaurante del mago");
        logger.info("elemento en el indice 1 es: " + manhwas.get(1));

        // eliminando elementos
        manhwas.remove(2);
        logger.info("longitud de manhwas despues de eliminar un elemento es: " + manhwas.size());


        // ordenar e iterar
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Typescript", "C#"));
        logger.info("Lenguajes sin ordenar: " + languages);

        // buscando elementos
        System.out.println(languages.contains("Java"));

        Collections.sort(languages); // ordenado el array list
        for (String language : languages)
            logger.info(language);
    }
}
