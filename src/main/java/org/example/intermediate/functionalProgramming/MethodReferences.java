package org.example.intermediate.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

class MathUtils {
    public static int square(int val) {
        return val * val;
    }
}

class PersonDTO {
    private String name;

    PersonDTO(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

public class MethodReferences {
    private static final Logger LOGGER = Logger.getLogger(MethodReferences.class.getName());

    public static void main(String[] args) {
        // referencia a metodo static
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers)
                .map(MathUtils::square)
                .forEach(System.out::println);

        // referencia constructor
        String[] names = {"fernanda", "camila", "gael", "karla", "daniel"};
        final List<PersonDTO> persons = Arrays.stream(names)
                .map(PersonDTO::new) // .map(name -> new Person(name))
                .toList();

        LOGGER.info("Result: " + persons);

        // referencia a metodo de instancia
        final List<String> result = persons.stream()
                .map(PersonDTO::getName)
                .toList();

        LOGGER.info("Result: " + result);

        final List<String> resultUpperCase = result.stream()
                .map(String::toUpperCase)
                .toList();

        LOGGER.info("Result: " + resultUpperCase);
    }

}
