/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author rexgr
 */
public class NodoPila {
    int Afil;
    String nombre;
    String prod;
    int Uni;
    
    public NodoPila siguiente;
     //Constructor de nodo
    private void NodoPila(){
        this.Afil=0;
        this.nombre="";
        this.prod="";
        this.Uni=0;
        this.siguiente=null;
    }
    //metodo para nombre y edad

    public int getAfil() {
        return Afil;
    }

    public void setAfil(int Afil) {
        this.Afil = Afil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public int getUni() {
        return Uni;
    }

    public void setUni(int Uni) {
        this.Uni = Uni;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
   
}
