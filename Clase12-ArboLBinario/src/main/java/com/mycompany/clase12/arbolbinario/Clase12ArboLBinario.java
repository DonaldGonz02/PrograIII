/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase12.arbolbinario;
import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Clase12ArboLBinario {

    public static void main(String[] args) {
             // ARBOL BINARIOS
    // Creo mi arbol
    Abb arbol1 = new Abb();
     NodoArbol da = new NodoArbol() ;
    // Opcio n del Menu
    Scanner opcion= new Scanner(System.in);
      int op=0;
     // Variables de Llenado y de busqueda 
    Scanner dato= new Scanner(System.in);
    int dat=0;
    Scanner datob= new Scanner(System.in);
    int datb=0;
        
         // Menu Principal
        while (op != 10){ 
        System.out.println("          *****MENU ARBOL BINARIO BUSQUEDA****");
        System.out.println("          * 1. Ingreso al Daro Arbol         *");
        System.out.println("          * 2. Eliminar en el Arbol          *");    
        System.out.println("          * 3. Visualizacion PosOrden        *"); 
        System.out.println("          * 4. Visualizacion PreOrden        *"); 
        System.out.println("          * 5. Visualizacion InOrden         *"); 
        System.out.println("          * 6. Altura o Profundidad del Arbol*");
        System.out.println("          * 7. Cantidad de Nodos             *"); 
        System.out.println("          * 8. Minimo Valor en el Arbol      *");
        System.out.println("          * 9.Maximo Valor en el Arbol      *");
        System.out.println("          * 10.Salida                        *");    
        System.out.println("          ***********************************"); 
        System.out.println("          Ingrese numero de su opcion >  ");
        op= opcion.nextInt(); // Almacenar opcion
        // Case de opciones d mi menu
        switch(op){
                   case 1:
                // Ingreso de datos en el arbol
                System.out.println("Ingrese Dato para almacenar en el arbol >");
                dat = dato.nextInt();
                arbol1.insertar(dat);
                break;
            case 2:
               // Eliminacion de datos en el arbol
                System.out.println("Ingrese Dato para Eliminar en el arbol >");
                datb = datob.nextInt();
                arbol1.eliminar(datb);
                break;
            case 3:
                System.out.println("Recorrido y visualizacion PosOrden >");
                arbol1.posOrder();
                System.out.println("\n");
                break;
            case 4:
                System.out.println("Recorrido y visualizacion PreOrden >");
                arbol1.preOrder();
                System.out.println("\n");
                break;
            case 5:
                System.out.println("Recorrido y visualizacion InOrden >");
                arbol1.inOrder();
                System.out.println("\n");
                break;
            //case 6:
              //  System.out.println("Ingrese Dato que desea buscar >");
                //datb = datob.nextInt();
                //System.out.println(arbol1.existe(datb) + " Existe dato >");
                //break;
           case 6:
                datb= arbol1.altura();
                System.out.println("La Altura o Profundidad del arbol es  >" + datb);
                break;
            case 7:
                datb= arbol1.cantidad();
                System.out.println("La Cantidad de elementos del arbol es  >" + datb);
                break;
            case 8:
                datb= arbol1.buscarMin();
                System.out.println("El Valor Minimo del arbol es  >" + datb);
                break;
            case 9:
                datb= arbol1.buscarMan();
                System.out.println("El Valor Minimo del arbol es  >" + datb);
                break;
                
                
                
            case 10:
               System.out.println("Salida del Programa ");
               break;
              }

        }
    }
}

