/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] arreglo = new String[3];
        arreglo[0] = "Café tradicional";
        arreglo[1] = "Café francés";
        arreglo[2] = "Café alemán";
        double[] precios = new double[3];
        precios[0] = 1.5;
        precios[1] = 2.1;
        precios[2] = 2.3;
        String continuar;
        String cadenaFinal = "El usuario ha comprado:\n";
        int opcion;
        int cantidad;
        double total_pagar;
        
        do {
            System.out.printf("Menu:\n0.%s\n1.%s\n2.%s\n",
                    arreglo[0],
                    arreglo[1],
                    arreglo[2]);
            System.out.println("Ingresa la opcion del menú que desea");
            opcion = entrada.nextInt();
            System.out.println("Ingrese la cantidad de tazas que desea");
            cantidad = entrada.nextInt();
            total_pagar = cantidad * precios[opcion];
            
            cadenaFinal = String.format("%s %s (%d t), valor a cancelar $ %.2f,",
                    cadenaFinal,
                    arreglo[opcion],
                    cantidad,
                    total_pagar);
            
            entrada.nextLine(); 
            System.out.println("Ingrese S si desea volver a ingreasr mas pedidos"
                    + ", caso contrario digite cualquier otra letra ");
            continuar = entrada.nextLine();
            continuar=continuar.toUpperCase();
        } while (continuar.equals("S"));
        
        System.out.println(cadenaFinal);
    }
}
