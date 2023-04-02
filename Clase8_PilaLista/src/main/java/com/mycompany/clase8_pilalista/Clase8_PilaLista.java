/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8_pilalista;

import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Clase8_PilaLista {

    public static void main(String[] args) {
        //ejecutable principal
        Scanner escribir = new Scanner(System.in);
        Scanner Name = new Scanner(System.in);
        Scanner Age = new Scanner(System.in);
        
        String nombre;
        int edad;
        int opcion = 0;
        
        //Crear Pilaaa!
        Pila pila1=new Pila();
        //menu
        while( opcion != 4){
            System.out.println("-----Pila Simplemente Enlazada-----");
            System.out.println("1.Insertar");
            System.out.println("2.Visualizar");
            System.out.println("3.Eliminar");
            System.out.println("4. Salir ");
            System.out.println("\n Ingresar opción: ");
            opcion = escribir.nextInt();
            
            opcion=escribir.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese Nombre:");
                    nombre = Name.next();
                    System.out.println("Ingrese la edad:");
                    edad=Age.nextInt();
                    pila1.agregarAlFinal(nombre,edad);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Visualización de Datos");
                    pila1.listar();
                    System.out.println("\n");
                    break;
                    
                case 3:
                    System.out.println("Eliminar valor");
                    nombre = Name.next();
                    edad=Age.nextInt();
                    pila1.removerPorUltimo(nombre,edad);
                    System.out.println("\n");
                    break;
            }
        }
    }
}
