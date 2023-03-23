/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase6_2;

/**
 *
 * @author rexgr
 */
import java.util.Scanner;

public class Lista {
   
        // Metodos
        int dato;
        Nodo primero;
        Nodo ultimo;
        Scanner teclado = new Scanner(System.in);

        // Constructor
        public Lista(){
            primero = null;
            ultimo = null;
        }

        // Ingresar datos a Nodos
        public void ingresar(int x){
            Nodo nuevo = new Nodo();
            nuevo.dato = x;
            if( primero == null){
                primero = nuevo;
                primero.Siguiente = primero;
                primero.Anterior = ultimo;
                ultimo = nuevo;
            }else {
                ultimo.Siguiente = nuevo;
                nuevo.Siguiente = primero;
                ultimo = nuevo;
                primero.Anterior = ultimo;
            }
        }
        // Mostrar los datos
        public void mostrar(){
            Nodo actual = new Nodo();
            actual = primero;
            do{
            System.out.println(actual.dato);
            actual = actual.Siguiente;
            }while (actual != primero);
            }
        
        //buscar
        public void buscar(int x){

        Nodo actual = new Nodo();
        actual = ultimo;
        boolean encontrado = false;
        do{
            if(actual.dato == x){
            encontrado = true;
            dato = actual.dato;
            }
            actual = actual.Anterior;
        }while (actual != ultimo);
            if (encontrado == true){
            System.out.println("Encontrado!!");
            System.out.println(dato);
            }else {
            System.out.println("No encontrado!!");
            }
        }

        //Modificar datos
        public void modificar(int x){
            Nodo actual= new Nodo();
            actual = primero;
        do{
            if(actual.dato == x){
            System.out.println("Ingrese Nuevo Valor");
            actual.dato = teclado.nextInt();
            }
            actual = actual.Siguiente;
        } while(actual != primero);
        }

        // Eliminar nodo
        public void eliminar(int x){
            Nodo actual= new Nodo();
            Nodo anterior= new Nodo();
            actual = primero;
            anterior = primero;
        do{
        if( actual.dato == x){
            System.out.println("El valor "+x+" ha sido eliminado correctamente");
            anterior.Siguiente = actual.Siguiente;
            actual = anterior;
            }
            anterior = actual;
            actual = actual.Siguiente;
            } while(actual != primero );
    }
}
