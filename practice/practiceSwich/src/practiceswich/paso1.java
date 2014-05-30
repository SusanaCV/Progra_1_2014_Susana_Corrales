/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso1 {

    /**
     * Ingresar un número entre 1 y 12 y reportar el mes que le corresponde
     */
    String retorno;

    public String p1(int mes) {
        if (mes == 1) {
            retorno = "Enero";
        } else if (mes == 2) {
            retorno = "Febrero";
        } else if (mes == 3) {
            retorno = "Marzo";
        } else if (mes == 4) {
            retorno = "Abril";
        } else if (mes == 5) {
            retorno = "Mayo";
        } else if (mes == 6) {
            retorno = "Junio";
        } else if (mes == 7) {
            retorno = "Julio";
        } else if (mes == 8) {
            retorno = "Agosto";
        } else if (mes == 9) {
            retorno = "Setiembre";
        } else if (mes == 10) {
            retorno = "Octubre";
        } else if (mes == 11) {
            retorno = "Noviembre";
        } else if (mes == 12) {
            retorno = "Diciembre";

        }
        return retorno;

    }
}
