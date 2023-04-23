/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rexgr
 */
public class Producto {
    //Atributos
    private String name;
    private int code;
    private int stock;
    
    //constructores
    Producto(String n, int c, int s){
        name=n;
        code=c;
        stock=s;
    }
    //Método-Datos internos
    @Override
    public String toString(){
        return"Nombre "+name+" Código ["+code+"]- Stock "+stock; 
    }
}
