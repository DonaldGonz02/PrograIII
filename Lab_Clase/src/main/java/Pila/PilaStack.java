/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import java.util.Stack;
/**
 *
 * @author rexgr
 */
public class PilaStack {
     private final Stack<Data> pila;

    public PilaStack() {
        pila = new Stack<Data>();
        limpiar();
    }

    public void limpiar() {
        pila.clear();
    }

    public void setDato(Data dato) {
        pila.push(dato);
    }

    public int getSize() {
        return pila.size();
    }

    public String getValue() {
        String value = getValue(getSize() - 1);
        pila.pop();
        return value;
    }

    public String getValue(int position) {
        Data value = pila.get(position);
        return value.toString();
    }

    public void imprimir() {
        if (pila.size() == 0) {
            System.out.println("Pila Vacia!!!");
            return;
        }
        for (int index = 0; index < pila.size(); index++) {
            System.out.println("[posicion=" + index + ", valor=" + pila.get(index) + "]");
        }
    }
}
