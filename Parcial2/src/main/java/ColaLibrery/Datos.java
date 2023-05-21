/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColaLibrery;

/**
 *
 * @author rexgr
 */
public class Datos {
    private int NumPedido;
    private String NameCliente;
    private String MenuSelec;
    private int Precio;

    //constructores
    Datos(int N, String C,String M, int p){
        NumPedido=N;
        NameCliente=C;
        MenuSelec=M;
        Precio=p;
    }
    //Método-Datos internos
    @Override
    public String toString(){
        return"Pedido No. "+NumPedido+"-"+NameCliente+" Menú seleccionado: "+MenuSelec+" Precio: "+Precio; 
    }
}
