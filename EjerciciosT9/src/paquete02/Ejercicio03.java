/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int[] media = new int [2];
        double suma = 0;
        double promedio = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma = suma + arreglo[i];
            
        }
        promedio = suma/arreglo.length;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > promedio){
                media[0] = media[0] + 1;
            }else{
                media[1] = media[1] + 1; 
            }
            
        }
        System.out.printf("La media aritmetica es: %.2f\n"
                + "Numeros mayores a la media: %d\n"
                + "Numeros menores a la media: %d\n",
                promedio,
                media[0],
                media[1]);
    }

}
