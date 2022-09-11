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
public class Eje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        String contrasenia, usuario, ingresoUsu, ingresoContra;

        System.out.println("-------------------Registrarse-----------------");

        System.out.println("Ingrese su usuario: ");
        usuario = scanner.nextLine();

        System.out.println("Ingrese su contraseña, ejemplo(asdefgeda):  ");
        contrasenia = scanner.nextLine();

        System.out.println("------------------Inicio de sesion-----------------------");
        System.out.println("Su usuario: ");
        ingresoUsu = scanner.nextLine();

        if (!usuario.equals(ingresoUsu)) {
            System.out.println("usuario incorrecto");
        } else {
            System.out.println("Inicio de sesion correcto");
        }

    }

}
