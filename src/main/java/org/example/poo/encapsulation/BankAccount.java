package org.example.poo.encapsulation;

/**
 🧠 ¿Qué es la Programación Orientada a Objetos?

 La POO es un paradigma de programación que organiza el código en torno a objetos.
 En vez de escribir funciones sueltas, agrupamos datos (atributos) y acciones (métodos) que tienen sentido juntas,
 dentro de algo llamado una clase.

 🎓 4 pilares fundamentales de la POO

 1. Encapsulamiento (proteger los datos)
 Es como poner los datos dentro de una caja y permitir que solo se acceda a ellos con métodos específicos.

 Ejemplo:
 */

public class BankAccount {
    private double balance;
    private final String accountHolder;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
        balance -= amount;
    }
}

