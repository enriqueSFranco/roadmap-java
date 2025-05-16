package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {
        // if - else
        var age = 18;
        if (age == 18) {
            System.out.println("Apenas acabo de cumplir 18");
        } else if (age >= 18) {
            System.out.println("Soy mayor de edad");
        } else {
            System.out.println("NO soy mayor de edad");
        }

        // switch
        var dayNumber = 1;
        switch (dayNumber) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");
        }

        // 🧩 Coincidencia de patrones en switch
        var obj = 10;
//        switch (obj) {
//            case Integer i -> System.out.println("Es un entero: " + i);
//            case String s -> System.out.println("Es un string: " + s);
//            default -> System.out.println("Tipo de dato desconocido");
//        }

//        final var DIRECTION = "WEST";
//        switch (DIRECTION) {
//            case "NORTH" -> 0;
//            case "SOUTH" -> 180;
//            case "EAST" -> 90;
//            case "WEST" -> {
//                System.out.println("Go west!");
//                yield 270;
//            }
//        }
    }
}
