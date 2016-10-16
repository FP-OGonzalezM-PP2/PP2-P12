/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p12;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // el arreglo siempre debe ir declarado en el main
        int[]vector = new int[10];
        vector = LlenarArreglo(vector);
        Mostrar(vector);
    }
    public static int[] LlenarArreglo(int[]v){
        Scanner entrada = new Scanner(System.in);
        int i=0;
        while(i < v.length){  
            //mientras que i no rebase el valor de lo largo del vector pedira un cantidad para almacenar en esa celda
                System.out.println("Introduce un numero para la posición [" +i +"]");
                v[i]=entrada.nextInt();
                i++;
        }
        return v;
    }
    public static void Mostrar(int[] v){
        int m=0,n=0;
        for (int i=1; i<v.length; i+=2){
            m = v[i] + m;
            n++;
        }
        //se calcula el promedio fuera del for, una vez que se ha analizar todas las celdas y determinar las que sean pares
        m = m / n;
        System.out.println("El promedio de las celdas con números pares es " +m);
    }    
}
