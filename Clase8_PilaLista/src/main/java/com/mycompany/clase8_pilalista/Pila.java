/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8_pilalista;

/**
 *
 * @author rexgr
 */
public class Pila {
    //metodos de pila
    private Nodo inicio;
    private int tamaño;
    
    //Constructor
    public void Pila(){
        this.inicio=null;
        tamaño=0;
    }
    
    //pila vacia (?)
    public boolean esVacia(){
        return inicio==null;
    }
    
    //Ingresar en la fila
    public int getTamaño(){
        return tamaño;
    }
    //agg nodo
    public void agregarAlFinal(String Nom, int Edad){
        //nuevo nodo
        Nodo nuevo=new Nodo();
        
        //agg valor al Nodo
        nuevo.setNombre(Nom);
        nuevo.setEdad(Edad);
        
        //Consulta si la lista está vacía
        if(esVacia()){
            inicio=nuevo;
        }else{
            //crea una copia 
            Nodo aux=inicio;
            //recorrer lista hasta llegar al último
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public void removerPorUltimo(){
        //Verifica posicion
        int posicion;
        posicion=tamaño -1;
        
        if(posicion>=0&&posicion<tamaño){
            if(posicion==0){
                inicio=inicio.getSiguiente();
            }else{
                Nodo aux=inicio;
                for(int i=0; i<posicion-1;i++){
                    aux=aux.getSiguiente();
                }
                Nodo siguiente=aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        } 
    }
    
    public void listar(){
        if(!esVacia()){
            Nodo aux=inicio;
            int i=0;
            while(aux!=null){
                System.out.println(i + "> Nombre > " + aux.getNombre()+ " / Edad > " + aux.getEdad());
                aux=aux.getSiguiente();
                i++;
            }
        }
    }
}
