/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ejercicio3 {
      private int [][] matriz;
    private Scanner teclado;
    
     public void CargaMatriz()
    {
        teclado=new Scanner (System.in);
        matriz=new int [3][4];
        
        for (int f=0; f < 3; f++){
            for (int c=0; c < 4; c++){
                System.out.println("Ingrese el numero correspondiente");
                matriz [f][c]=teclado.nextInt();
            }
        }
    }  
    public void PrimeraFila()
    {
        System.out.println("Primera fila de la matriz");
         for (int c=0; c < 4; c++){
           {
                System.out.println (matriz [0][c]);
                }
            }
    }
           public void UltimaFila()
    {
        System.out.println("Ultima fila de la matriz");
         for (int c=0; c < 4; c++){
           { 
                System.out.println (matriz [2][c]);
                }
            }
    }
           public void PrimeraColumna()
    {
        System.out.println("Primera columna de la matriz");
         for (int f=0; f < 3; f++){
           {
                System.out.println (matriz [f][0]);
                }
            }
    }
           public void UltimaColumna()
    {
        System.out.println("Ultima columna de la matriz");
         for (int f=0; f < 3; f++){
           {
                System.out.println (matriz [f][3]);
                }
            }
        System.out.println();
    }
}

    

