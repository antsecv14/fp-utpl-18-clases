/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasewhile;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Edades {
     public static void main(String[] args) {
        Scanner Entrada= new Scanner (System.in);
        int Suma = 0;
        int contador = 1;
        int Edades=0 ;
        String cadenafinal= String.format("%s\t%s\n", "Edad", "Suma");
        System.out.printf("%s\t%s\n", "Edades", "Suma");
        while (contador <= 5) {
            System.out.println("Ingrese el valor de edad : ");
            Edades = Entrada.nextInt();
            Suma = Suma + Edades;
            cadenafinal =String.format("%s%d\t%d\n", cadenafinal, Edades, Suma);
            contador = contador + 1;
        }
        System.out.printf("%s", cadenafinal);

        // TODO code application logic here
    }

}
    
