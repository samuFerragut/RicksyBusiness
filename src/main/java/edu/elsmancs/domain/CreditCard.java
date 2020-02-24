package edu.elsmancs.domain;

import javax.script.ScriptEngine;

public class CreditCard {
    private String owner = "";
    private String number = "";
    private double credit = 3000;
    private String SYMBOL = "EZIS";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String number() {
        return number;
    }

    public double credit() {
        return this.credit;
    }


    @Override
    public String toString() {
        return "owner: " + owner + "\nnumber: " + number + "\ncredit: " + credit + SYMBOL;
    }
}
