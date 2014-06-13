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
public class problema2 {

    private int[][] matriz;
    private Scanner teclado;

    public void CargaMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][5];
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 3; f++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c] = teclado.nextInt();

            }

        }
    }

    public void Cambio() {
        for (int c = 0; c < 5; c++) {
            int m = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = m;
        }
    }

    public void Imprimir() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");

            }
            System.out.println();
        }
    }
}
