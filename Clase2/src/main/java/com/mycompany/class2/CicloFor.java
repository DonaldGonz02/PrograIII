/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class2;

import java.util.Scanner;

/**
 *
 * @author DONALD
 */
public class CicloFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número (1-10) para generar la TABLA DE MULTIPLICACIÓN ");
        int num = sc.nextInt();
        
        System.out.println("---TABLA DEL "+num+"---");
        System.out.println("-------------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num +" * "+ i +" = "+ num*i);
        }
    }
}