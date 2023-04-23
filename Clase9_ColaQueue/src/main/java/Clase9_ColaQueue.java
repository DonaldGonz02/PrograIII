/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *
 * @author rexgr
 */
public class Clase9_ColaQueue {

    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        int op=0;
        
        Queue<Producto> c=new LinkedList<>();
        Producto pro;
        
        Scanner name=new Scanner(System.in);
        String naame="";
        
        Scanner code=new Scanner(System.in);
        int cod=0;
        
        Scanner stck=new Scanner(System.in);
        int stk=0;
        
        //menu
        while(op!=4){
            System.out.println("-----Menu Cola-----");
            System.out.println("1.Ingresar");
            System.out.println("2.Visualizar");
            System.out.println("3.Eliminar");
            System.out.println("4.Salida");
            System.out.println("\nIngrese una copcion");
            op=option.nextInt();
            System.out.println("\n");
            
            switch(op){
                case 1://agg dato
                    System.out.print("Nombre: ");
                    naame=name.next();
                    System.out.print("Código: ");
                    cod=code.nextInt();
                    System.out.print("Stock: ");
                    stk=stck.nextInt();
                    
                    pro=new Producto(naame,cod,stk);
                    c.add(pro);//agg el objeto
                    
                    System.out.println("\n");
                    
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
