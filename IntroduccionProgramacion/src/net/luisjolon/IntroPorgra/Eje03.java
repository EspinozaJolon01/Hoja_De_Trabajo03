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
public class Eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int num1;

        System.out.println("Digite un numero");
        num1 = scanner.nextInt();

        if (num1 % 2 == 0 && num1 > 0) {
            System.out.println("El numero es par");
            System.out.println("Es par");
        } else if (num1 % 2 != 0 && num1 < 0) {
            System.out.println("El numero es impar");
            System.out.println("Es negativo");
        } else {
            System.out.println("ES CERO");
        }
    }

}
