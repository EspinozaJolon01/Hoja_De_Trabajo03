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
public class Eje07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        int facul;
        int importe, mesualidad, total, resultado, porcentaje;

        System.out.println("-------Facultades--------------\n");

        System.out.println("1. Ing de sistemas");
        System.out.println("2. Derecho");
        System.out.println("3. Ing Naviera");
        System.out.println("4. Ing Pesquera");
        System.out.println("5. contabiliad");
        System.out.println("6. Administracion\n");
        System.out.print("Ingrese una opcione: ");
        facul = scanner.nextInt();

        switch (facul) {
            case 1:
                importe = 350;
                mesualidad = 650;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;
            case 2:
                importe = 300;
                mesualidad = 550;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;
            case 3:
                importe = 300;
                mesualidad = 500;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;
            case 4:
                importe = 310;
                mesualidad = 460;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;
            case 5:
                importe = 280;
                mesualidad = 490;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;
            case 6:
                importe = 360;
                mesualidad = 520;

                porcentaje = (importe + mesualidad) * (18) / 100;
                total = importe + mesualidad + porcentaje;

                System.out.println("El monto a pagar es de: " + total);

                break;

            default:
                System.out.println("Opciones no validad: " + facul);
        }

    }

}
