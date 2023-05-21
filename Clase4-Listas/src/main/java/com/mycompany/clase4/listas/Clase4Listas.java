/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4.listas;

import java.util.Scanner;

/**
 *
 * @author rexgr
 */
 
public class Clase4Listas {

    public static void main(String[] args) throws Exception {
       //ejecutar lista enlazada
            //declarar las variables 
        Scanner escribir=new Scanner(System.in);
        Scanner nododatoss=new Scanner(System.in);
        Scanner posicionnodo=new Scanner(System.in);
        
        int nododato;
        int posnodo;
        int opcion=0;
        
        //Crear lista de Nodos
        Lista lista=new Lista();
            
            while(opcion!=7){
                System.out.print("*****MENU PRINCIPAL LISTAS ENLAZADAS*****");
                System.out.print("\n1.Agregar nodo al final de la Lista");
                System.out.print("\n2.Mostrar Lista");
                System.out.print("\n3.Tamaño de Lista");
                System.out.print("\n4.Buscar el valor en la Lista");
                System.out.print("\n5.Busca un dato del nodo y Eliminarlo");
                System.out.print("\n6.Consulta si la lista está vacía");
                System.out.print("\n7.Salir del Menu");
                System.out.print("\n*****************************************");
                System.out.println("\n\nIngresar el numero de opcion>");
                opcion=escribir.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("Agregar nodo al final de la lista");
                        nododato=nododatoss.nextInt();
                        lista.agregarAlFinal(nododato);
                        break;
                    case 2:
                        System.out.println("<--Lista-->");
                        lista.listar();
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("\n\n<--Tamaño es-->"+lista.getTamaño());
                        break;
                    case 4:
                        System.out.println("Indique el valor que desea buscar:");
                        nododato=nododatoss.nextInt();
                        if(lista.buscar(nododato)==true){
                            System.out.println("\n<<-El dato exite-->>");
                        }else{
                            System.out.println("\n<<-El dato no exite-->>");
                        }
                        break;
                    case 5:
                        System.out.println("\nIngrese el valor del nodo que desea eliminar>");
                        nododato=nododatoss.nextInt();
                        lista.removerPorReferencia(nododato);
                        break;
                    case 6:
                        System.out.println("\nConsulta si la lista está vacía>");
                       if(lista.esVacia()==true){
                           System.out.println("\n***La lista está vacía***\n");
                       }else{
                           System.out.println("\n**La lista no está vacía**\n");
                       }
                        break;
                    case 7:
                        System.out.println("\n**Salida del Menú**");
                        break;
                }
            }
    }
   } 

