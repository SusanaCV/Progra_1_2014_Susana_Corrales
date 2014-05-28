/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

/**
 *
 * @author Estudiante
 *
 *
 *
 * Cargar un String por teclado e implementar los siguientes metodos:
 * a)Imprimir la primera mitad de los caracteres de la cadena. 
 * b)Imprimir el ultimo caracter.
 * c) imprimirlo en forma inversa.
 * d) Imprimir cada caracter del String separado con un guion.
 * e)Imprimir la cantidad de vocales.
 * f)Implementer un metodo que verifique si la cadena se lee igual de izquierda
 * a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las
 * 2 direcciones).
 *
 */
public class ejercicio2 {

    private String cadena;

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);


        }
        return (retorno);
    }
    public String UltimoValor()
    {
        return getCadena().charAt(getCadena().length()-1)+"";
    }
    public String Alrevez()
    {
        String retorno="";
        for (int i= getCadena().length()-1; i>=0; i--){
            retorno+= getCadena().charAt(i);
        }
        return (retorno);
    }
        /**
         * @return the cadena
         */
    
    
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

