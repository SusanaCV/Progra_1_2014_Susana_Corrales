/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicestring;

/**
 *
 * @author estudiante
 */

public class problema1 {

    private String cadena;

    public String ejercicio1() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);

        }
        return (retorno);
    }

    public String ejercicio2() {
        String retorno = getCadena();
        for (int i = 1; ejercicio1().length() > i; i++) {
            retorno += ejercicio1().charAt(i);
        }

        return (retorno);
    }

    public String ejercicio3(String palabra, String texto) {
        String retorno = getCadena();
        int posicion = texto.indexOf(palabra);
        if (posicion != -1) {
            retorno = texto.substring(0, posicion) + "-"
                    + texto.substring(posicion);
        } else {
            retorno = "No fue encontrado el string " + palabra + " en el texto ";
        }
        return (retorno);
    }

    public String ejercicio4(String palabra, String texto) {
        String retorno = "";
        int veces = 0;
        int pos = texto.indexOf(palabra);
        if (pos != -1) {
            veces++;
        }
        while (pos != -1) {
            pos = texto.indexOf(palabra, pos + 1);
            if (pos != -1) {
                veces++;
            }
        }
        retorno = "Se repitió " + veces + " veces.";
        return (retorno);
    }

    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
