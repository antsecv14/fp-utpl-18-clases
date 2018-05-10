/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasewhile;

/**
 *
 * @author USUARIO
 */
public class ClaseWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Suma = 0;
        int contador = 1;
        System.out.printf("%s\t%s\n", "Contador", "Suma");
        while (contador <= 4) {
            Suma = Suma + contador;
            System.out.printf("    %d\t \t  %d\n", contador, Suma);
            contador = contador + 1;

        }
        // TODO code application logic here
    }

}
