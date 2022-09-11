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
public class Eje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite un numero: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > 3 && num2 > num3) {
            System.out.println("Primero: " + num1 + "\n Segundo: " + num2 + "\n Tercero: " + num3);
        } else if (num1 > num3 && num1 > num2 && num3 > num2) {
            System.out.println("Primero: " + num1 + "\n Segundo: " + num3 + "\n Tercero: " + num2);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("Primero: " + num2 + "\n Segundo: " + num1 + "\n Tercero: " + num3);
        } else if (num2 > num3 && num2 > num1 && num3 > num1) {
            System.out.println("Primero: " + num2 + "\n Segundo: " + num3 + "\n Tercero: " + num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println("Primero: " + num3 + "\n Segundo: " + num1 + "\n Tercero: " + num2);
        } else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.println("Primero: " + num3 + "\n Segundo: " + num2 + "\n Tercero: " + num1);
        }
    }

}
