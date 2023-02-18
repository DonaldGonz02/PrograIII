/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class2;

import java.util.Scanner;

/**
 *
 * @author DONALD
 */
public class CicloFor {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
            int menor;
            int intermedio;
            int mayor;

        
        System.out.println("Ingrese un valor: ");
        int v1 = sc.nextInt();
        
        System.out.println("Ingrese otro valor: ");
        int v2 = sc.nextInt();
        
        System.out.println("Ingrese un último valor: ");
        int v3 = sc.nextInt();
        
        if (v1 > v2 && v1 > v3) {
            mayor = v1;
            if(v2>v3){
                intermedio = v2;
                menor = v3;
            }
            else{
                intermedio = v3;
                menor = v2;
            }
            System.out.println(" El numero mayor es el :"+mayor+""
                    + "\n El numero intermedio es:"+intermedio
            +"\n El numero menor es: "+menor);
        }   
        
        else if(v2 > v1 && v2 > v3){
            mayor = v2;
            if(v1>v3){
                intermedio = v1;
                menor = v3;
            }
            else{
                intermedio = v3;
                menor = v1;
            }
            System.out.println(" El numero mayor es el :"+mayor+""
                    + "\n El numero intermedio es:"+intermedio
            +"\n El numero menor es: "+menor);
        }
        else if(v3 > v1 && v3 > v2){
            mayor = v3;
            if(v1>v2){
                intermedio = v1;
                menor = v2;
            }
            else{
                intermedio = v2;
                menor = v1;
            }
            System.out.println(" El numero mayor es el :"+mayor+""
                    + "\n El numero intermedio es:"+intermedio
            +"\n El numero menor es: "+menor);
        }
    }
}
