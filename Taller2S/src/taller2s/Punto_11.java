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
public class Punto_11 {
                    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Desarrolle un programa en java que lea una cantidad numérica entre
        cero y mil (0 y 1000) e imprima la cifra correspondiente a sus unidades,
        decenas y centenas.*/
        System.out.println("Por favor, introduzca el primer numero ");
        int numero= entrada.nextInt();
        int millares=numero/1000;
        int centenas=(numero-(millares*1000))/100;
	int decenas=(numero- (millares*1000 + centenas*100))/10;
	int unidades=numero-(millares*1000 + centenas*100 + decenas*10 );

	System.out.printf("Unidad= %d\n", unidades);
	System.out.printf("Decena= %d\n", decenas);
	System.out.printf("Centena= %d\n", centenas);
    }
}
