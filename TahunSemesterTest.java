/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

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
public class TahunSemesterTest {
    
    public TahunSemesterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        TahunSemester instance = new TahunSemester(2018, Semester.GANJIL);
        Semester expResult = Semester.GANJIL;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTahun method, of class TahunSemester.
     */
    @Test
    public void testGetTahun() {
        System.out.println("getTahun");
        TahunSemester instance = new TahunSemester(2018, Semester.GANJIL);
        int expResult = 2018;
        int result = instance.getTahun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test
    public void testGetKodeDPS() {
        System.out.println("getKodeDPS");
        TahunSemester instance = new TahunSemester(2018, Semester.GENAP);
        String expResult = "182";
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class TahunSemester.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        TahunSemester o = new TahunSemester(2018, Semester.GENAP);
        TahunSemester instance = new TahunSemester(2018, Semester.GANJIL);
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class TahunSemester.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new TahunSemester(2018, Semester.GENAP);
        TahunSemester instance = new TahunSemester(2018, Semester.GENAP);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class TahunSemester.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TahunSemester instance = new TahunSemester(2018, Semester.GENAP);
        String expResult = "TahunSemester ["+2018+"/"+Semester.GENAP+"]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
