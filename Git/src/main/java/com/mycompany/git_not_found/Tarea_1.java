/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git_not_found;

/**
 *
 * @author pauhs
 */

import java.util.Scanner;

public class Tarea_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        do {
            System.out.print("Introduce un número entre 1 y 10: ");
            numero = scanner.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("El número debe estar entre 1 y 10. Por favor, inténtalo de nuevo.");
            }
        } while (numero < 1 || numero > 10);
        
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        scanner.close();
    }
}
