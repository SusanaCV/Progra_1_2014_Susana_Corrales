/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PracticeSwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        int n1;
        int option;
        boolean validar = true;
        char continuar;
        double resultado;
        char letra;
        int MES;
        int dia;
        int ans;
        int d;
        int m;
        int an;
    

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite una opciòn");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");

            option = Integer.parseInt(teclado.nextLine());
            switch (option) {
                case 1:
                    paso1 Ppaso1 = new paso1();
                    System.out.println("Digite un numero del 1 al 12");
                    mes= Integer.parseInt(teclado.nextLine());
                    System.out.println(Ppaso1.p1(mes));
                    break;
                case 2:
                    paso2 Ppaso2 = new paso2();
                    System.out.println("Digite un numero del 1 al 12");
                    n1 = Integer.parseInt(teclado.nextLine());
                    resultado = Ppaso2.p2(n1);
                    System.out.println(resultado);
                    break;
                case 3:
                    paso3 Ppaso3 = new paso3();
                    System.out.println("Digite una letra de la a a la e");
                    letra = (teclado.nextLine().charAt(0));
                    System.out.println(Ppaso3.paso3(letra));
                    break;
                case 4:
                    paso4 Ppaso4 = new paso4();
                    System.out.println("Digite la fecha del mes");
                    m = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    an = Integer.parseInt(teclado.nextLine());
                    System.out.println("El mes tiene  "+Ppaso4.p4(m, an)+ " días");
                            
                    break;
                case 5:
                    paso5 Ppaso5 = new paso5();
                    int random2 = Ppaso5.ramdom();
                    System.out.println("El número ramdom es: " + random2 + " El número romano es: " + Ppaso5.romanos(random2));
                    break;
                case 6:
                  paso6 Ppaso6 = new paso6();
                    System.out.println("Digite la fecha del dia");
                    dia = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite la fecha del mes");
                    MES = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    ans = Integer.parseInt(teclado.nextLine());
                    System.out.println(Ppaso6.p6(dia, MES, ans));
                    break;
                case 7:
                    paso7 Ppaso7 = new paso7();
                    System.out.println("Digite la fecha del dia");
                    dia = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite la fecha del mes");
                    MES = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    ans = Integer.parseInt(teclado.nextLine());
                    System.out.println(Ppaso7.p7(dia, MES, ans));
                    break;
                case 8:
                    char dia1;
                    System.out.println("Ingrese el dia 1 fue (L,M,X,J,V,S,D) : ");
                    dia1 = teclado.nextLine().charAt(0);
                    System.out.println("Ingrese el dia que es hoy: ");
                    dia = Integer.parseInt(teclado.nextLine());
                    paso8 Ppaso8 = new paso8();
                    System.out.println(Ppaso8.dia(dia1, dia));
                    break;
            }
            System.out.println("Desea continuar con otra operación S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
