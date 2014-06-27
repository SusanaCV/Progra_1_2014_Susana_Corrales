/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz2;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class ejercicios {

    private int[][] matriz;
    private Scanner teclado;

    public void CargaMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[3][3];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el numero correspondiente");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void Imprimir() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[f][c] + " ");

            }
            System.out.println();
        }
    }
    //* 1. Mostrar el promedio de los datos de la matriz.

    public void PromedioDatos() {
        int suma = 0;
        float promedio;
        int valor1 = matriz.length;
        int valor2 = matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];

            }

        }

        promedio = suma / (valor1 * valor2);
        System.out.println("El promedio de los datos de la matriz es: " + promedio);

    }

    //*2. Imprimir el mayor de los impares.
    public void MayorImpar() {
        int impar = 0;
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 1) {
                    impar = matriz[i][j];
                    if (impar > mayor) {
                        mayor = impar;
                    }

                }
            }
        }
        System.out.println("El mayor de los impares es: " + mayor);
    }
    //*3. Imprimir el promedio pares.

    public void PromedioPares() {
        int par;
        int menor = 0;
        float promedio;
        int valor1 = matriz.length;
        int valor2 = matriz[0].length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    par = matriz[i][j];
                    menor = menor + par;
                }
            }
        }
        promedio = menor / (valor1 * valor2);
        System.out.println("El el promedio de los pares es: " + promedio);
    }
    //*4. Mostrar el porcentaje de impares de cada fila.
    //*5. Ordenar cada fila.
    //*7. Imprimir el mayor de cada fila.

//    public void MayorFila() {
//        int mayor = 0;
//        int fila = 0;
//        fila++;
//        for (int i = 0; i < matriz.length; i++) {
//            if (matriz[fila][i] > mayor) {
//                mayor = matriz[fila][i];
//        }
//        System.out.println("El mayor de la fila  es : " + mayor);
//
//    }
//    }
    //*8. Imprimir el menor de cada columna.
    //*9. Imprimir el menor impar de cada fila.
    //*10. Imprimir los datos cuya suma de dígitos es 7.
    //*11. Imprimir las filas que tienen la mayor cantidad de datos pares.
    //*12. Imprimir la suma de dígitos de los datos de cada fila.
     public void SumaFila(){
         int suma = 0;
         int fila=0;
         int cont=0;
       for (int i = 0; i <matriz.length; i++) {
           if(cont<matriz.length){
            suma = suma + matriz[fila][i];
           cont++;
           
        }
       }
            System.out.println("La sumatoria de la fila es: " + suma);
       }

    
    //*13. Imprimir los datos primos de la matriz.	
    //*14. Imprimir los datos cuyo mayor digito es 5.
}
