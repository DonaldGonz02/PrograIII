/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase12.arbolbinario;

/**
 *
 * @author rexgr
 */
public class Abb {
    private class nodoArbol {
       
    //Atrtibutos arbol abb
        public nodoArbol raiz;
    }
 // Constructor Arbol abb
    public void Abb(){
        nodoArbol raiz = new nodoArbol();
    }
    
     // Metodo que indica si el arbol esta vacio
    
    public boolean esVacio(){
        return (raiz == null);
    }
    // Procedimiento de Insertar en este se agregara si el elemento es menor del lado izq y sino derecho
    public void insertar(int a){
       
        //Si el arbol esta vacio entonces ingresamos la raiz
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = a;
            nuevo.hd = new Abb();
            nuevo.hi = new Abb();
            raiz = nuevo;
        }
        // De  lo contrario tengo que ver si es mayor o menor
        else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
        }
    }
    
      public void preOrder(){
        if (!esVacio()) {
            System.out.print( raiz.dato + ", "  );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
 
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print( raiz.dato + ", "  );
            raiz.hd.inOrder();
        }
    }
 
    public void posOrder(){
        if (!esVacio()) {
            raiz.hi.posOrder();
            raiz.hd.posOrder();
            System.out.print( raiz.dato + ", "  );
 
        }
    }
 
    public Abb buscar(int a){
        Abb arbolito = null;
        if (!esVacio()) {
          if (a == raiz.dato) {
           return this;
           }
          else {
            if (a < raiz.dato) {
              arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
   }
 
   // public boolean existe(int a){
   // if (!esVacio()) {
     //       if (a == raiz.dato) {
       //     return true;
         //   }
           // else {
             //   if (a < raiz.dato) {
               //     raiz.hi.existe(a);
               // }
               // else {
               //     raiz.hd.existe(a);
               // }
           // }
       // }
       // return false;
   // }
 // Este metodo nos ayudara a saber cuantos elementos tiene nuestro arbol
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
 // Este metodo nos ayuda a saber cual es la altura o profundidad de nuestro arbol toma el que es mayor y le suma 1
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }
 // Este nos da el valor minimo de nuestro arbol
    public int buscarMin() {
        abb arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;
    }
 
  // Este nos da el valor maximo de nuestro arbol
    public int buscarMan() {
        Abb arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.dato;
            arbolActual.raiz=null;
        return devuelvo;
    }
 
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
 
// Este nos permite eliminar un valor que hay
    public void eliminar(int a) {
        Abb paraEliminar = buscar(a);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
                paraEliminar.raiz = null;
            }
            else {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();
                }
                else {
                    if (paraEliminar.raiz.hi.esVacio()) {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }else{
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }
        }
    }
        
}

 
