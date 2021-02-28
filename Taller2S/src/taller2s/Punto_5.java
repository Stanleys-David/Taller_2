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
public class Punto_5 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Escriba un programa en Java que lea un carácter e imprima su
        correspondiente valor numérico (utilizar la conversión de tipos).*/
        System.out.print("introducir caracter: ");
        char c = entrada.next().charAt(0);
        int asciiValue = c;
        System.out.printf("Correspondiente numerico de c: %d\n", asciiValue);

    }
    
}

    
