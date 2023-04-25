/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LisDobleEnlace;

/**
 *
 * @author rexgr
 */
public class ListaDoblementeEnlazada {
    private Nodo cabeza;
    private Nodo fin;

    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.fin = null;
    }

    private boolean esVacia() {
        return cabeza == null;
    }

    private void enlazar(Nodo nodoA, Nodo nodoB) {
        nodoA.setSiguiente(nodoB);
        nodoB.setAnterior(nodoA);
    }

    public void insertarInicio(Lista data) {
        Nodo nuevo = new Nodo(data);
        if (esVacia()) {
            fin = nuevo;
        } else {
            enlazar(nuevo, cabeza);
        }
        cabeza = nuevo;
    }
    public void insertarFinal(Lista data) {
        Nodo nuevo = new Nodo(data);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            enlazar(fin, nuevo);
        }
        fin = nuevo;
    }

    public void eliminarInicio() {
        if (!esVacia()) {
            Nodo primero = cabeza.getSiguiente();
            if (primero == null) {
                cabeza = null;
                fin = null;
            } else {
                primero.setAnterior(null);
                cabeza = primero;
            }
        }
    }

    public void eliminarFinal() {
        if (!esVacia()) {
            Nodo ultimo = cabeza.getAnterior();
            if (ultimo == null) {
                cabeza = null;
                fin = null;
            } else {
                ultimo.setSiguiente(null);
                cabeza = ultimo;
            }
        }
    }

    public Nodo buscarNumero(int dato) {
        Nodo buscado = null;
        Nodo iterador = cabeza;
        while (buscado == null && iterador != null) {
            if (iterador.getLista().getNumero() == dato) buscado = iterador;
            iterador = iterador.getSiguiente();
        }
        return buscado;
    }

    public void mostrar() {
        Nodo iterador = cabeza;
        System.out.println("----- Inicio de la lista ----");
        while (iterador != null) {
            System.out.print("[" + iterador.getLista().getNumero() + "," + iterador.getLista().getNombre() + "," + iterador.getLista().getDireccion() + "] -> ");
            iterador = iterador.getSiguiente();
        }
        System.out.println("null");
        System.out.println("----- Fin de la lista ----");
    }

}
