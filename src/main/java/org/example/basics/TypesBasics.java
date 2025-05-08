package org.example.basics;

// Tipos de datos primitivos en Java:
public class TypesBasics {
    // --- Numeric types ---
    byte byteValue = 100; // -128 a 127
    short shortValue = 10000; // -32.768 a 32.767
    int intValue = 100000;
    long longValue = 100000L;

    // --- Floating-point types ---
    double doubleValue = 123.4;
    float floatValue = 234.5f;

    // --- Other primitives ---
    boolean booleanValue = true;

    char charValue = 'A';

    // --- Constants ---
    final String EMAIL = "kirito@gmail.com";

    // --- Tipo de dato en tiempo de compilación ---
    String color = "black";
    String typeofColor = color.getClass().getSimpleName(); // <-- solo aplica a clases

    // Public getters in case other components need access (e.g., for testing)
    byte getByteValue() {
        return byteValue;
    }

    short getShortValue() {
        return shortValue;
    }

    int getIntValue() {
        return intValue;
    }

    long getLongValue() {
        return longValue;
    }

    float getFloatValue() {
        return floatValue;
    }

    double getDoubleValue() {
        return doubleValue;
    }

    boolean isBooleanValue() {
        return booleanValue;
    }

    char getCharValue() {
        return charValue;
    }

    /**
     * Returns a formatted string representing all primitive values.
     */
    String describeAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("Primitive Types Summary:\n");
        sb.append(String.format("byte:    %d%n", byteValue));
        sb.append(String.format("short:   %d%n", shortValue));
        sb.append(String.format("int:     %d%n", intValue));
        sb.append(String.format("long:    %d%n", longValue));
        sb.append(String.format("float:   %.2f%n", floatValue));
        sb.append(String.format("double:  %.2f%n", doubleValue));
        sb.append(String.format("boolean: %b%n", booleanValue));
        sb.append(String.format("char:    %c%n", charValue));
        return sb.toString();
    }

    void printAll() {
        System.out.println(describeAll());
    }
}
