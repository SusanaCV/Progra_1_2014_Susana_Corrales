/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso2 {
    /**
     * Ingresar un numero entero, y si este termina en 2,5 u 8 reportar el cuadrado del número,
     * si este termina en 4,7 o 9 reportar el numero multiplicado por 5 
     * y reportar el mismo número en otro caso.
     */
  public double p2( int n1){
      if((n1==2)||(n1==5)||(n1==8)){
          n1=n1*n1;
      } else if ((n1==4)||(n1==7)||(n1==9)){
          n1=n1*5;
      }else{
          n1=n1;
      }
      return(n1);
  }

}
