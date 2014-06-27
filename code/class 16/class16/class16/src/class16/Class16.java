/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Class16 {
    private static Scanner Scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner oScanner = new Scanner(System.in);
         int []arreglo={56,4,85,85,42};
        int [] arregloOrdenado;
        int []arreglo2={56,4,85,85,42};
         
        OrdenamientoBurbuja ob =new OrdenamientoBurbuja();
    
        Scanner = new Scanner(System.in);
        System.out.println("Digite una letra");
        String letra=oScanner.nextLine();
        arregloOrdenado =ob.OrdenamientoB(arreglo2, letra);
        System.out.println("Ordenemiento Burbuja");
        for (int i=0;i<arregloOrdenado.length;i++){
            System.out.println(arregloOrdenado[i]);
        }
       

    
    }
}
