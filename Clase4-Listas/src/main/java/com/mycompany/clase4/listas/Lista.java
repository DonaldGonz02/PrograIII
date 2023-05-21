/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4.listas;

/**
 *
 * @author rexgr
 */
public class Lista {
     //atributos
        private Nodo inicio;
        private int tamaño;
        
        public void Lista(){
            inicio=null;
            tamaño=0;
        }
        //metodo para evaluar si el nodo esta vacio o nell :v
        public boolean esVacia(){
            return inicio ==null;
        }
        //consulta de cuantos elementos tiene la lista
        public int getTamaño(){
            return tamaño;
        }
        
        //enlazar los nodos
        public void agregarAlFinal(int valor){
            //definir un nuevo nodo
            Nodo nuevo= new Nodo();
            //agregar el valor al nodo sin enlazarlo
            nuevo.setValor(valor);
            //consulta si la lista está vacía
            if(esVacia()){
                inicio=nuevo;//iniciando la lista
            }else{
                Nodo aux= inicio; //crra copia de la lista
                //recorrer la lista hasta el ultimo nodo
                while(aux.getSiguiente()!=null){
                    aux=aux.getSiguiente();
                }
                //agg nuevo nodo al final de la lista
                aux.setSiguiente(nuevo);
            }
            tamaño++;
        }
        //busca si existe un valor en la lista
        public boolean buscar(int referencia){
            //copiar lista
            Nodo aux=inicio;
            boolean encontrado=false;//indica si el valor existe
            //recorrer la lista
            while(aux !=null && encontrado!=true){
               //consulta valor del nodo y la referencia
               if(referencia==aux.getValor()){
                   encontrado=true;//cambia valor de bandera
               }else{
                   aux=aux.getSiguiente();//avanza al siguiente nodo
               }
            }
            return encontrado; //retorna el valor
        }
        //elimina un nodo que se enuentra en la lista ubicado
        public void removerPorReferencia(int referencia){
            //consulta si el valor existe
            if(buscar(referencia)){
                if(inicio.getValor()==referencia){
                    inicio=inicio.getSiguiente();
                }else{
                    //crear copia
                    Nodo aux=inicio;
                    //recorrer lista hasta el nodo anterior a la referencia
                    while(aux.getSiguiente().getValor()!=referencia){
                        aux=aux.getSiguiente();
                    }
                    //guardar nodo al sigueinte
                    Nodo siguiente = aux.getSiguiente().getSiguiente();
                    //enlaza el nodo anterior al de eliminar
                    aux.setSiguiente(siguiente);
                }
                //Disminuir el tamaño de la lista
                tamaño--;
                }
        }
        //mostrar en pantalla los valores de la lista
        public void listar(){
            //confirmar si hay elementos en la lista
            if(!esVacia()){
                Nodo aux=inicio;
                int i=0;//posicion de los elementos de la lista
                //recorrer lista hast el final
                while(aux !=null){
                    System.out.print(i+".["+aux.getValor()+"]"+"->");
                    aux=aux.getSiguiente(); //avanza al siguiente nodo
                    
                    i++;//incrementa la posicion del contador
                }
            }
        }
}
