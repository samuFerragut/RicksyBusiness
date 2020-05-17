package edu.elsmancs.domain;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase usa GuestDispatcher para el alquiler
 * de ufos en la fiesta.
 *
 * @author Samu Ferragut
 * @see GuestDispatcher
 */

public class UfosPark implements GuestDispatcher {
    private double fee = 500;
    private Map<String, String> flota = new HashMap<>();

    /**
     * Se usa para añadir ovnis.
     * @param ovni ufo para añadir
     */


    public void add(String ovni) {
            flota.put(ovni, null);
        }

    /**
     * Cobra el ufo y se lo asigna al cliente.
     * @param owner Tarjeta que solicita el servicio
     */

    @Override
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

    /**
     * Devuelve el ovni asignado a la tarjeta
     * @param number Tarjeta a la que le asigna el ovni y se quiere consultar
     * @return Devuelve el ovni asignado a la tarjeta consultada.
     */

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
