/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class17;

/**
 *
 * @author estudiante
 */
public class NodoDeLista {
    
    private String dato;
    public String CuentaBancaria;
    private NodoDeLista siguiente;
    
    public NodoDeLista()
    {
      dato="";
      siguiente=null;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }
    
  
    
}
