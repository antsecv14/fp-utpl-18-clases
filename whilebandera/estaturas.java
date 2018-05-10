/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilebandera;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class estaturas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contador = 1;
        double suma = 0;
        double promedio = 0;
        boolean bandera = true;
        System.out.println("Ingrese las estaturas de los estudiantes");
        String salidafinal = ("Estatura estudiante");
        while (bandera){
            System.out.printf("Ingrese la estatura del estudiante %d\n: ", contador);
            double est = entrada.nextDouble();
            if(est<1.20){
                est=1.20;
            
            }
            suma = suma + est;
            salidafinal = salidafinal + String.format("%.2f\n", est);
            contador = contador + 1;
            entrada.nextLine();
            System.out.println("¿Desea ingresar mas estaturas");
          
            String temporal = entrada.nextLine();
            
            if(temporal.equals("no")){
                bandera= false;
            }
        }
        contador = contador-1;
        promedio = suma/contador;
        System.out.printf("Reporte de Estaturas:\n\n%s\nPromedio de estaturas: %.2f\nReporte generado por Dep. Deportes\n", salidafinal, promedio);
           
            }
        }
        
