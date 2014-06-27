/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16;

/**
 *
 * @author estudiante
 */
public class OrdenamientoBurbuja {

    public int[] OrdenamientoB(int[] arreglo2, String ordenamiento) {
        int indice;
        int indice2;
        int auxiliar;

        if (ordenamiento.equals("A")) {

            for (indice = 0; indice < arreglo2.length - 1; indice++) {
                for (indice2 = 0; indice2 < (((arreglo2.length) - indice) - 1); indice2++) {
                    if (arreglo2[indice2 + 1] < arreglo2[indice2]) {
                        auxiliar = arreglo2[indice2 + 1];
                        arreglo2[indice2 + 1] = arreglo2[indice2];
                        arreglo2[indice2] = auxiliar;
                    }
                }
            }
        } else {
            for (indice = 9999; indice > arreglo2.length - 1; indice--) {
                for (indice2 = 9999; indice2 > (((arreglo2.length) - indice) - 1); indice2--) {
                    if (arreglo2[indice2 + 1] > arreglo2[indice2]) {
                        auxiliar = arreglo2[indice2 + 1];
                        arreglo2[indice2 + 1] = arreglo2[indice2];
                        arreglo2[indice2] = auxiliar;
                    }
                }
            }
        }
        return arreglo2;
    }
}
