/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class SemesterTest {
    
    /**
     * Test of values method, of class Semester.
     */
    @Test
    public void testValues() {
        Semester[] expResult = Semester.values();
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Semester.
     */
    @Test
    public void testValueOf() {
        String name = "GANJIL";
        Semester expResult = Semester.GANJIL;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of fromString method, of class Semester.
     */
    @Test
    public void testFromString() {
        String text = "GENAP";
        Semester expResult = Semester.GENAP;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrder method, of class Semester.
     */
    @Test
    public void testGetOrder() {
        Semester instance = Semester.fromString("GANJIL");
        int expResult = 20;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }
    
}