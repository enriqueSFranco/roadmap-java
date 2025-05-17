package org.example.intermediate.oop;

/*
 * 📌 Conceptos clave sobre "sealed classes" en Java:
 *
 * 1. ¿Qué es una sealed class?
 *    - Es una clase que restringe qué otras clases pueden extenderla.
 *    - Introducida en Java 15 (preview) y estable desde Java 17.
 *
 * 2. ¿Por qué usar sealed classes?
 *    - Para tener más control sobre la herencia.
 *    - Para asegurar que solo un conjunto específico de clases pueda heredar de una clase base.
 *    - Útil cuando quieres modelar una jerarquía cerrada, como tipos limitados (ej. solo Círculo o Rectángulo pueden ser una Figura).
 *
 * 3. Palabras clave relacionadas:
 *    - sealed: Declara la clase sellada (ej. sealed class Shape).
 *    - permits: Lista explícita de clases que pueden extenderla.
 *    - final: La subclase no puede ser extendida más.
 *    - non-sealed: La subclase puede ser extendida sin restricciones.
 *
 * 4. Reglas importantes:
 *    - Si una clase tiene métodos abstractos, debe ser también abstract.
 *    - Todas las subclases deben estar en el mismo archivo o ser accesibles por el compilador.
 *    - Las subclases deben declarar si son final, sealed o non-sealed.
 *
 * 5. ¿Cuándo usarlas?
 *    - Cuando quieres limitar el número de implementaciones posibles.
 *    - En modelos que no deben ser extendidos libremente (por ejemplo: tipos de eventos, formas geométricas, comandos, etc.).
 *    - Para facilitar mantenibilidad y evitar errores al extender clases.
 *
 * ✅ Ejemplo típico:
 *    sealed abstract class Shape permits Circle, Rectangle { ... }
 *    final class Circle extends Shape { ... }
 *    final class Rectangle extends Shape { ... }
 */

import java.util.logging.Logger;

sealed abstract class Shape permits Circle, Rectangle {
    public abstract double area();
}


final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

final class Rectangle extends Shape {
    private final double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(this.side, 2);
    }
}

// ejemplo
sealed abstract class Expr permits Constant, Multiply, Add {
    public abstract int eval();
}

final class Add extends Expr {
    private final Expr left, right;

    public Add(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval() {
        return this.left.eval() + this.right.eval();
    }
}

final class Constant extends Expr {
    private int val;

    public Constant(int val) {
        this.val = val;
    }

    @Override
    public int eval() {
        return this.val;
    }
}

final class Multiply extends Expr {
    private final Expr left, right;

    public Multiply(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval() {
        return this.left.eval() * this.right.eval();
    }
}

public class SealedClass {
    private final static Logger logger = Logger.getLogger(SealedClass.class.getName());

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10);
        logger.info("Area del rectangulo: " + rectangle.area());

        Circle circle = new Circle(2.5d);
        logger.info("Area del circulo: " + circle.area());


        Expr expr = new Multiply(
                new Add(new Constant(5), new Constant(3)),
                new Constant(5)
        );

        logger.info("Expr: " + expr.eval());
    }
}
