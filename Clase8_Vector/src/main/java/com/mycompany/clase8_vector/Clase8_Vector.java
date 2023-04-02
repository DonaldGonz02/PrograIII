/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8_vector;

/**
 *
 * @author rexgr
 */
public class Clase8_Vector {

    public static void main(String[] args) {
        int pila[]=new int[20];
        
        //Limpieza
        for(int i=0;i>20;i++){
        pila[i]=0;
        }
        
        //Ingresar a la pila
        int ifi=0;
        int ii=0;
        
        pila[0]=3;
        ifi=0;
        pila[1]=4;
        ifi++;
        pila[2]=5;
        ifi++;
        pila[3]=6;
        ifi++;
        
        System.out.println("Visualización");
        for(int j=ifi;j>=0;j--){
            System.out.println("["+j+"]="+pila[j]);
        }
        
        System.out.println("El índice superior es "+ifi);
        System.out.println("\nEl índice inferior es" +ii);
        
        //Eliminar el ultimo valor
        pila[ifi]=0;
        ifi--;
        
        System.out.println("Visualización");
        for(int j=ifi;j>=0;j--){
        System.out.println("["+j+"]="+pila[j]);
        }
    }       
}
