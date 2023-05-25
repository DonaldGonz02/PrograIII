/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TablaHachLibrería;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
/**
 *
 * @author rexgr
 */
public class TablaHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable h = new Hashtable();
        
        Scanner opcion= new Scanner(System.in);
        int op=0;
        
        //Variables
        Scanner dato= new Scanner(System.in);
        int dat=0;
        Scanner datob= new Scanner(System.in);
        String datb;
        boolean y;        
        
        // Menu Principal
        while (op != 5){
        System.out.println("*****MENU TABLAS HASH LIBRERIA****");
        System.out.println("* 1. Ingreso Datos en tabla *");
        System.out.println("* 2. Eliminar Datos en tabla *");
        System.out.println("* 3. Visualizacion de Datos en tabla*");
        System.out.println("* 4. Busqueda de dato en tabla *");
        System.out.println("* 5.Salida *");
        System.out.println("***********************************");
        System.out.println("Ingrese numero de su opcion >");
        op = opcion.nextInt(); // Almacenar opcion
        
        // Case de opciones d mi menu
        switch(op){
            case 1:
                // Ingreso de datos en la tabla
                System.out.println("Ingrese Llave para almacenar en Tabla >");
                dat = dato.nextInt();
                System.out.println("Ingrese Nombre para almacenar en Tabla >");
                datb = datob.next();

                h.put(dat, datb);

                break;
            
            case 2:
                // Eliminacion de datos de la tabla
                System.out.println("Ingrese la llave para eliminar >");
                dat = dato.nextInt();
                h.remove(dat);

                break;
            case 3:
                // Visualizacion de datos
                System.out.println("Visualizacion de datos de tabla hash");
                // Recorrer los datos de la tabla donde muestre nombre como la lleve
                Enumeration enumeration = h.elements();
                Enumeration llaves= h.keys();
                while(enumeration.hasMoreElements()){
                System.out.println("/" + enumeration.nextElement() + "/" + llaves.nextElement());

                }
                break;
            case 4:
                // Buscar si el dato existe
                System.out.println("Ingrese la llave para buscar >");
                dat = datob.nextInt();
                y = h.containsKey(dat);
                if(y == true){
                System.out.println("Esta llave si existe con este nombre "+ h.get(dat));
                }else{
                System.out.println("Este dato no se encontro");

                }
                break;
            case 5:
                System.out.println("***SALIENDO DEL PROGRAMA***");
                break;
            }
        }
    }
}
