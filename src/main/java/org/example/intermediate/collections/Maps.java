package org.example.intermediate.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Maps {
    private static final Logger logger = Logger.getLogger(Maps.class.getName());

    public static void main(String[] args) {
        // declaracion y asignacion
        Map<String, Integer> employees = new HashMap<>(); // no son ordenados, mutables, no admite repetidos

        // agregar elementos
        employees.put("Carlos", 1001); // <nombre, clave>
        employees.put("Lucía", 1002);
        employees.put("Elena", 1003);

        // iterar un map
        for (Map.Entry<String, Integer> employee : employees.entrySet()) {
            logger.info("employee: " + employee);
        }

        Map<String, Integer> ages = Map.of(
            "Ana", 30,
            "Luis", 43,
            "Marta", 50
        );

        for (Map.Entry<String, Integer> entry : ages.entrySet())
            System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años.");

        // iterar solo las claves
        for (String name : ages.keySet())
            logger.info("Nombre: " + name);

        for (Integer age : ages.values())
            logger.info("Ages: " + age);

        // longitud
        logger.info("la longitud del map employees es: " + employees.size());

        // acceder a los elementos
        logger.info("Value: "+employees.get("Carlos"));

        // verificar si existe la clave 'Enrique'
        logger.info("Value: " + employees.containsKey("Enrique"));

        // verificar si existe el valor '1001'
        logger.info("Value: " + employees.containsValue(1001));

        // eliminar elementos
        employees.remove("Lucía");

        // limpiar map
        employees.clear();

        employees.put("Carlos", 1001);
        // reemplazar un elemento
        employees.replace("Carlos", 1002);

        employees.putIfAbsent("Carlos", 1003);

        var values = employees.values();
        logger.info("Values del map employees: " + values);
    }
}
