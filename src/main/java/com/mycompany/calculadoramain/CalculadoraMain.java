/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadoramain;

import java.util.Scanner;

/**
 *
 * @author truco
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Verificar si una palabra es un palíndromo");
        System.out.println("2. Realizar operaciones matemáticas");
        int opcion = scanner.nextInt();

        if (opcion == 1) {

            System.out.println("Ingrese una palabra para verificar si es un palíndromo:");
            String palabra = scanner.next();
            if (Palindrome.isPalindrome(palabra)) {
                System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
            } else {
                System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
            }
        } else if (opcion == 2) {

            System.out.println("Ingrese dos números enteros:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            int operacion = scanner.nextInt();
            try {
                switch (operacion) {
                    case 1:
                        System.out.println("La suma es: " + Calculadora.sum(num1, num2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + Calculadora.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("La multiplicación es: " + Calculadora.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("La división es: " + Calculadora.divide(num1, num2));
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
