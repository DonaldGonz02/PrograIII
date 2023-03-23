/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasimplementeenlazadacircular;

/**
 *
 * @author rexgr
 */
public class Nodo {
    //atributos
    private int valor;
    private Nodo siguiente;
    
    //constructores
    public void Nodo(){
        this.valor=0;
        this.siguiente=null;
    }
    //métodos

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
