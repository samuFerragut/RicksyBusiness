package edu.elsmancs.domain;

import javax.script.ScriptEngine;

/**
 * Esta clase simula una tarjeta de crédito
 * para saber de que crédito dispone cada sujeto.
 *
 * @author Samu Ferragut
 */
public class CreditCard {
    private String owner = "";
    private String number = "";
    private double credit = 3000;
    private String SYMBOL = "EZIS";

    /**
    /**
     *
     * @param owner Nombre del propietario
     * @param number Número de la tarjeta
     */
    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    /**
     *
     * @return El método devuelve el número de la tarjeta
     */
    public String number() {
        return number;
    }

    /**
     *
     * @return Devuelve el saldo de la tarjeta
     */
    public double credit() {
        return this.credit;
    }

    /**
     * Este método permite hacer el pago del servicio contratado
     * devolviendo un boolean para indicar si se ha completado o no.
     *
     *
     * @param pago cantidad para restar al crédito de la tarjeta
     * @return True si se ha completado el pago,
     * False si no se ha podido completar
     */
    boolean pay(double pago) {
        if (pago <= credit) {
            credit = credit - pago;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "owner: " + owner + "\nnumber: " + number + "\ncredit: " + credit + SYMBOL;
    }
}
