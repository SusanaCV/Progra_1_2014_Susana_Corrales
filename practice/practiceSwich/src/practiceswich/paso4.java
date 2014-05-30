/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso4 {

    /**
     * Ingresar el número de mes y el año y reporte el número de días que tiene
     * ese mes.
     */
    int enero = 31;
    int febrero = 28;
    int marzo = 31;
    int abril = 30;
    int mayo = 31;
    int junio = 30;
    int julio = 31;
    int agosto = 31;
    int setiembre = 30;
    int octubre = 31;
    int noviembre = 30;
    int diciembre = 31;
    int retorno;

    public int p4(int m, int an) {
        if ((an % 4 == 0) && (m == 2)) {
            febrero = 29;
            retorno= febrero;
        } else if (m == 1) {
            retorno= enero;
        } else if (m == 2) {
            retorno= febrero;
        } else if (m == 3) {
              retorno= marzo;
        } else if (m == 4) {
              retorno =abril;
        } else if (m == 5) {
              retorno =mayo;
        } else if (m == 6) {
              retorno =junio;
        } else if (m == 7) {
              retorno =julio;
        } else if (m == 8) {
            retorno =agosto;
        } else if (m == 9) {
              retorno= setiembre;
        } else if (m == 10) {
              retorno =octubre;
        } else if (m == 11) {
              retorno =noviembre;
        } else if (m == 12) {
              retorno =diciembre;

        }
        return retorno;
     

    }

}
