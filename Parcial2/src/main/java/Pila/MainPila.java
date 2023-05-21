/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pila;

import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escribir = new Scanner(System.in);
        Scanner Afil = new Scanner(System.in);
        Scanner Name = new Scanner(System.in);
        Scanner Prod = new Scanner(System.in);
        Scanner Unid = new Scanner(System.in);
        
        int Af;
        String Nombre;
        String Pro;
        int un;
        int opcion = 0;
        
        //Crear Pilaaa!
        Pila pila1=new Pila();
        //menu
        while( opcion != 4){
            System.out.println("-----Bernardo el Gato-----");
            System.out.println("1.Insertar");
            System.out.println("2.Visualizar");
            System.out.println("3.Eliminar");
            System.out.println("4. Salir ");
            System.out.println("\n Ingresar opción: ");
            opcion = escribir.nextInt();
            
            opcion=escribir.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese Numero de Afiliado:");
                    Af = Afil.nextInt();
                    System.out.println("Ingrese Nombre:");
                    Nombre = Name.next();
                    System.out.println("Ingrese Producto:");
                    Pro = Prod.next();
                    System.out.println("Ingrese las unidades:");
                    un=Unid.nextInt();
                    pila1.agregarAlFinal(Af,Nombre,Pro,un);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Visualización de Datos");
                    pila1.listar();
                    System.out.println("\n");
                    break;
                    
                case 3:
                    System.out.println("Eliminar valor");
                    Af=Afil.nextInt();
                    Nombre = Name.next();
                    Pro=Prod.next();
                    un=Unid.nextInt();
                    pila1.removerPorUltimo(Af,Nombre,Pro,un);
                    System.out.println("\n");
                    break;
            }
        }
    }
}
   