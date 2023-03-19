/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase5;

import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Clase5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner DatoN = new Scanner(System.in);
        LDE lista = new LDE();
        
        int DNodo;
        int option = 0;
        
        while (option != 7) {            
            System.out.println("Lista Doblemente Enlazada");
            System.out.println("-------------------------");
            System.out.println("1. Agregar valor inicial.");
            System.out.println("2. Agregar valor final");
            System.out.println("3. Mostrar lista.");
            System.out.println("4. Eliminar Dato al inicio.");
            System.out.println("5. Eliminar Dato al final.");
            System.out.println("6. Buscar valor");
            System.out.println("7. Salir.");
             System.out.println("------------------------");
            System.out.print("\nIngresa opción: ");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Ingresar valor inicial del Nodo: ");
                    DNodo = DatoN.nextInt();
                    lista.insertarInicio(DNodo);
                    System.out.println("Ingresado!");
                    break;
                case 2:
                    System.out.println("Ingresar valor final del Nodo: ");
                    DNodo = sc.nextInt();
                    lista.insertarFinal(DNodo);
                    System.out.println("Ingresado!");
                    break;
                case 3:
                    lista.mostrar();
                    break;
                case 4:
                    lista.eliminarInicio();
                    break;
                case 5: 
                    lista.eliminarFinal();
                    break;
                case 6:
                    System.out.println("Buscar valor: ");
                    int busqueda = sc.nextInt();
                    Nodo encontrado = lista.buscar(busqueda);
                    if (encontrado != null)  {
                        System.out.println("El valor sí existe!");
                    } else {
                        System.out.println("El valor no existe!");
                    }
                    break;
            }
        }
    }
}
