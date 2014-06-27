/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

/**
 *
 * @author estudiante
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo= {56,4,85,85,42};
        int [] arregloOrdenado;
        OrdenamientosDeSeleccion os=new OrdenamientosDeSeleccion();
        arregloOrdenado=os.ordenS(arreglo, "A");
        for (int i=0;i<arregloOrdenado.length;i++){
            System.out.println(arregloOrdenado[i]);
        }
        
    }
}
