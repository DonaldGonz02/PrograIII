/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10.arbolbinam;

/**
 *
 * @author rexgr
 */
public class Nodo {
    //Atributos
    private String dato;
    private Nodo hijoizq;
    private Nodo hijoder;
    
    //Constructor
    public Nodo (String dat){
        this.dato=dat;
        this.hijoizq=null;
        this.hijoder=null;
    }
    
    //Constroladores
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(Nodo hijoizq) {
        this.hijoizq = hijoizq;
    }

    public Nodo getHijoder() {
        return hijoder;
    }

    public void setHijoder(Nodo hijoder) {
        this.hijoder = hijoder;
    }
    
}
