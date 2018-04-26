/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int tC;
        int CC;
        int PC;
        int SP;
        double DT;
        double VT;
        System.out.println("Ingrese el nombre del cliente:");
        nombre= entrada.nextLine();
        System.out.println("Ingrese el tipo de cliente");
        tC= entrada.nextInt();
        System.out.println("Ingrese la cantidad de celulares");
        CC= entrada.nextInt();
        System.out.println("Ingrese el precio del celular");
        PC= entrada.nextInt();
        SP = PC*CC;
        if (tC == 1){
            DT = SP*0.1;
            VT = SP - DT;
            System.out.printf("Cliente:%s\n Tipo de cliente:%s\n Cantidad de celulares:%s\n Precio por cada celular:%s\n Subtotal a pagar:%s\n descuento:%s\n Valor final:%s\n", nombre, tC , CC, PC, SP, DT, VT);
        }else{
            if (tC == 2){
                DT = SP*0.2;
                VT = SP - DT;
                System.out.printf("Cliente:%s\n Tipo de cliente:%s\n Cantidad de celulares:%s\n Precio por cada celular:%s\n Subtotal a pagar:%s\n descuento:%s\n Valor final:%s\n", nombre, tC , CC, PC, SP, DT, VT);
            }else{
                if(tC == 3){
                   DT = SP*0.3;
                   VT = SP - DT;
                   System.out.printf(" Cliente:%s\n Tipo de cliente:%s\n Cantidad de celulares:%s\n Precio por cada celular:%s\n Subtotal a pagar:%s\n descuento:%s\n Valor final:%s\n", nombre, tC , CC, PC, SP, DT, VT);
                
                }
            
            }
        
        }
            
        
    }
    
}
