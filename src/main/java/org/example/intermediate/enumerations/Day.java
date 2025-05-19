package org.example.intermediate.enumerations;

// - Los enums en Java son un tipo de datos especial que permite que una variable sea un conjunto de constantes predefinidas.
// - Se utilizan para definir una colección de constantes que se conocen en el momento de la compilación,
// como días de la semana, direcciones o estados.
// - Los enums mejoran la seguridad y legibilidad de los tipos en su código al proporcionar una forma de representar
// conjuntos fijos de constantes.


// --------- Consejos y buenas prácticas ----------
// Utiliza Enums para Conjuntos Constantes: Utiliza enums cuando tengas un conjunto fijo de constantes que
// estén relacionadas lógicamente.
//Tipo Seguridad: Los Enums proporcionan seguridad de tipo en tiempo de compilación, garantizando que no se asignen
// valores no válidos a las variables.
//Métodos y campos: Los Enums pueden tener campos, métodos y constructores, lo que permite un comportamiento más
// complejo y la encapsulación de datos.
//Declaraciones de cambio: Los Enums funcionan bien con las sentencias switch, lo que hace que el código sea más legible
// y fácil de mantener.
//Evita utilizar ordinales: Evita utilizar el metodo ordinal de los enum para la persistencia o la lógica, ya que puede
// dar lugar a errores si cambia el orden de los enum.



// Metodos de Enums
// name(): Devuelve un String con el nombre de la constante
// ordinal(): Devuelve un Int con la posicion del enum segun esta declarada
// values(): Devuelve un array que contiene todos los elementos del enum
// valuesOf(String name): Se utiliza para obtener la constante del enum cuyo nombre coincide con la
// cadena proporcionada

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public enum Day {
    // constantes definidas desntro de la enumeracion
    MONDAY("Start of the week"),
    TUESDAY("Second day"),
    FRIDAY("Almost week!");

    private final String description;

    // constructor de una enumeracion
    Day(String description) {
        this.description = description;
    }


    // Metodo de una enumeración
    public String getDescription() {
        return this.description;
    }
}

// Enum con metodos
enum Size {
    SMALL, MEDIUM, LARGE;

    public String getSize() {
        return switch (this) {
            case SMALL -> "Small size";
            case MEDIUM -> "Medium size";
            case LARGE -> "Large size";
            default -> "Unknown size";
        };
    }
}

enum TypeofDocument {
    DNI {
        public boolean validate(String value) {
            return value.matches("\\d{8}");
        }
    },
    PASSPORT {
        public boolean validate(String value) {
            return value.matches("[A-Z]{2}\\d{6}");
        }
    };

    public abstract boolean validate(String value);
}


// 2. Mapeo inverso: String → Enum (útil en APIs REST)
enum Rol {
    ADMIN("admin"), USER("user");

    private String value;

    Rol(String value) {
        this.value = value;
    }

    public static Rol fromValue(String value) {
        return Arrays.stream(values())
                .filter(r -> r.value.equals(value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Rol invalido" + value));
    }
}