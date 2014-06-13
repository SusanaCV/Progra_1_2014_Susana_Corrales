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
public class problema3 {

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

    public void Vertices() {
        System.out.print(matriz[0][0] + " ");
        System.out.print(matriz[0][matriz.length - 1] + " ");
        System.out.print(matriz[matriz.length - 1][0] + " ");
        System.out.print(matriz[matriz.length - 1][matriz.length - 1] + " ");
    }
}
