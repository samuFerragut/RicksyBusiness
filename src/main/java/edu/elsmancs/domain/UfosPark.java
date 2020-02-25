package edu.elsmancs.domain;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UfosPark {
    private double fee = 500;
    private Map<String, String> flota = new HashMap<>();




    public void add(String ovni) {
            flota.put(ovni, null);
        }

    public void dispatch(CreditCard owner) {
        //mirar si hay disponibles, si hay coger el primero y reservarlo, intentar pagar.
        for (String ovni : flota.keySet()) {
            if (flota.get(ovni) == null) {
                if (owner.pay(fee)) {
                    flota.put(ovni, owner.number());
                }
            }
            if (flota.get(ovni) == owner.number()) {
                break;
            }
        }
    }

    String getUfoOf(String number) {
        String nameOvni = null;
        for (String ovni : flota.keySet()) {
            if (flota.get(ovni) == number) {
                nameOvni = ovni;
            }
        }
        return nameOvni;
    }

    @Override
    public String toString() {
        List<String> ListKeys = new ArrayList<String>(flota.keySet());
        return ListKeys.toString();
    }
}
