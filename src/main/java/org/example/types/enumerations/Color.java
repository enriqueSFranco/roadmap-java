package org.example.types.enumerations;

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    // campo de un enum
    private String hexColor;

    // constructor de una enumeración
    Color(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getHexColor() {
        return this.hexColor;
    }
}
