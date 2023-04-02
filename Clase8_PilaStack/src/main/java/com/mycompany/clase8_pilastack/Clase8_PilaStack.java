/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8_pilastack;

import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author rexgr
 */


public class Clase8_PilaStack {

    public static void main(String[] args) {
        Stack<Number>pila=new Stack<Number>();
        pila.push(10);
        pila.push(15);
        pila.push(20);
        pila.push(25);
        pila.push(30);
        
        System.out.println("NUMEROS INGRESADOS ORIGINALMENTE");
        for(int i=0; i < pila.size(); i++){
            System.out.println(pila.get(i));
        }
        
        pila.pop();
        pila.pop();
        System.out.println("NUMEROS INGRESADOS ELIMINADOS LOS DOS ULTIMOS 30,35");
        for(int i=0; i < pila.size(); i++){
        System.out.println(pila.get(i));
        }
    }
}
