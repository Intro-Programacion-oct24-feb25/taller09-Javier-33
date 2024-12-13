/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros_ingresados=new int [10];
        double suma=0;
        double promedio;
        double diferencia;
        int numero;
        for (int i = 0; i < numeros_ingresados.length; i++) {
            System.out.printf("Ingrese el %d número\n",i);
            numero=entrada.nextInt();
            numeros_ingresados[i]=numero;
            suma=suma+numero;
        }
        
        promedio=suma/numeros_ingresados.length;
        System.out.println("Promedio: "+promedio);
        
        for (int i = 0; i < numeros_ingresados.length; i++) {
            diferencia=promedio-numeros_ingresados[i];
            System.out.printf("número: %d ..... diferencia: %.2f\n",
                    numeros_ingresados[i],
                    diferencia);
        }
        
    }
    
}
