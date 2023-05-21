/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase12.tablahash;

import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Clase12TablaHash {

    public static void main(String[] args) {
        //tamaño asignado
        int i, n, resp, m;
        
        Scanner tam= new Scanner(System.in);
        Scanner opcion= new Scanner(System.in);
        Scanner dat= new Scanner(System.in);
        System.out.println("Ingrese el Tamaño de la la tabla : ");
        m = tam.nextInt();
        
        //Creando la Tabla
        TablaHash[]h=new TablaHash[m];
        
        // Limpio mi tabla
        for (i = 0; i < m; i++) {
            h[i] = new TablaHash();
            h[i].estado = 0;
        }
        
        do {
            System.out.println("***********MENU TABLA HASH*********");
            System.out.println("* 1. Ingreso dato a tabla hash    *");
            System.out.println("* 2. Buscar dato en tabla hash    *");    
            System.out.println("* 3. Eliminar dato en  tabla hash *");
            System.out.println("* 4. Vista datos tabla hash       *"); 
            System.out.println("* 5. Salida                       *");    
            System.out.println("***********************************"); 
            System.out.println("Ingrese numero de su opcion >  ");
            resp = opcion.nextInt();
            
            switch (resp) {
                case 1:
                    System.out.println("Ingrese el número a ser insertado en la tabla:");
                    n = dat.nextInt(); // Almacenar del dato a la tabla
                    TablaHash.insertHash(h, m, n);
                        break;
                case 2:
                    System.out.println("Ingrese el número a ser buscado en la tabla:");
                    n = dat.nextInt(); // Busqueda del dato a la tabla
                    i = TablaHash.buscaHash(h, m, n);
                    
                    if (i == -1) {
                        System.out.println("Número no encontrado");
                    } else {
                        System.out.println("Número encontrado");
                    }
                    
                    break;
                
                case 3:
                    System.out.println("Ingrese el número a ser eliminado en la tabla:");
                    n = dat.nextInt(); // Eliminado del dato a la tabla
                    i = TablaHash.eliminaHash(h, m, n);
                        
                    if (i == -1) {
                        System.out.println("Número no encontrado");
                    } else {
                        System.out.println("Número elimino con exito");  
                        }
                        
                    break;
                    
                case 4:
                    System.out.println( "Visualizacion de datos en tabla Hash");
                    TablaHash.visualizar(h, m);
                        
                    break;   
                    
                case 5:
                    System.out.println( "***Está Saliendo del Programa****");
                    
                default:
                }
            } while (resp != 5);
        
        }
    }