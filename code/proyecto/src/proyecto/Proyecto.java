/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int N = 6;
        double A = 3;
        double r= A-N;
        double  R = N + A;
        char C= 'K';
 Scanner teclado = new Scanner(System.in);
  System.out.print(N +"\n" );
   System.out.print(A+"\n"  );
    System.out.print(R +"\n" );
     System.out.print(r+"\n"  );
     System.out.print(C+Character.getNumericValue(C)+"\n");

    }
}
