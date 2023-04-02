/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8_pilalista;

/**
 *
 * @author rexgr
 */
public class Nodo {
    //Atributos
    String nombre;
    int edad;
    
    public Nodo siguiente;
     //Constructor de nodo
    private void Nodo(){
        this.nombre="";
        this.edad=0;
        this.siguiente=null;
    }
    //metodo para nombre y edad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //metodo para siguiente

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
