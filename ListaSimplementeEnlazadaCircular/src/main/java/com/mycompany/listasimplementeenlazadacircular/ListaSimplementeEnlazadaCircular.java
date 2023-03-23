/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimplementeenlazadacircular;
/**
 *
 * @author rexgr
 */
import java.util.Scanner;

public class ListaSimplementeEnlazadaCircular {

    public static void main(String[] args) throws Exception{
        
        Scanner escribir=new Scanner(System.in);
        Scanner nododatoss= new Scanner(System.in);
        
        int nododato;
        
        Scanner posicionnodo=new Scanner(System.in);
        
        int posnodo;
        int opcion=0;
        
        ListaCircular listaCircular = new ListaCircular();
        
        //menu
         while(opcion!= 8){
              System.out.println("------Lista Circular Enlazada------");
              System.out.println("1. Agregar Nodo al Final de la Lista");
              System.out.println("2. Mostrar la lista");
              System.out.println("3. Tamaño de la lista");
              System.out.println("4. Buscar un valor en la lista");
              System.out.println("5. Busca y Eliminar dato de Nodo");
              System.out.println("6. Consulta si la lista esta vacia");
              System.out.println("7. Limpiar la lista circular");
              System.out.println("8. SALIR DEL MENU");
              System.out.println("Ingresa el número de opción -> ");
              opcion = escribir.nextInt();
              
              switch (opcion){
                  
                  case 1:
                      System.out.println("Agregra nodo al final de la lista");
                      nododato = nododatoss.nextInt();
                      listaCircular.agregarAlFinal(nododato);
                      break;
                  
                  case 2:
                      System.out.println("------Lista------");
                      listaCircular.listar();
                      System.out.println("\n");
                      break;
                  case 3:
                      System.out.println("\n\n---Tamaño es -->" + listaCircular.getTamaño());
                      break;
                  case 4:
                      System.out.println("Indique el valor que desea buscar: ");
                      nododato = nododatoss.nextInt();
                      if(listaCircular.buscar(nododato) ==  true){
                      System.out.println("\n<<-- El dato si existe -->>"); }
                              
                   else {
                        System.out.println("\n<<-- El dato no existe -->> ");              
                                      }
                      break;
                                  
                  case 5:
                      System.out.println("\n Ingrese el valor del nodo que desea Elimina >");
                      nododato = nododatoss.nextInt();
                      listaCircular.removerPorReferencia(nododato); 
                      break;
                  
                  case 6:
                      System.out.println("\nConsulta si la lista está vacia");
                      if (listaCircular.esVacia()== true){
                      System.out.println("\n La lista esta vacia!");}
                      else{
                      System.out.println("\n La lista no está vacia!");}
                      break;
                  case 7:
                      listaCircular.eliminar();
                      System.out.println("\n Se eliminaron todos los nodos de la lista");
                      break;
                  case 8:
                      System.out.println("\n ---Vuelve Pronto---");
                      break;
                
            }
              
        }
        
    }
}
