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
public class Punto_9 {
                    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        /*Se desea construir un programa en java que permita calcular el costo
        total de un viaje que tiene una duración en días. Para ello, se requiere
        los siguientes datos: Número de días del viaje, Total de kilómetros
        conducidos por día, costo por litro de gasolina, promedio de kilometro 
        por litro de gasolina, pago por estacionamiento por día, pago de peajes
        por día. Imprima en consola el resultado*/
        System.out.println("Por favor, introduzca el precio de la compra del producto: ");
        double compra= entrada.nextDouble();
        System.out.printf("el porcentaje de utilidad es igual a %.2f\n",(compra/venta)*100 );
    }
    
}
