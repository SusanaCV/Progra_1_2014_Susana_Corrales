/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            opcion = oScanner.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorreo());
                    break;

                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio2 oejercicio2 = new ejercicio2();
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.UltimoValor());
                    System.out.println(oejercicio2.Alrevez());
                    System.out.println(oejercicio2.Guion());
                    System.out.println(oejercicio2.Vocales());
                    System.out.println(oejercicio2.Palindromo());
            }
      

        }while (opcion<=7);
        
        }
}

