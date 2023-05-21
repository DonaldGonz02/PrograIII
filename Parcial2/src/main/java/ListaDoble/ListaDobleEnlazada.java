/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author rexgr
 */
public class ListaDobleEnlazada {
    //metodos de pila
    private Nodo inicio;
    private int tamaño;
    
    //Constructor
    public void ListaDobleEnlazada(){
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
    public void agregarAlFinal(String Nom,int Num, int Edad){
        //nuevo nodo
        Nodo nuevo=new Nodo();
        
        //agg valor al Nodo
        
        nuevo.setNombre(Nom);
        nuevo.setNumero(Num);
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
    
    
    public void listar(){
        if(!esVacia()){
            Nodo aux=inicio;
            int i=0;
            while(aux!=null){
                System.out.println(i + "> Nombre > " + aux.getNombre()+"Telefono: "+aux.getNumero()+ " / Edad > " + aux.getEdad());
                aux=aux.getSiguiente();
                i++;
            }
        }
    }
}
