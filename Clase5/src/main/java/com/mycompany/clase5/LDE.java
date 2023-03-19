/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author rexgr
 */
public class LDE {
    Nodo cabeza;
    Nodo fin;
    
    public LDE(){
        cabeza = null;
        fin = null;
    }
    //status de la lista
    private boolean estaVacia(){
        boolean vacia=false;
        if(cabeza==null){
            vacia=true;
        }
        return vacia;
    }
    //enlace de nodos 
    private void enlazar(Nodo nodoA, Nodo nodoB){
        nodoA.siguiente = nodoB;
        nodoB.anterior = nodoA;
    }
    //nuevo nodo
    public void insertarInicio(int ndato){
        Nodo nuevo= new Nodo(ndato);
        if(estaVacia()){
            cabeza=nuevo;
            fin=nuevo;
        }else{
            enlazar(nuevo,cabeza);
            cabeza=nuevo;
        }
    }
     public void insertarFinal(int ndato) {
        Nodo nuevo = new Nodo(ndato);
        if ( estaVacia() ) {
            cabeza = nuevo;
            fin = nuevo;
        } else {
            enlazar(fin, nuevo);
            fin = nuevo;
        }
    }

    //eliminar nodo frente a la lista
    public void eliminarInicio(){
        if(!estaVacia()){
            Nodo primero = cabeza.siguiente;
            if(primero==null){
                cabeza=null;
                fin = null;
            }else {
                primero.anterior=null;
                cabeza=primero;
            }
        }
    }
     public void eliminarFinal() {
        if ( !estaVacia() ) {
            Nodo ultimo = fin.anterior;
            if ( ultimo == null ) {
                cabeza = null;
                fin = null;
            } else {
                ultimo.siguiente = null;
                fin = ultimo;
            }
        }
    }

    //buscar
    public Nodo buscar(int dato){
        Nodo buscado=null;
        Nodo iterador=cabeza;
        while(buscado==null && iterador!=null){
           if ( iterador.informacion == dato ) {
                buscado = iterador;
            }
            iterador = iterador.siguiente;
        }
        return buscado;
        }
    //mostrar
    public void mostrar(){
        Nodo iterador=cabeza;
        while(iterador!=null){
            System.out.print(iterador.informacion +" -> ");
            iterador=iterador.siguiente;
        }
        System.out.print("null");
    } 
}
