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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double numero;
        int n;
        double F;
        double C;
     System.out.println("Ingrese el valor que desea convertir");
     numero = entrada.nextDouble();
     System.out.println("Seleccione 1 si desea transformar a Farenheit, seleccione 2 si desea transformar a Celcius");
     n = entrada.nextInt();
     if (n == 1){
         F = (numero*9/5)+32;
         System.out.printf("Su resultado de transformar de celcius a Farenheit es:%s\n", F);
     }else{
         if(n == 2){
             C = (numero-32)*5/9;
             System.out.printf("Su resultado de transformar de Farenheit a Celcius es:%s\n", C);
         }
     }
    }
}
