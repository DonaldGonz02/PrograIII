/*Clase 2 Programaci[on II*/

package com.mycompany.class2;
import java.util.Scanner;
/**
 *
 * @author DONALD
 */
public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una edad: ");
        int edad=sc.nextInt();
        
        if (edad >=5 && edad <=10){
            System.out.println("Es un niño");
            }
            else if(edad > 10 && edad <18){
                    System.out.println("Es un adolescente");
                    }
            else if(edad>=18){
                    System.out.println("Es un adulto");
                    }
                    else{
                    System.out.println("Es un baby");
                    }
        }
    }
        
