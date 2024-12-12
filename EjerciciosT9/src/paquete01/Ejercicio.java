/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {
    
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite;
        int i = 0;
        String marca;
        System.out.println("Ingrese el numero de elementos del arreglo: ");
        limite = entrada.nextInt();
        
        String[] nombres = new String [limite];
        entrada.nextLine();
        while(i < nombres.length){
            
            System.out.println("Ingrese la marca del coche: ");
            marca = entrada.nextLine();
            marca = marca.toUpperCase();
            char inicial = marca.charAt(0);
            if(inicial != 'A' && inicial != 'C' && inicial != 'T'){
                nombres[i]= marca;
                i = i + 1;
            }
        }
        for(i = 0; i < nombres.length; i++){
            System.out.println("La marca que ingreso es: "+ nombres[i]);
            
        }
    }
}
