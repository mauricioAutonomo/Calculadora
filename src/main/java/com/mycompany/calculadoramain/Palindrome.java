/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoramain;

/**
 *
 * @author truco
 */
class Palindrome {

    // Aqui esta el método recursivo para verificar si una palabra es un palíndromo
    public static boolean isPalindrome(String word) {
        
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
       
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}