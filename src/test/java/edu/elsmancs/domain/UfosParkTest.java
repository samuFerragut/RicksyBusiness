package edu.elsmancs.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UfosParkTest {

    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
        UfosPark ovnis = new UfosPark();
        assertNotNull(ovnis);
        ovnis.add("unx");
        assertEquals("[unx]", ovnis.toString());
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de crédito.
     * El crédito de la tarjeta varía.
     */
    @Test
    public void dispatchTest() {
        UfosPark ovnis = new UfosPark();
        CreditCard owner = new CreditCard("Abradolph Lincler", "4916119711304546");
        ovnis.add("unx");
        ovnis.dispatch(owner);
        assertEquals("unx", ovnis.getUfoOf(owner.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {
        UfosPark ovnis = new UfosPark();
        CreditCard owner = new CreditCard("Abradolph Lincler", "4916119711304546");
        ovnis.add("unx");
        owner.pay(3000);
        ovnis.dispatch(owner);
        assertEquals(null, ovnis.getUfoOf(owner.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
        UfosPark ovnis = new UfosPark();
        CreditCard owner = new CreditCard("Abradolph Lincler", "4916119711304546");
        ovnis.add("unx");
        ovnis.dispatch(owner);
        assertEquals("unx", ovnis.getUfoOf(owner.number()));
        ovnis.add("dox");
        CreditCard owner2 = new CreditCard("Abradolph Lincler", "4916119711304546");
        ovnis.dispatch(owner2);
        assertEquals("unx", ovnis.getUfoOf(owner2.number()));
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
        UfosPark ovnis = new UfosPark();
        CreditCard owner = new CreditCard("Squanchy", "4444444444444444");
        CreditCard owner2 = new CreditCard("Birdpearson", "1111111111111111");
        ovnis.add("unx");
        ovnis.dispatch(owner);
        ovnis.dispatch(owner2);
        assertEquals("unx", ovnis.getUfoOf(owner.number()));
        assertEquals(null, ovnis.getUfoOf(owner2.number()));
    }
}
