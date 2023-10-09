/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integrador.digitaler;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author enzos
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // crear un programa que solicite al usuario 5 numeros y los ordene de menor a mayor y de mayor a menor
        Scanner pidoNumeros = new Scanner(System.in);

        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = pidoNumeros.nextDouble();
        }

        // Ordenar de mayor a menor
        Arrays.sort(numeros);
        System.out.println("Ordenado de menor a mayor: " + Arrays.toString(numeros));

    }

}
