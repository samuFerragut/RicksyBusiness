package edu.elsmancs.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrystalExpenderTest {

    @Test
    public void dispatchTest() {
        CrystalExpender cristales = new CrystalExpender(3, 50);
        CreditCard tarjeta = new CreditCard("Abradolph Lincler", "4916119711304546");
        cristales.dispatch(tarjeta);
        assertEquals(2, cristales.stock(), 0);
    }

    @Test
    public void stockTest() {
        CrystalExpender cristales = new CrystalExpender(3, 50);
        assertEquals(3, cristales.stock(), 0);
    }

}
