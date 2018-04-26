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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        System.out.println("ingrese el valor de x");
        x = entrada.nextInt();
        if (x < 0) {
            y = (3 * x) + 10;
            System.out.printf("el valor de y es igual a:%s\n", y);
        } else {
            if (x > 0) {
                y = (x * 2) + 6;
                System.out.printf("el valor de y es igual a:%s\n", y);
            } else {
                if (x == 0) {
                    y = 1;
                    System.out.printf("el valor de y es igual a:%s\n", y);
                }
            }

        }
    }
}
