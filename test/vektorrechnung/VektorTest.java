/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author m.hepfer
 */
public class VektorTest {
    
    public VektorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of plus method, of class Vektor.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vektor that = new Vektor(1,2,3);
        Vektor instance = new Vektor(2,3,5);
        Vektor expResult = new Vektor(3.0,5.0,8.0);
        Vektor result = instance.plus(that);
        assertEquals(expResult.toString(),result.toString());
    }

    /**
     * Test of skalar method, of class Vektor.
     */
    @Test
    public void testSkalar() {
        System.out.println("skalar");
        Vektor that = new Vektor(1.0,2.0,3.0);
        Vektor instance = new Vektor(2.0,4.0,5.0);
        double expResult = 25.0;
        double result = instance.skalar(that);
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of kreuz method, of class Vektor.
     */
    @Test
    public void testKreuz() {
        System.out.println("kreuz");
        Vektor that = new Vektor(1.0,2.0,3.0);
        Vektor instance = new Vektor(2.0,4.0,5.0);
        Vektor expResult = new Vektor(2.0,-1.0,0.0);
        Vektor result = instance.kreuz(that);
        assertEquals(expResult.toString(),result.toString());
    }

    /**
     * Test of quersumme method, of class Vektor.
     */
    @Test
    public void testQuersumme() {
        System.out.println("quersumme");
        Vektor instance = new Vektor(1.0,2.0,3.0);
        double expResult = 6.0;
        double result = instance.quersumme();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Vektor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vektor instance = new Vektor(1,2,3);
        String expResult = "(1.0,2.0,3.0)";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
