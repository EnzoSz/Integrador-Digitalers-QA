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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instanciamos un objeto de la clase scanner
        Scanner sc = new Scanner(System.in);

        /**
         * Ejercicio N°1: Hacer un programa que solicite una nota al usuario y
         * dependiendo de la misma imprimir por pantalla, la nota y el detalle
         * siguiente: -Insuficiente: 0 - 3 -Suficiente: 4 -Bien: 5 y 6 -Notable:
         * 7 y 8 -Sobresaliente: 9 y 10
         */
        //declaramos variables
        int nota;

        //solicitamos al usuario que ingrese una nota y la guardamos en la var nota
        System.out.println("Ingrese una nota del 0 a 10");
        nota = sc.nextInt();

        if (nota >= 0 && nota <= 3) {
            System.out.println("Insuficiente: 0 - 3");
        } else if (nota == 4) {
            System.out.println("Suficiente: 4 ");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien: 5 - 6");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable: 7 - 8");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente: 9 - 10");
        } else {
            System.out.println("Nota fuera de rango");
        }

    }

}
