/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Class9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1 oejercicio1 = new ejercicio1();

                    for (int i = 0; i < 5; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del trabajador # " + (i + 1));
                        oejercicio1.AgregarSalario(teclado.nextDouble());

                    }
                    System.out.println(oejercicio1.ImprimirSueldos());
                    break;
                default:
  
                    break;

            }
        } while (opcion < 5);
    }
}
