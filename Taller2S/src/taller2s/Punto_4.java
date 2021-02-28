/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2s;

import java.util.Scanner;

/**
 *
 * @author stanl
 */
public class Punto_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Escriba un programa en Java que le solicite al usuario el valor del 
        radio de una circunferencia y calcule su longitud y área.
        Imprima los resultados (con dos números decimales)*/
        System.out.println("Por favor, introduzca el valor del radio ");
        double num1= entrada.nextDouble();
        System.out.printf("la longitud de la circunferencia es : %.2f\n", (num1*2)*Math.PI );
        System.out.printf("El area de la circunferencia es : %.2f\n", (num1*num1)*Math.PI);

    }
    
}


