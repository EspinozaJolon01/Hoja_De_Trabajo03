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
public class Eje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        int nota1, nota2, nota3, nota4, resultado1, resultado2, resultado3, resultado4, total;

        do {
            System.out.println("1. Digite una nota: ");
            nota1 = scanner.nextInt();
            System.out.println("2. Digite una nota: ");
            nota2 = scanner.nextInt();
            System.out.println("3. Digite una nota: ");
            nota3 = scanner.nextInt();
            System.out.println("4. Digite una nota: ");
            nota4 = scanner.nextInt();

        } while (nota1 < 0 || nota1 >= 101);

        resultado1 = (nota1 * 20) / 100;
        resultado2 = (nota2 * 20) / 100;
        resultado3 = (nota3 * 30) / 100;
        resultado4 = (nota4 * 30) / 100;

        total = (resultado1 + resultado2 + resultado3 + resultado4);

        if (total <= 60) {
            System.out.println("Perdida");
        } else if (total >= 61 && total <= 70) {
            System.out.println("Decente");
        } else if (total >= 71 && total <= 80) {
            System.out.println("aceptable");
        } else if (total >= 81 && total <= 100) {
            System.out.println("Excelente");
        }

    }

}
