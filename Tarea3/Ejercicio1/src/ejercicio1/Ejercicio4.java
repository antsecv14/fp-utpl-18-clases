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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CB;
        int PB;
        double DB;
        double SB;
        double VT;
    System.out.println("Ingrese la cantidad de balones:");
    CB =  entrada.nextInt();
    System.out.println("Ingrese el precio de cada balon");
    PB = entrada.nextInt();
    SB = CB*PB;
    if (CB == 1){
        DB = SB*0.5;
        VT = SB-DB;
        System.out.printf("Cantidad de balones:%s\n Precio balones:%s\n Subtotal balones:%s\n Valor total:%s\n", CB, PB, SB, VT);
    }else{
        if (CB == 2){
            DB = SB*0.7;
            VT = SB-DB;
            System.out.printf("Cantidad de balones:%s\n Precio balones:%s\n Subtotal balones:%s\n Valor total:%s\n", CB, PB, SB, VT);
        }else{
            if (CB == 2){
                DB = SB*0.7;
                VT = SB-DB;
                System.out.printf("Cantidad de balones:%s\n Precio balones:%s\n Subtotal balones:%s\n Valor total:%s\n", CB, PB, SB, VT);
            }else{
                if (CB == 3){
                    DB = SB*0.8;
                    DB = SB*0.7;
                    VT = SB-DB;
                    System.out.printf("Cantidad de balones:%s\n Precio balones:%s\n Subtotal balones:%s\n Valor total:%s\n", CB, PB, SB, VT);
                }
            }
        }
    }    
    }
}
    

