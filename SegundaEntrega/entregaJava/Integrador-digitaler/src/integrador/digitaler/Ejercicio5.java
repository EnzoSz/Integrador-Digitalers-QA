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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // crear un programa que solicite al usuario una cantidad x de sueldos y nos muestre sueldo mas alto, mas bajo y promedio de todos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese cantidad de sueldos a cargar: ");
        int numero = teclado.nextInt();

        int[] sueldos = new int[numero];

        int total = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° Sueldo: ");
            sueldos[i] = teclado.nextInt();

            total = total + sueldos[i];
            if (sueldos[i] > mayor) {
                mayor = sueldos[i];
            }
            if (menor == 0) {
                menor = sueldos[0];
            }
            if (menor > sueldos[i]) {
                menor = sueldos[i];
            }
        }

        System.out.println("Usted ingresó " + numero + " sueldos, estos son:");
        System.out.println(Arrays.toString(sueldos));
        System.out.println("El sueldo más alto es: $" + mayor);
        System.out.println("El sueldo más bajo es: $" + menor);
        System.out.println("El promedio de todos los sueldos es: $" + total / numero);
    }

}
