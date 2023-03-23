/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasimplementeenlazadacircular;

/**
 *
 * @author rexgr
 */
public class ListaCircular {
    //cabeza de la lista
    private Nodo inicio;
    //ultimo nodo
    private Nodo ultimo;
    //tamaño de lalista
    private  int tamaño;
    
    //constructor
    public void Lista(){
        inicio=null;
        ultimo=null;
        tamaño=0;
    }
    
    //consulta si la lista está vacia
    public boolean esVacia(){
        return inicio==null;
    }
    
    //numero de elementos de la lista
    public int getTamaño(){
        return tamaño;
    }
    
    //agg nodo al final
    public void agregarAlFinal(int valor){
        //nuevo Nodo
        Nodo nuevo=new Nodo();
        
        //agg valor
        nuevo.setValor(valor);
        if(esVacia()){
            inicio=nuevo;//inicio-nuevo nodo
            ultimo=nuevo;//ultimo-pasa a nuevo
            
            ultimo.setSiguiente(inicio);//puntero enlaza al primero
        }else{
            ultimo.setSiguiente(nuevo);//ultimo nodo enlaza al nuevo
            nuevo.setSiguiente(inicio);//nuevo nodo al inicio de la lista
            
            //actualizacion de posición
            ultimo=nuevo;
        }
        //incrementar el valor de la lista
        tamaño++;
    }
    
    public boolean buscar(int referencia){
        //copia de la lista
        Nodo aux=inicio;
        
        //indicador de existencia
        boolean encontrado=false;
        
        //recorrer la lista
        do{
            //consulta del valor
            if(referencia==aux.getValor()){
            //cambiar el valor de la bandera
                encontrado=true;
            }else{
            //avanza al siguiente nodo
            aux=aux.getSiguiente();                
            }
        }while(aux != inicio && encontrado != true);
        //retorna el resultado
        return encontrado;
    }
    
    public void removerPorReferencia(int referencia){
        //consultar si la referencia existe
        if(buscar(referencia)){
            //consulta posicion del nodo
            if(inicio.getValor()==referencia){
                inicio=inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }else{
                //crear copia de la lista
                Nodo aux=inicio;
                //recorre lista                 
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                }else{
                    //guardar nodo siguiente del nodo a eliminar
                    Nodo siguiente =aux.getSiguiente();
                    //enlazar con el siguiente al que se eliminó
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            //Disminuye el contador del tamaño de la lista
            tamaño--;
        }
    }
    //eliminar lista
    public void eliminar(){
        //elimina valor de la lista y de referencia de los demas nodos
        inicio=null;
        //elimina el calor y referencia del primer nodo
        ultimo=null;
        //reiniciar contador
        tamaño=0;
    }
    //mostrar elementos en pantalla
    public void listar(){
        //verificar si la lista contiene elemento
        if(!esVacia()){
            //crear copia de la lista
            Nodo aux=inicio;
            //posicion de los elementos
            int i=0;
            System.out.print("->");
            // Recorre la lista hasta llegar nuevamente al inicio de la lista.
            do{
                //imprimir valor del nodo
                System.out.print(i+".["+aux.getValor()+"]"+"->");
                //avanza al siguiente nodo
                aux=aux.getSiguiente();
                //incrementar contador
                i++;
            }while(aux!=inicio);
        }
    }
}
