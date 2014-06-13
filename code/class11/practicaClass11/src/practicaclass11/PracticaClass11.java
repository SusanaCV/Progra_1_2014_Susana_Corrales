/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclass11;

/**
 *
 * @author estudiante
 */
public class PracticaClass11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Problema 1:  Crear una matriz de 2 filas y 5 columnas.
        //Realizar la carga de componentes por columna 
        //(es decir primero ingresar toda la primer columna, luego la segunda columna y así sucesivamente)
        //Imprimir luego la matriz.

        problema1 oproblema1 = new problema1();
        oproblema1.CargaMatriz();
        oproblema1.ImprimirMatriz();

        //problema 2:Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. 
        //Imprimir luego la matriz.

        problema2 oproblema2 = new problema2();
        oproblema2.CargaMatriz();
        oproblema2.Cambio();
        oproblema2.Imprimir();

        //problema 3:Crear una matriz de n * m filas (cargar n y m por teclado)
        //Imprimir los cuatro valores que se encuentran en los vértices de la misma (matriz [0] [0] etc.)*/

        problema3 oproblema3 = new problema3();
        oproblema3.CargaMatriz();
        oproblema3.Vertices();

        // Problema 4: Crear una matriz de n * m filas (cargar n y m por teclado) 
        //Imprimir el mayor elemento y la fila y columna donde se almacena.
        problema4 oproblema4 = new problema4();
        oproblema4.CargaMatriz();
        oproblema4.Mayor();
    }
}
