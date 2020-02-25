package edu.elsmancs.domain;

public class CrystalExpender {
    private int stock = 0;
    private double itemCost = 50;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }


    public void dispatch(CreditCard owner) {
        if (owner.pay(itemCost) && stock > 0) {
            this.stock -= 1;
        }
    }

    public int stock() {
        return stock;
    }

    @Override
    public String toString() {
        return "stock: " + stock + "\ncost: " + itemCost;
    }
}
