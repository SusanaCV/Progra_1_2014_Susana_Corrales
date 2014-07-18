/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class19;

/**
 *
 * @author Estudiante
 */
public class Class19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila oPila = new Pila();
        oPila.Push("Efren");
        oPila.Push("Joss");
        oPila.Push("Andrey");
        oPila.Push("Jose");
        oPila.Imprimir();
        System.out.println("La canridad de elementos es " + oPila.Cantidad());
        if (!oPila.Vacia()) {
            System.out.println("La pila no esta vacia");
        } else {
            System.out.println("La pila esta vacia");
        }
        oPila.Pop();
        oPila.Pop();
        oPila.Imprimir();


    }
}
