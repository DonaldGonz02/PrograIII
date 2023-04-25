/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LisDobleEnlace;

/**
 *
 * @author rexgr
 */
public class Nodo {
    private Lista data;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo(Lista data) {
        this.data = data;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Lista getLista() {
        return data;
    }

}
