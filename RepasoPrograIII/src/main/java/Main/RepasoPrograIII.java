/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author rexgr
 */
public class RepasoPrograIII {

    public static void main(String[] args) {
         public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Escriba un metodo de uso");
        Scanner escribir = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("***** MENU PRINCIPAL DE CLASES *****");
            System.out.println("* 1. Listas doblemente enlazada    *");
            System.out.println("* 2. Pilas                         *");
            System.out.println("* 3. Colas                         *");
            System.out.println("* 4. SALIR DEL MENU                *");
            System.out.println("************************************");
            System.out.print("Ingresa el numero de opcion > ");

            opcion = escribir.nextInt();
            System.out.println();

            System.out.println();

            switch (opcion) {
                case 1:
                    MainListaDoblementeEnlazada.principal();
                
                case 2:
                    MainPila.principal();
                
                case 3:
                    MainListaDoblementeEnlazada.principal();
                
                case 4: System.out.println("\n***** SALIDA DEL MENU *****");
            }
        }

    }
}
