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
public class Punto_10 {
                /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Escriba un programa en Java que lea el peso de un objeto (en kilogramos)
        e imprima su equivalencia en: gramos, libras, toneladas.*/
        
        System.out.println("Por favor, introduzca el peso del objeto en kg:  ");
        double pesokg= entrada.nextDouble();
        System.out.printf("el peso del objeto en gramos es %.2f\n", pesokg*1000 );
        System.out.printf("el peso del objeto en libras es %.2f\n",pesokg*2.205 );
        System.out.printf("el peso del objeto en toneladas es %.2f\n",pesokg*0.001 );
    }
}
