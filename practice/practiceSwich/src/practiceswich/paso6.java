/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceswich;

/**
 *
 * @author Estudiante
 */
public class paso6 {

    /**
     * Dados como entrada 3 enteros representando la fecha como día, mes, año,
     * imprimir la fecha del día anterior. Por ejemplo para una entrada como: 1,
     * 3,1992 La salida será: Fecha anterior a 1-3-1992 es 29-02-1992.
     */
     public String p6(int d, int m,int a) {
        String retorno = "";
        int ma, nd = 0;
        ma = m - 1;
        if (ma == 0) {
            ma = 12;
        }
        switch(ma)
          {
               case 1: case 3:case 5: case 7: case 8: case 10: case 12:
                   nd=31;
                   break;
               case 4: case 6: case 9: case 11:
                  nd=30;
                  break;
               case 2:
                    if((a%4==0 && a%100!=0) || a % 400==0) nd =29;
                    else nd=28;
                    break;
          }
          d = d-1;
          if(d==0)
          {
             d=nd;
             m=m-1;
             if(m==0)
             {
               m=12;
               a=a-1;
             }
          }
          retorno = "La fecha del dia anterior es: "+d+"/"+m+"/"+a;

        return retorno;
    }
}
