/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author rexgr
 */
public class Envio {
    private int Num;
    private String Name;
    private String Addres;
    
    //constructores
    Envio(int N, String n,String a){
        Num=N;
        Name=n;
        Addres=a;
    }
    //Método-Datos internos
    @Override
    public String toString(){
        return"No. "+Num+"-"+Name+" Dirección: "+Addres; 
    }
}
