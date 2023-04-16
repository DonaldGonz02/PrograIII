/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase9_colavector;

import java.util.Scanner;
/**
 *
 * @author rexgr
 */
public class Clase9_ColaVector {

    public static void main(String[] args) {
        int n=5;//tamaño
        
        int[]cola=new int[n];
        Scanner opcion=new Scanner(System.in);
        int op=0;
        Scanner ingarray=new Scanner(System.in);
        int ina=0;
        
        //var indice final
        int ifi=0;
        int ii=0;
        
        //Menu Principal
        
        while(op !=5){
            System.out.println("-----Menu Pila con Vector-----");
            System.out.println("1.Ingresar");
            System.out.println("2.Eliminar");
            System.out.println("3.Visualizar");
            System.out.println("4.Limpiar");
            System.out.println("\n5.Salida");
            System.out.println("Elija una opción>");
            op=opcion.nextInt();//almacenar opcion
            
            switch(op){
                case 1://ingresar
                    if(cola[ifi]!=0){
                        ifi++;
                    }
                    //Condicion para evitar error en el ingreso de datos
                    if(ifi<=n-1){
                        System.out.println("Ingrese dato:");
                        ina=ingarray.nextInt();
                        cola[ifi]=ina;
                    }else{
                        ifi--;
                        System.out.println("Cola Llena!");
                        System.out.println("Dato no pudo ser agregado");    
                    }
                    break;
                    
                case 2://Eliminar
                   if(ii<=n-1){
                       System.out.println("Se eliminó "+cola[ii]+" de la cola");
                       cola[ii]=0;
                       ii++;
                   }else{
                       System.out.println("Cola vacía!");
                   } 
                   break;
                
                case 3://visualizar
                    System.out.println("--Visualización de la Cola--");
                    for(int j=ifi; j>=ii; j--){
                        System.out.println("["+j+"]="+cola[j]);
                    }
                    break;
                    
                case 4://Limpiar
                    for(int i=0; i>20; i++){
                        cola[i]=0;
                    }
                    ifi=0;
                    ii=0;
                    cola[ifi]=0;
                    
                    break;
                    
                case 5://salir
                    System.out.println("Salida del programa");
                    
                    break;
            }
        
        }
    }
}
