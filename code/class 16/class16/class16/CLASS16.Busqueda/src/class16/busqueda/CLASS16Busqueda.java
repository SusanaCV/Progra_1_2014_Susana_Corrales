/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class16.busqueda;

/**
 *
 * @author estudiante
 */
public class CLASS16Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] arreglo={"Mario","Efren","Susana","Campbell","Agustin","Elias Guapo"};
        
        BusquedaLineal bl=new BusquedaLineal();
        System.out.println("La busqueda lineal es: "+bl.BuscarNombre(arreglo, "Efren"));
        
        System.out.println();
        
        BusquedaBinaria bn=new BusquedaBinaria();
        System.out.println("La busqueda Binaria es: "+bl.BuscarNombre(arreglo, "Campbell"));
        
        System.out.println();
    }
}
