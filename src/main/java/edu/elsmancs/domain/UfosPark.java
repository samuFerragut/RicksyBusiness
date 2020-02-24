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

    @Override
    public String toString() {
        List<String> ListKeys = new ArrayList<String>(flota.keySet());
        return ListKeys.toString();
    }
}
