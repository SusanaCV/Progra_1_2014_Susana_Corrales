/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

/**
 *
 * @author estudiante
 */
public class Class11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio1 oejercicio1=new ejercicio1();
        oejercicio1.CargaMatriz();
        oejercicio1.Imprimir();
        
        ejercicio2 oejercicio2=new ejercicio2();
        oejercicio2.CargaMatriz();
        oejercicio2.ImprimirDiagonal();
        

        ejercicio3 oejercicio3=new ejercicio3();
        oejercicio3.CargaMatriz();
        oejercicio3.PrimeraFila();
        oejercicio3.UltimaFila();
        oejercicio3.PrimeraColumna();
        oejercicio3.UltimaColumna();
    }
}
