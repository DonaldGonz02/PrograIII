/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author rexgr
 */
public class MainListaDoblementeEnlazada {
    public static void principal() {
        System.out.println("Listas doblemente enlazadas!");
        Scanner escribir = new Scanner(System.in);
        Scanner nodosdatoss = new Scanner(System.in);
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        int opcion = 0;

        while (opcion != 9) {
            System.out.println("***** MENU PRINCIPAL LISTAS DOBLEMENTE ENLAZADAS *****");
            System.out.println("* 1. Insertar al Inicio                              *");
            System.out.println("* 2. Insertar al Final                               *");
            System.out.println("* 3. Eliminar al Inicio                              *");
            System.out.println("* 4. Eliminar al final                               *");
            System.out.println("* 5. Buscar el valor por numero en la lista          *");
            System.out.println("* 7. Mostrar la lista                                *");
            System.out.println("* 9. SALIR DEL MENU                                  *");
            System.out.println("******************************************************");
            System.out.print("Ingresa el numero de opcion > ");

            opcion = escribir.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Agrega nodo al inicio del la lista: ");
                    System.out.print("telefono: ");
                    int numero = nodosdatoss.nextInt();
                    System.out.print("Nombre: ");
                    String nombre = nodosdatoss.next();
                    System.out.print("Direccion: ");
                    String direccion = nodosdatoss.next();
                    Data data = new Data(numero, nombre, direccion);
                    lista.insertarInicio(data);
                    System.out.println("\n");
                    
                    break;
                
                case 2:
                    System.out.println("Agrega nodo al final del la lista: ");
                    System.out.print("telefono: ");
                    int numero = nodosdatoss.nextInt();
                    System.out.print("Nombre: ");
                    String nombre = nodosdatoss.next();
                    System.out.print("Direccion: ");
                    String direccion = nodosdatoss.next();
                    Data data = new Data(numero, nombre, direccion);
                    lista.insertarFinal(data);
                    System.out.println("\n");
                
                    break;
                    
                case 3:
                    System.out.println("\n<<-- Eliminar al Inicio -->>");
                    lista.eliminarInicio();
                    System.out.println("\n");
                
                    break;
                case 4 -> {
                    System.out.println("\n<<-- Eliminar al Final -->>");
                    lista.eliminarFinal();
                    System.out.println("\n");
                }
                case 5 -> {
                    System.out.print("Indique el valor entero que desea buscar: ");
                    int numero = nodosdatoss.nextInt();
                    Nodo buscado = lista.buscarNumero(numero);
                    System.out.println("[" + buscado.getData().toString() + "]" );
                    System.out.println("\n");
                }
                case 7 -> {
                    System.out.println("\nMostando la lista");
                    lista.mostrar();
                    System.out.println("\n");
                }
                case 9 -> System.out.println("\n***** SALIDA DEL MENU *****");
                default -> {
                }
            }

        }


    }
}
