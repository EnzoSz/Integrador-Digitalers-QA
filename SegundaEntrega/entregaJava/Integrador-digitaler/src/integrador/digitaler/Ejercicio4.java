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
public class Ejercicio4 {

    public static void main(String[] args) {
        /**
         * Hacer un programa que solicite al usuario un número de 3 dígitos e
         * imprimir por consola TODOS los valores PARES desde el cero hasta el
         * número ingresado.
         */
        
        Scanner sc = new Scanner(System.in);
        
        //declaracion de variables
        
        int numero;
        
        //solicitamos al usuario que ingrese un numero de 3 digitos
        
        System.out.println("Ingrese un numero de 3 digitos");
        numero = sc.nextInt();
        // converitmos el numero a String 
        String numStr = String.valueOf(numero);
        int digitos = numStr.length();
        
        //verificamos que el numero sea de 3 digitos
        
        if (digitos ==3) {
            
            //iteramos desde 0 hasta el numero ingresado
            for (int i = 0; i <= numero; i++) {
                if (i%2 ==0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("El numero ingresado no es de 3 digitos");
        }

    }

}
