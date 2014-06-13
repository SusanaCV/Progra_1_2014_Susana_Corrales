/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclass11;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class problema4 {
     
     private int[][] matriz;
    private Scanner teclado;

    public void CargaMatriz() {
        teclado = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int f = teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int c = teclado.nextInt();
        matriz = new int[f][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }
     public void Mayor() {
    	int mayor=matriz[0][0];
    	int fila=0;
    	int columna=0;
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    fila=f;
                    columna=c;
                }
            }
        }
        System.out.println(mayor);
        System.out.println("Fila: " + fila + " Columna: " + columna);
    }
      
}
