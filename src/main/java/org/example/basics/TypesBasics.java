package org.example.basics;

// Tipos de datos primitivos en Java:
public class TypesBasics {
    // --- Numeric types ---
    private byte byteValue = 100; // -128 a 127
    private short shortValue = 10000; // -32.768 a 32.767
    private int intValue = 100000;
    private long longValue = 100000L;

    // --- Floating-point types ---
    private double doubleValue = 123.4;
    private float floatValue = 234.5f;

    // --- Other primitives ---
    private boolean booleanValue = true;

    private char charValue = 'A';

    // Public getters in case other components need access (e.g., for testing)
    public byte getByteValue() {
        return byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    /**
     * Returns a formatted string representing all primitive values.
     */
    public String describeAll() {
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

    public void printAll() {
        System.out.println(describeAll());
    }
}
