/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase6_2;

/**
 *
 * @author rexgr
 */

import java.util.Scanner;

public class Clase6_2 {

    public static void main(String[] args) {
        //ejecutable principal
        Scanner escribir = new Scanner(System.in);
        Scanner nododatoss = new Scanner(System.in);
        int nododato;
        int opcion = 0;
        
        //Crear lista Doblemente Enlazada
        Lista lista1=new Lista();
        //menu
        while( opcion != 6){
            System.out.println("-----Lista Circular Doblemente Enlazada-----");
            System.out.println("1. Insertar Nodo");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Buscar en Lista");
            System.out.println("4. Modificar ");
            System.out.println("5. Eliminar");
            System.out.println(" 6. Salir ");
            System.out.println("\n Ingresar opción: ");
            opcion = escribir.nextInt();
            
            opcion=escribir.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nodo inicial");
                    nododato = nododatoss.nextInt();
                    lista1.ingresar(nododato);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Lista de Datos");
                    lista1.mostrar();
                    System.out.println("\n");
                    break;
                    
                case 3:
                    System.out.println("Buscar Valor en la lista");
                    nododato = nododatoss.nextInt();
                    lista1.buscar(nododato);
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("Modificar valor:");
                    nododato = nododatoss.nextInt();
                    lista1.modificar(nododato);
                    System.out.println("\n");
                    break;
                    case 5:
                    System.out.println("Eliminar valor");
                    nododato = nododatoss.nextInt();
                    lista1.eliminar(nododato);
                    System.out.println("\n");
                    break;
            }
        }
    }
}
