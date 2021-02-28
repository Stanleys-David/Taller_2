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
public class Punto_7 {
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Juan conoce el precio de compra y de venta de unos de los productos de
        su tienda y requiere conocer cuál es su % de utilidad.
        Desarrolle un programa en java que lo ayude con ese cálculo.*/
        System.out.println("Por favor, introduzca el precio de la compra del producto: ");
        double compra= entrada.nextDouble();
        System.out.println("Por favor, introduzca el precio de la venta del producto:  ");
        double venta= entrada.nextDouble();
        System.out.printf("el porcentaje de utilidad es igual a %.2f\n",(compra/venta)*100 );
        
        
        

    }
    
    
}
