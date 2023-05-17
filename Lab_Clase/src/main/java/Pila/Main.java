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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        System.out.println("\nHello world!\n");
        Scanner escribir = new Scanner(System.in);
        PilaStack pila = new PilaStack();
        int opcion = -1;

        while (opcion != 0) {
            try {
                System.out.println("\t***** Práctica PilaStack *****");
                System.out.println("\t** 1. Vaciar la pila                      **");
                System.out.println("\t** 2. Listar la pila                      **");
                System.out.println("\t** 3. Insertar un valor de la pila        **");
                System.out.println("\t** 4. Sacar un valor de la pila           **");
                System.out.println("\t** 5. Obtener un valor sin sacarlo        **");
                System.out.println("\t** 6. Tamaño de la pila                   **");
                System.out.println("\t** 7. SALIR DEL MENU                      **");
                System.out.println("\t********************************************");
                System.out.print("\tIngresa el numero de opcion: ");
                opcion = escribir.nextInt();
                System.out.println("\t********************************************");

                switch (opcion) {
                    case 1:
                        System.out.println("\n<<-- Vaciar la pila -->>");
                        pila.limpiar();
                        System.out.println("Pila vacia!");
                        System.out.println("\n");
                    
                    case 2:
                        System.out.println("\n<<-- Listar la pila -->>");
                        pila.imprimir();
                        Thread.sleep(3000);
                        System.out.println("\n");
                    
                    case 3:
                        try {
                            System.out.println("\n<<-- Insertar un valor en la pila -->");
                            System.out.print("Numero: ");
                            int numero = escribir.nextInt();
                            System.out.print("Nombre: ");
                            String nombre = escribir.next();
                            System.out.print("Direccion: ");
                            String direccion = escribir.next();
                            Data data = new Data(numero, nombre, direccion);
                            pila.setDato(data);
                            System.out.println("\n");
                        } catch (Exception e) {
                            escribir.next();
                            System.err.println("Error class:" + e.getClass());
                            System.err.println("Error message: " + e.getMessage());
                            System.out.println("\n");
                        }
                    
                    case 4:
                        System.out.println("\n<<-- Sacar un valor de la pila-->");
                        System.out.println("El valor extraido es: " + pila.getValue());
                        System.out.println("\n");
                    
                    case 5:
                        try {
                            System.out.println("\n<<-- Obtener un valor sin sacarlo -->");
                            System.out.print("Ingrese la posicion numerico: ");
                            int position = escribir.nextInt();
                            System.out.println("El valor es: " + pila.getValue(position));
                            System.out.println("\n");
                        } catch (Exception e) {
                            escribir.next();
                            System.err.println("Error class:" + e.getClass());
                            System.err.println("Error message: " + e.getMessage());
                            System.out.println("\n");
                        }
                    
                    case 6:
                        System.out.println("\n<<-- Tamaño de la pila -->");
                        System.out.println("El tamaño de la pila es: " + pila.getSize());
                        System.out.println("\n");
                    
                    case 7:
                        System.out.println("\n***** SALIDA DEL MENU *****");
                        
                    default:
                        Thread.sleep(1000);
                        System.err.println("\n\t<<-- OPCION NO VALIDA, INTENTA DE NUEVO -->\n");
                    
                }
                Thread.sleep(1000);
            } catch (Exception e) {
                escribir.next();
                System.err.println("Error class:" + e.getClass());
                System.err.println("Error message: " + e.getMessage());
                System.out.println("\n");
            }
        }
    }
}
