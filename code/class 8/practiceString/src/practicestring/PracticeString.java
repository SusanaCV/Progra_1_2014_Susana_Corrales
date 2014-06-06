/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicestring;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class PracticeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            opcion = oScanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite la cadena a evaluar");
                    oScanner = new Scanner(System.in);
                    problema1 oproblema1 = new problema1();
                    oproblema1.setCadena(oScanner.nextLine());
                    System.out.println(oproblema1.ejercicio1());
                    System.out.println(oproblema1.ejercicio2());
                    System.out.println("Digite el texto a evaluar");
                    String texto = oScanner.nextLine();
                    System.out.println("Digite la palabra a buscar");
                    String palabra = oScanner.nextLine();
                    System.out.println(oproblema1.ejercicio3(palabra, texto));
                    System.out.println("Digite el texto a evaluar");
                    texto = oScanner.nextLine();
                    System.out.println("Digite la palabra a buscar");
                    palabra = oScanner.nextLine();
                    System.out.println(oproblema1.ejercicio4(palabra, texto));
                    break;
                case 2:

                    break;
            }

        } while (opcion <= 3);

    }
}
