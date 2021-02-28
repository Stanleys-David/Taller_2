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
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*1. Escriba un programa en java que lea dos datos de tipo entero, los
        almacene en dos variables num1 y num2, y ejecute las siguientes
        instrucciones, analice los resultados:
        a) System.out.printf(”x = %d\n", x );
        b) System.out.printf(“El valor de %d + %d es %d\n”, x, x, ( x + x ) );
        c) System.out.printf(“x=%.2f”, x );
        d) System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );*/
        System.out.println("Por favor, introduzca el primer numero ");
        int num1= entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero ");
        int num2= entrada.nextInt();
        System.out.printf("num1 = %d\n", num1 );
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, ( num1 + num1 ) );
        System.out.printf("x = %.2f\n", (double)num1 );
        System.out.printf("%d - %d\n", ( num1 + num2 ), ( num2 + num1 ) );
    }
    
}

