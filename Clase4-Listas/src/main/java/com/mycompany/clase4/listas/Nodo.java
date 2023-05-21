/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4.listas;

/**
 *
 * @author rexgr
 */
public class Nodo {
    private int valor;//almacena el valor
    private Nodo siguiente;//enlaza al siguiente nodo
    
    public void Nodo()/*Constructor de la clase*/{
            this.valor=0;
            this.siguiente=null; 
    }
        //metodos de nuestra clase

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
        
       
}
