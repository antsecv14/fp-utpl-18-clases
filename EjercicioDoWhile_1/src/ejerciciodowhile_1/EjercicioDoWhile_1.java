
package ejerciciodowhile_1;

import java.util.Scanner;

public class EjercicioDoWhile_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cont =1;
        int jug;
        int tgol=0;
        int tpas=0;
        int sgol=0;
        int spas=0;
        double ppas=0;
        double pgol=0;
        String cadenafinal = "";
        System.out.print("Ingrese el nombre del equipo :");
        String nomequi = entrada.nextLine();
        System.out.print("Ingrese el numero de jugadores :");
        jug = entrada.nextInt();
        cadenafinal=String.format("Reporte de jugadores del equipo ~%s%s\n %s\t\t %s\t\t %s\t\t %s\t\n\n\n", nomequi,"~","Nombre del jugador","Pases","Goles","Nivel de jugador");
        do{
            entrada.nextLine();
            System.out.print("Ingrese el nombre del jugador :\n");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese la cantidad de partidos :\n");
            int par = entrada.nextInt();
            cadenafinal=String.format("%s\n%-12s",cadenafinal ,nombre );
            for(int contp=1;contp<=par;contp++){
                System.out.print("Ingrese la cantidad de pases del partido "+contp+" del jugador "+cont+" :\n");
                int pas = entrada.nextInt();
                System.out.print("Ingrese la cantidad de goles del partido "+contp+" del jugador "+cont+" :\n");
                int gol = entrada.nextInt();
                tgol=tgol+gol;
                tpas=tpas+pas;
                cadenafinal=String.format("%s\t\t\t %s%d%s%d\t\t %s%d%s%d\n\t", cadenafinal, "P",contp,":",pas, "P",contp,":",gol);
                entrada.nextLine();      
            }
            cadenafinal=String.format("%s\n \t\t\t\t%s%d\t%s%d",cadenafinal,"Total:",tpas,"Total:",tgol);
            if(tpas==100){
                cadenafinal=String.format("%s\t\t%s", cadenafinal,"Exelente");
            }else{
                if(tpas<=99 && tpas>=80){
                    cadenafinal=String.format("%s\t\t  %s", cadenafinal,"Muy bueno");
                }else{
                    if(tpas>=60 && tpas<=79){
                        cadenafinal=String.format("%s\t\t  %s", cadenafinal,"Bueno");
                    }else{
                        if(tpas<59){
                            cadenafinal=String.format("%s\t\t  %s", cadenafinal,"Regular");
                        }
                    
                    }
                
                }
        }
        
        cont=cont+1;
        sgol=sgol+tgol;
        spas=spas+tpas;
        tpas=0;
        tgol=0;
        }while (cont<=jug);
        ppas=spas/jug;
        pgol=sgol/jug;
        cadenafinal=String.format("%s\n %s\n %s%.2f\n %s%.2f", cadenafinal,"Datos finales: ","El promedio de pases del equipo es : ",ppas,"El promedio de goles del equipo es : ", pgol);
        System.out.print(cadenafinal);
        }
    
    }
    
