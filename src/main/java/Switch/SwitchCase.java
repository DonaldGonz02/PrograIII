/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author DONALD
 */
public class SwitchCase {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        
        System.out.println("------MENU------");
        
        while (salir == false) {            
            System.out.println("a.Ingresar");
            System.out.println("b.Eliminar");
            System.out.println("c.Salir");
        
            try {
                System.out.println("INGRESE UNA OPCION: ");
                String opcion = sc.nextLine();
                
                switch (opcion) {
                    case "a":
                        System.out.println("Ingresar \n");
                        break;
            
                    case "b":
                        System.out.println("Eliminar \n");
                        break;
                    
                    case "c":
                        salir = true;
                    default:
                }
            } catch (Exception e) {
                System.out.println("Error: "+e);
            }
        }
    }   
}
