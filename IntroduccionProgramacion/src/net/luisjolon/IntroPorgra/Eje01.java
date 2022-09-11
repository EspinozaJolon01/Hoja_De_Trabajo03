/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.luisjolon.IntroPorgra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eje01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;

        System.out.println("Ingrese su edad: ");
        num1 = scanner.nextInt();

        if (num1 <= 3) {
            System.out.println("Es un bebe");
        } else if (num1 >= 4 && num1 <= 12) {
            System.out.println("Es un ninio");
        } else if (num1 >= 13 && num1 <= 21) {
            System.out.println("Es un adolescente");
        } else if (num1 >= 22 && num1 <= 50) {
            System.out.println("Es un adulto");
        } else if (num1 >= 51) {
            System.out.println("Es un adulto mayor");
        }
    }

}
