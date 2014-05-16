/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author profe
 */
public class Account {

    private double saldoInicial;
    private boolean hayError;

    public Account() {
        saldoInicial = 0;
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

    /**
     * Este método sirve para aumentar la cuenta de un usuario
     *
     * @param monto parámetro para recibir el nuevo monto
     */
    public void Deposito(double monto) {
        saldoInicial += monto;
    }

    public void Retiro(double monto) {
        if (getSaldoInicial() >= monto) {
            setSaldoInicial(getSaldoInicial() - monto);
        } else {
            hayError = true;
        }
    }
}
