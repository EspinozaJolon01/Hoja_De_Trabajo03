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
public class Eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite un numero entero: ");
        num = scanner.nextInt();

        int factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;

        }

        System.out.println("El factorial de: " + num + "es: " + factorial);
    }

}
