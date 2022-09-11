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
public class Eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite un numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite otro numero: ");
        num2 = scanner.nextInt();

        System.out.println("------------------evaluacion de numeros-----------------------");

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1 + " El numero menor es: " + num2);
        } else if (num1 == num2) {
            System.out.println("Lo numero son iguales");
        } else {
            System.out.println("El numero mayor es: " + num2 + " El numero menor es: " + num1);
        }

    }

}
