package org.example.intermediate.enumerations;

public enum Operation {
    SUM {
        public double apply(int x, int y) { return (double) x + y; }
    },
    SUBTRACT {
        public double apply(int x, int y) { return (double) x - y; }
    },
    MULTIPLY {
        public double apply(int x, int y) { return (double) x * y; }
    },
    DIVIDE {
        public double apply(int x, int y) {
            // Best Practice 1: Check for division by zero before performing the operation
            if (y == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                System.out.println("Hint: Try using a non-zero denominator.");
                return Double.NEGATIVE_INFINITY;
            }

            System.out.println("Attempting to divide " + x + " by " + y);
            // Best Practice 2: Use try-catch as a safety net
            try {
                return (double) x / y;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Setting result to a default value of -1");
                return -1;
            }
        }
    };

    public abstract double apply(int x, int y);
}
