/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador.digitaler;

import java.util.Scanner;

/**
 *
 * @author enzos
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        /**
         * Hacer un programa que solicite al usuario un número entre 0 y 9.999 e
         * imprimir por pantalla cuántas cifras tiene este número. Si el valor
         * ingresado por el usuario es menor a cero o mayor a 9.999 deberá
         * informar que no pertenece al rango solicitado.
         */
        
        Scanner sc = new Scanner(System.in);
        
        //declaro variable donde almaceno el numero 
        int numero= 0;
        
        //solicito al usuario que ingrese un numero mayor que 0 y menor que 10.000
        
        System.out.println("Ingrese un numero entre 0 y 9.999");
        numero = sc.nextInt();
        
        //verifico que el numero este dentro del rango
        
        if (numero >=0 && numero <= 9999) {
            //convierto el numero a string
            String numStr = String.valueOf(numero);
            
            //calculo la cantirdad de caracteres que tiene el string
            
            int cifras = numStr.length();
            
            //muestro el resultado
            System.out.println("La cantidad de cifras que tiene el numero ingresado es: "+ cifras);
        } else {
            System.out.println("El numero ingresado esta fuera del rango");
        }
    }

}
