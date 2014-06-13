/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso3 {

    /**
     * Ingresar una letra entre a y e y reportar el mensaje de acuerdo a: A
     * excelente B bueno C regular D malo E pésimo
     *
     */
    String retorno;

    public String paso3(char letra) {
        if (letra == 'a') {
            retorno = "Exelente";
        } else if (letra == 'b') {
            retorno = "Bueno";

        } else if (letra == 'c') {
            retorno = "Regular";
        } else if (letra == 'd') {
            retorno = "malo";
        } else if (letra == 'e') {
            retorno = "pesimo";
        } else {
            retorno = "Error";

        }
        return retorno;
    }

}
