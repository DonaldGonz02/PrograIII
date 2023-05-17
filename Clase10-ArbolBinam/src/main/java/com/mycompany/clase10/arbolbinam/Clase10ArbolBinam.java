/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase10.arbolbinam;

/**
 *
 * @author dGonz
 */
public class Clase10ArbolBinam {

    public static void main(String[] args) {
        
    //Arbol Binario
        //Creando la raiz del nodo
        Nodo raiz=new Nodo("A");
        //nodo izquierdo
        Nodo nodo2=new Nodo("B");
        //nodo derecho
        Nodo nodo3=new Nodo("C");
        
        //Asignando datos
        raiz.setHijoizq(nodo2);
        raiz.setHijoder(nodo3);
        
        //Nodos de B
        Nodo nodo4=new Nodo("D");
        Nodo nodo5=new Nodo("E");
        //Asignando datos
        raiz.setHijoizq(nodo4);
        raiz.setHijoder(nodo5);
        
        //Nodos de C
        Nodo nodo6=new Nodo("F");
        Nodo nodo7=new Nodo("G");
        //Asignando datos
        raiz.setHijoizq(nodo6);
        raiz.setHijoder(nodo7);
        
        //Pre Orden
        System.out.println("PreOrden");
        preOrden(raiz);
        
        //InOrden
        System.out.println("InOrden");
        inOrden(raiz);
        
        //PosOrden
        System.out.println("PosOrden");
        posOrden(raiz);
    }
    
    //clases para cada orden
    public static void preOrden(Nodo raiz){
        if(raiz!=null){
            System.out.println(raiz.getDato());
            preOrden(raiz.getHijoizq());
            preOrden(raiz.getHijoder());

        }
    }
    
        public static void inOrden(Nodo raiz){
        if (raiz !=null){
            inOrden(raiz.getHijoizq());
            System.out.println(raiz.getDato());
            inOrden(raiz.getHijoder());
        }
    
    }
    
     public static void posOrden(Nodo raiz){
        if (raiz !=null){
            posOrden(raiz.getHijoizq());
            posOrden(raiz.getHijoder());
            System.out.println(raiz.getDato());
          }
    
    }

}
