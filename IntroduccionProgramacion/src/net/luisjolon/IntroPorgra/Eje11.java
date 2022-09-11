/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package net.luisjolon.IntroPorgra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        double peso, peso1 = 0;
        int contador1 = 0, contador2 = 0, contador3 = 0;

        do {

            System.out.println("Digite el peso: ");
            peso = scanner.nextDouble();

            if (peso >= 9.8 && peso <= 10.2) {
                contador1++;
            }

            if (peso > 10.2) {
                contador2++;
            }

            if (peso < 9.8) {
                contador3++;
            }

            peso1++;

        } while (peso != 0);

        System.out.println("Las piezas tiene entre 9.8 a 10.2kg: " + contador1);
        System.out.println("Mas de 10.2kg: " + contador2);
        System.out.println("Los menoros de 9.8kg: " + contador3);
        System.out.println("El total de piezas son: " + peso1);

    }

}
