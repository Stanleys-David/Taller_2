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
public class Punto_6 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Desarrolle un programa en java que calcule el índice de masa corporal
        BMI el cual está dado por la formula (pesoenKg / alturaenmetros*alturaenmetros)
*/
        System.out.println("Por favor, introduzca su peso en Kg: ");
        double peso= entrada.nextDouble();
        System.out.println("Por favor, introduzca su peso en Metros:  ");
        double altura= entrada.nextDouble();
        System.out.printf("La masa corporar BMI es: %.2f\n", peso/(altura*altura));
        
        
        

    }
    
}

    
