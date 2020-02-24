package edu.elsmancs.domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class CreditClassTest {

    @Test
    public void constructorTest() {
        CreditCard credit = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertTrue(credit.toString().contains("Abradolph"));
        assertTrue(credit.toString().contains("4916119"));
    }

    @Test
    public void toStringTest() {
        CreditCard credit = new CreditCard("Abradolph Lincler", "4916119711304546");
        System.out.println("toString() CreditCard test:");
        System.out.println(credit.toString());
    }

}
