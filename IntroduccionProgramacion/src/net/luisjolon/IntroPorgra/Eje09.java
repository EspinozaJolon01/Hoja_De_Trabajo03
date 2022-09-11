/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package net.luisjolon.IntroPorgra;

/**
 *
 * @author Usuario
 */
public class Eje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("-------------------comienza el juego------------------");

        int dado1 = (int) (Math.random() * 7);
        int dado2 = (int) (Math.random() * 7);
        int dado3 = (int) (Math.random() * 7);

        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);

        System.out.println("------------resultado del juego---------------------");

        if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
            System.out.println("Excelente");
        } else if (dado1 == 6 && dado2 == 6 && dado3 != 6) {
            System.out.println("Muy bien");
        } else if (dado2 == 6 && dado3 == 6 && dado1 != 6) {
            System.out.println("Muy bien");
        } else if (dado3 == 6 && dado1 == 6 && dado2 != 6) {
            System.out.println("Muy bien");
        } else if (dado1 == 6 && dado2 != 6 && dado3 != 6) {
            System.out.println("Regular");
        } else if (dado2 == 6 && dado3 != 6 && dado1 != 6) {
            System.out.println("Regular");
        } else if (dado3 == 6 && dado2 != 6 && dado1 != 6) {
            System.out.println("Regular");
        } else if (dado1 != 6 && dado2 != 6 && dado3 != 6) {
            System.out.println("pesimo");
        }

    }

}
