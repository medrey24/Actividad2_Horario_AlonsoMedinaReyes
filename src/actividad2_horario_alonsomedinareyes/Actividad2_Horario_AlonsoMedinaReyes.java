/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_horario_alonsomedinareyes;
import java.util.Scanner;

/**
 *
 * @author acs
 */
public class Actividad2_Horario_AlonsoMedinaReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner numHor = new Scanner(System.in);
        
    int numero = 0;
    
    System.out.println("Horario del día miércoles\n");
        
    System.out.println("Ingrese un número de hora con rango del 1 al 24, para saber la actividad correspondiente: ");
    numero = numHor.nextInt();
        
    if (numero >0 && numero <=24 ) { 
        
        switch (numero){
            case 1,2,3,4,5,6,24:
            System.out.println("La actividad correspondiente a esa hora es:\nDormir");
            break;   
            case 7:
            System.out.println("La actividad correspondiente a esa hora es:\nLevantarse");
            break;
            case 8:
            System.out.println("La actividad correspondiente a esa hora es:\nDesayunar");
            break;
            case 9,10:
            System.out.println("La actividad correspondiente a esa hora es:\nClases de Cálculo integral");
            break;
            case 11,12:
            System.out.println("La actividad correspondiente a esa hora es:\nClases de Álgebra lineal");
            break;
            case 13,14:
            System.out.println("La actividad correspondiente a esa hora es:\nClases de inglés");
            break;
            case 15:
            System.out.println("La actividad correspondiente a esa hora es:\nAlmorzar");
            break;
            case 16,17,22,23:
            System.out.println("La actividad correspondiente a esa hora es:\nHacer tareas, estudiar o tiempo libre");
            break;
            case 18:
            System.out.println("La actividad correspondiente a esa hora es:\nTomar una ducha");
            break;
            case 19,20:
            System.out.println("La actividad correspondiente a esa hora es:\nClases de Lenguaje de programación I");
            break;
            case 21:
            System.out.println("La actividad correspondiente a esa hora es:\nCenar");
            break;
        }
        
    }else{
        System.out.println("¡Error!");    
        System.out.println("Favor de ingresar un número de hora con rango entre 1 y 24");
    }
    }
}
