/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class paso5 {

    /**
     * Generar un número aleatorio entre 1 y 3000, mostrarlo en la pantalla y
     * reportar su equivalente en números romanos.
     */
    public int ramdom() {//aqui tenia varios errores ya los arregle

        int random = (int) (Math.random() * (3000 - 1) + 1);

        return random;
    }

    public String romanos(int numero) {
        int dromano = 0, romano = 0, p = 0;
        String numeroromano = "";
        ArrayList<String> palabra = new ArrayList<String>();//no se si sepa que es un arraylist
        if (numero < 4000) {//pero su funcion es tener una lista de objetos definidos en este caso String
            p = 0;
            while (numero > 0) {
                dromano = numero % 10;
                romano = dromano * (int) Math.pow(10, p);
                switch (romano) {
                    case 1:
                        numeroromano = "I";
                        break;
                    case 2:
                        numeroromano = "II";
                        break;
                    case 3:
                        numeroromano = "III";
                        break;
                    case 4:
                        numeroromano = "IV";
                        break;
                    case 5:
                        numeroromano = "V";
                        break;
                    case 6:
                        numeroromano = "VI";
                        break;
                    case 7:
                        numeroromano = "VII";
                        break;
                    case 8:
                        numeroromano = "VIII";
                        break;
                    case 9:
                        numeroromano = "IX";
                        break;
                    case 10:
                        numeroromano = "X";
                        break;
                    case 20:
                        numeroromano = "XX";
                        break;
                    case 30:
                        numeroromano = "XXX";
                        break;
                    case 40:
                        numeroromano = "XL";
                        break;
                    case 50:
                        numeroromano = "L";
                        break;
                    case 60:
                        numeroromano = "LX";
                        break;
                    case 70:
                        numeroromano = "LXX";
                        break;
                    case 80:
                        numeroromano = "LXXX";
                        break;
                    case 90:
                        numeroromano = "XC";
                        break;
                    case 100:
                        numeroromano = "C";
                        break;
                    case 200:
                        numeroromano = "CC";
                        break;
                    case 300:
                        numeroromano = "CCC";
                        break;
                    case 400:
                        numeroromano = "CD";
                        break;
                    case 500:
                        numeroromano = "D";
                        break;
                    case 600:
                        numeroromano = "DC";
                        break;
                    case 700:
                        numeroromano = "DCC";
                        break;
                    case 800:
                        numeroromano = "DCCC";
                        break;
                    case 900:
                        numeroromano = "CM";
                        break;
                    case 1000:
                        numeroromano = "M";
                        break;
                    case 2000:
                        numeroromano = "MM";
                        break;
                    case 3000:
                        numeroromano = "MMM";
                        break;
                }
                palabra.add(numeroromano);//con esto se agrega a la lista un numero romano
                numero = numero / 10;
                p++;
            }
        }
        String fin = "";
        for (int i = palabra.size(); i > 0; i--) {//aqui se le da vuelta a la lista para obtenerla en el orden debido
            fin += palabra.get(i - 1);
        }
        return fin;
    }
}
