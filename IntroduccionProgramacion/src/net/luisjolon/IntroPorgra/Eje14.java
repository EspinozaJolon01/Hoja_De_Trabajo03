/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package net.luisjolon.IntroPorgra;

/**
 *
 * @author Usuario
 */
public class Eje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("-----------------encontrar la integral ---------------------------- ");

        double total2 = 0;
        double total3 = 0;

        double total1, total4, result1, result2;
        double resultado;

        total1 = (int) Math.pow(0, 2) + (0);
        total4 = (int) Math.pow(10, 2) + (10);
        result2 = total1 + total4;

        for (int i = 1; i <= 9; i += 2) {
            int num1 = (int) Math.pow(i, 2) + (i);

            num1 *= 4;

            total2 += num1;

        }

        for (int i = 2; i <= 9; i += 2) {
            int num2 = (int) Math.pow(i, 2) + (i);
            num2 *= 2;

            total3 += num2;

        }

        result1 = (total2 + total3);

        resultado = result2 + result1;

        System.out.print("La respuesta a la Integral es: " + resultado / 3);

        //nota voy a tratar de simplificar el codigo
    }

}
