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
public class Eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\

        Scanner lector = new Scanner(System.in);

        int num1;

        System.out.println("Ingrese un numero: ");
        num1 = lector.nextInt();

        if (num1 >= 0 && num1 <= 9) {
            System.out.println("tiene una cifra");
        } else if (num1 >= 10 && num1 <= 99) {
            System.out.println("tiene dos cifras");
        } else if (num1 >= 100 && num1 <= 999) {
            System.out.println("tiene Tres cifras");
        } else if (num1 >= 1000 && num1 <= 9999) {
            System.out.println("tiene cautro cifras");
        } else if (num1 >= 10000 && num1 <= 99999) {
            System.out.println("tiene cinco cifras");
        }

    }

}
