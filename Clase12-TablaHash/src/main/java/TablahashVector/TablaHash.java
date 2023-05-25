/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablahashVector;

/**
 *
 * @author rexgr
 */
public class TablaHash {
    //Atributos
    int dato;
    int estado;
    // 0 vacio, 1 eliminado, 2 ocupado

    
    //funcion
    static int funcion(int n, int m){
        return ((n+1)%m);
    }
    
    //insert
    static void insertHash(TablaHash[]h,int m,int n){
        boolean i=false;
        int j=funcion(n,m);
        
        do{
            if(h[j].estado ==0 || h[j].estado == 1){
            h[j].dato = n;
            h[j].estado = 2;
            i= true;
        } else {
            j++;
        }
        }while(j < m && !i);
            if (i){
            System.out.println("Elemento se inserto exitosamente");
            }else{
            System.out.println("Tabla esta llena");
            }
        }
        
    //Buscar
    static int buscaHash(TablaHash[] h, int m, int n ){
        int j= funcion(n,m);
        while(j<m){
            if(h[j].estado==0){
                return -1;
            }else if(h[j].dato == n){
                    if(h[j].estado== 1){
                        return -1;}
                    else {
                        return j;
                    }
                    
        }else {
                j++;
            }
        }
        return -1;
    }
    
    //eliminar
        static int eliminaHash(TablaHash[] h, int m, int n){
        int i = buscaHash(h,m,n);
        if (i == -1){
            return -1;
            }else{
                h[i].estado = 1;
                return 1;
            }
        }
    //visualizar tabla
        static void visualizar(TablaHash[] h, int m){
            for (int ind = 0; ind < m; ind++){
                if(h[ind].estado == 2){
                System.out.println("[ "+ ind + "] ="+ h[ind].dato);
                }
            }
        }
}

