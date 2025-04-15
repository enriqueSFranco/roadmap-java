package org.example.types.enumerations;

//Los enums en Java son un tipo de datos especial que permite que una variable sea un conjunto de constantes predefinidas.
// Se utilizan para definir una colección de constantes que se conocen en el momento de la compilación,
// como días de la semana, direcciones o estados. Los enums mejoran la seguridad y legibilidad de los tipos en su código
// al proporcionar una forma de representar conjuntos fijos de constantes.

public enum Day {
    MONDAY("Start of the week"),
    TUESDAY("Second day"),
    FRIDAY("Almost week!");

    private final String description;

    Day(String description) {
        this.description = description;
    }
    // Método de una enumeración
    public String getDescription() {
        return this.description;
    }
}

