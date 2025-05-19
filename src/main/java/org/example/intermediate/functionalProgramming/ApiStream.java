package org.example.intermediate.functionalProgramming;
/*
 * ¿Qué es la API de STREAM?
 *
 * La API de Stream en Java permite trabajar con colecciones (listas, conjuntos, etc.)
 * de una manera más eficiente, legible y funcional.
 *
 * En lugar de iterar manualmente sobre los elementos de una colección usando bucles,
 * podemos usar Streams para realizar operaciones como filtrado, transformación,
 * ordenamiento y reducción, de manera más declarativa y concisa.
 *
 * ¿Qué es un Stream?
 *
 * Un Stream es una secuencia de elementos que se pueden procesar en forma funcional.
 * No es una estructura de datos, sino una abstracción que nos permite operar
 * sobre los datos de una fuente (como una lista o arreglo) de forma secuencial o paralela.
 *
 * Las operaciones con Stream se dividen en:
 *  - Intermedias: transforman el Stream (como `filter`, `map`, `sorted`)
 *  - Finales: terminan el Stream y producen un resultado (como `collect`, `forEach`, `count`)
 *
 * Ejemplo simple:
 *
 *   List<String> names = Arrays.asList("Ana", "Luis", "Carlos");
 *   names.stream()
 *        .filter(name -> name.length() > 3)
 *        .map(String::toUpperCase)
 *        .forEach(System.out::println);
 *
 * Este enfoque mejora la claridad del código y favorece el uso de programación funcional en Java.
 */


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Car {
    private String model;
    private String brand;
    private double price;

    public Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Car{model=%s, brand=%s, price=%.2f}", model, brand, price);
    }
}

public class ApiStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Carlos", "Beatriz", "Sol");
        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .toList();

        result.forEach(System.out::println);

        List<Car> carList = Arrays.asList(
                new Car("ModelS", "Tesla", 79999.99),
                new Car("Civic", "Honda", 22999.50),
                new Car("Mustang", "Ford", 55999.00),
                new Car("Corolla", "Toyota", 19999.00),
                new Car("A4", "Audi", 40999.99),
                new Car("3Series", "BMW", 42999.00),
                new Car("Altima", "Nissan", 24999.95),
                new Car("CX5", "Mazda", 27999.99),
                new Car("Impala", "Chevrolet", 31999.00),
                new Car("Elantra", "Hyundai", 20999.99),
                new Car("Charger", "Dodge", 35999.95)
        );

        carList.stream()
                .sorted(Comparator
                        .comparingDouble(Car::getPrice)
                        .thenComparing(Car::getBrand) // despues de comparar el precio, si dos autos tiene el mismo precio, se ordena por marca alfabeticamente
                )
                .filter(it -> it.getPrice() < 24999.95 && it.getModel().matches("(?i).*a.*"))
                .forEach(System.out::println);

        // .*a.* → cualquier texto que contenga al menos una "a".
        // (?i) → hace que sea case-insensitive, por lo que coincidirá con "A" o "a".

    }
}
