/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio6 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String nombre = scanner.nextLine();   
            System.out.println("Ingrese la nota: ");
            int nota = scanner.nextInt();   
            
         System.out.println("Nombre: " + nombre);
         
         if(nota>65){
        System.out.println("Estado: APROBO");
         }else{
            System.out.println("Estado: REPROBO");
         }
}
}
