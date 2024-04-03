/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoramain;

/**
 *
 * @author truco
 */

class Calculadora {

    //  suma de dos números
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    //  resta de dos números
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    //  multiplicación de dos números
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // división de dos números
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (double) num1 / num2;
    }
}
