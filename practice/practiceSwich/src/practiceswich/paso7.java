/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso7 {

    /**
     * Ingresar día de una fecha, reportar el día de la semana que le
     * corresponde, suponiendo que el día 1 de dicho mes fue lunes.
     */
    public String p7(int dia, int mes, int ans) {
        if ((dia <= 31) && (dia > 1)) {
            dia = dia - 1;
        } else if ((mes <= 12) && (mes > 1)) {
            dia = 31;
            mes=mes-1;
        } else {
            dia=31;
            mes = 12;
            ans = ans - 1;

        }
        return dia+"/"+mes+"/"+ans;
       // return (dia,mes,ans);
   
    }
}
