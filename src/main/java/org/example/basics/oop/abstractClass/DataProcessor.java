package org.example.basics.oop.abstractClass;

public abstract class DataProcessor {
    // DataProcessor es una clase abstracta que define la estructura del algoritmo
    // (el metodo process())
    protected abstract void readData();
    protected abstract void processData();

    // Constructor en Clase Abstracta: Las clases abstractas pueden tener constructores,
    // que pueden ser llamados durante la instanciación de una subclase.
    public DataProcessor() {
        System.out.println("DataProcessor Constructor");
    }

    public void saveData() {
        System.out.println("Saving data to database...");
    }

    public final void process() {
        readData();
        processData();
        saveData();
    }
}

class CSVProcessor extends DataProcessor {
    protected void readData() {
        System.out.println("Reading data from CSV file...");
    }

    protected void processData() {
        System.out.println("Processing CSV data...");
    }
}

class JSOnProcessor extends DataProcessor {
    protected void readData() {
        System.out.println("Reading data from JSON file...");
    }

    protected void processData() {
        System.out.println("Processing JSON data...");
    }
}
