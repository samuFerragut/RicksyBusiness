package edu.elsmancs.domain;

/**
 * Esta clase implementa GuestDispatcher para manejar
 * el expendedor de cristales.
 *
 * @author Samu Ferragut
 * @see GuestDispatcher
 */
public class CrystalExpender implements GuestDispatcher {
    private int stock = 0;
    private double itemCost = 50;

    /**
     *
     * @param stock Cantidad de cristales disponibles
     * @param itemCost Coste por cristal
     */

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /**
     * Este método cobra el cristal y reduce el stock.
     * @param owner Tarjeta del cliente que solicita el servic.
     */

    @Override
    public void dispatch(CreditCard owner) {
        if (owner.pay(itemCost) && stock > 0) {
            this.stock -= 1;
        }
    }

    /**
     *
     * @return Devuelve el stock de cristales restantes
     */

    int stock() {
        return stock;
    }


    @Override
    public String toString() {
        return "stock: " + stock + "\ncost: " + itemCost;
    }
}
