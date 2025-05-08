package org.example.intermediate.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/*
cómo usar logging correctamente en Java usando java.util.logging (que es parte de la JDK) o herramientas más avanzadas
como Log4j 2 o SLF4J con Logback.
*/

public class Sets {
    private final static Logger logger = Logger.getLogger(Sets.class.getName());

    public static void main(String[] args) {
        // declaracion y creacion
        Set<String> emails = new HashSet<>(); // no son ordenados, permite valores unicos, inmutable

        // agregar elementos
        emails.add("juan@empresa.com");
        emails.add("ana@empresa.com");
        emails.add("juan@empresa.com");  // <-- duplicado
        emails.add("karla@empresa.com");

        logger.info("Emails únicos registrados: " + emails);
        logger.info("size: " + emails.size());

        // buscando elementos
        System.out.println(emails.contains("karla@empresa.com"));

        // eliminar un elemento
        emails.remove("karla@empresa.com");
        logger.info("size: " + emails.size());
        if (emails.contains("karla@empresa.com"))
            System.out.println("el correo karla@empresa.com esta en emails");
        else
            System.out.println("el correo karla@empresa.com NO esta en emails");


        HashSet<String> employees = new HashSet<>(Arrays.asList("Juan", "Ana", "Karla"));
        // agregar un conjunto a emails
        emails.addAll(employees);

        for (String it : emails)
            logger.info(it);

        // eliminar todos los elementos
        emails.removeAll(employees);
        for (String it : emails)
            logger.info(it);
    }
}
