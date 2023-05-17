/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rexgr
 */
public class Lab_Clase {

    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        int op=0;
        
        Queue<Envio> c=new LinkedList<>();
        Envio send;
        
        Scanner Num=new Scanner(System.in);
        int No=0;
        
        Scanner Name=new Scanner(System.in);
        String Naame="";
        
        Scanner Addres=new Scanner(System.in);
        String Direc="";
        
        //menu
        while(op!=4){
            System.out.println("-----Práctica Cola-----");
            System.out.println("1.Ingresar");
            System.out.println("2.Visualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Salida");
            System.out.println("\nIngrese una opcion");
            op=option.nextInt();
            System.out.println("\n");
            
            switch(op){
                case 1://agg dato
                    System.out.print("Número: ");
                    No=Num.nextInt();
                    System.out.print("Nombre: ");
                    Naame=Name.next();
                    System.out.print("Dirrección: ");
                    Direc=Addres.next();
                    
                    send=new Envio(No,Naame,Direc);
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
