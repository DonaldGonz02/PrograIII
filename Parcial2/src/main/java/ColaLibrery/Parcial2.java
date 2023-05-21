/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ColaLibrery;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Parcial2 {

    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        int op=0;
        
        Queue<Datos> c=new LinkedList<>();
        Datos send;
        
        Scanner Num=new Scanner(System.in);
        int No=0;
        
        Scanner Cliente=new Scanner(System.in);
        String Cli="";
        
        Scanner Menu=new Scanner(System.in);
        String Selec="";
        
        Scanner Precio = new Scanner(System.in);
        int Pre=0;
        
        //menu
        while(op!=4){
            System.out.println("-----Restaurante Basuca-----");
            System.out.println("1.Ingresar");
            System.out.println("2.Visualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Salida");
            System.out.println("\nIngrese una opcion");
            op=option.nextInt();
            System.out.println("\n");
            
            switch(op){
                case 1://agg dato
                    System.out.print("No. Pedido: ");
                    No=Num.nextInt();
                    System.out.print("Cliente: ");
                    Cli=Cliente.next();
                    System.out.print("Menú Seleccionado: ");
                    Selec=Menu.next();
                    System.out.print("Precio: ");
                    Pre=Precio.nextInt();
                    
                    send=new Datos(No,Cli,Selec,Pre);
                    c.add(send);//agg el objeto
                 
                    break;
                    
                case 2://visualizar
                    if(!c.isEmpty()){
                        System.out.println("Cola: "+ c.toString()); 
                    }else {
                        System.out.println("Cola vacía");
                    }
                    
                    break;
                    
                case 3://eliminar
                    System.out.println("Se elimino el dato de la cola ");
                    c.poll();
                    
                    break;
                    
                case 4:
                    System.out.println("Salida del programa");
                    
                    break;

            }
            
        }
        
    }
}
