/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author rexgr
 */
public class Pila {
        //metodos de pila
    private NodoPila inicio;
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
    public void agregarAlFinal(int Af, String Nom,String Prod, int Unid){
        //nuevo nodo
        NodoPila nuevo=new NodoPila();
        
        //agg valor al Nodo
        nuevo.setAfil(Af);
        nuevo.setNombre(Nom);
        nuevo.setProd(Prod);
        nuevo.setUni(Unid);
        //Consulta si la lista está vacía
        if(esVacia()){
            inicio=nuevo;
        }else{
            //crea una copia 
            NodoPila aux=inicio;
            //recorrer lista hasta llegar al último
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }
    public void removerPorUltimo(int edad, String nombre, String Pro, int un){
        //Verifica posicion
        int posicion;
        posicion=tamaño -1;
        
        if(posicion>=0&&posicion<tamaño){
            if(posicion==0){
                inicio=inicio.getSiguiente();
            }else{
                NodoPila aux=inicio;
                for(int i=0; i<posicion-1;i++){
                    aux=aux.getSiguiente();
                }
                NodoPila siguiente=aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamaño--;
        } 
    }
    
    public void listar(){
        if(!esVacia()){
            NodoPila aux=inicio;
            int i=0;
            while(aux!=null){
                System.out.println(i +"Afiliado No. "+aux.getAfil()+" " + aux.getNombre()+ " Producto: " + aux.getProd()+"-"+aux.getUni()+" unidades");
                aux=aux.getSiguiente();
                i++;
            }
        }
    }
}
