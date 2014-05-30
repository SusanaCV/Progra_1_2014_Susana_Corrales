/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso8 {
    /**
     * Preguntar qué día de la semana fue el día 1 del mes actual y reportar el día de la semana que es hoy.
     */
   public String dia(char dia1, int dia) {
        int x = 0;
        String retorno = "";
        switch (dia1) {
            case 'L':
            case 'l':
                x = 0;
                break;
            case 'M':
            case 'm':
                x = 1;
                break;
            case 'X':
            case 'x':
                x = 2;
                break;
            case 'J':
            case 'j':
                x = 3;
                break;
            case 'V':
            case 'v':
                x = 4;
                break;
            case 'S':
            case 's':
                x = 5;
                break;
            case 'D':
            case 'd':
                x = 6;
                break;
            default:
                System.out.println("Numero fuera de rango");
                break;
        }
        
        int result = (dia % 7) + x;
        switch (result) {
            case 0:
                retorno = "Domingo";
                break;
            case 1:
                retorno = "Lunes";
                break;
            case 2:
                retorno = "Martes";
                break;
            case 3:
                retorno = "Miercoles";
                break;
            case 4:
                retorno = "Jueves";
                break;
            case 5:
                retorno = "Viernes";
                break;
            case 6:
                retorno = "Sabado";
                break;
            default:
                retorno = "Numero fuera de rango";
                break;
        }

        return retorno;
    }
}
