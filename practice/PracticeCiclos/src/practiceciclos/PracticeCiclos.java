/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceciclos;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PracticeCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * ejercicio 1
         *
         */
        int x;
        int y;
        int numero;
        int incremento;
        double vf;
        double vi;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero de * que quiere ");
        numero = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }

        System.out.print("\n");
        /**
         * ejercicio 2
         */
        System.out.println("Digite el numero x");
        x = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el numero y");
        y = Integer.parseInt(teclado.nextLine());
        System.out.print("\n");

        for (int i = 0; i <= x; i++) {
            if (i % y == 0) {
                System.out.print(" * ");
            } else {
                System.out.print(i + " ");
            }

        }
        /**
         * ejercicio 3
         *
         */
        System.out.print("\n");
        System.out.println("valor inicial");
        vi = Double.parseDouble(teclado.nextLine());
        System.out.println("valor final");
        vf = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el incremento que desea");
        incremento = Integer.parseInt(teclado.nextLine());
        System.out.print("\n");

        for (double i = vi; i <= vf; i = i + incremento) {
            System.out.print(i + " ");
        }
    }
}
