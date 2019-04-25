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
public class TahunSemesterTest {
    
    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemester() {
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
        TahunSemester o = new TahunSemester(2018, Semester.GENAP);
        TahunSemester instance = new TahunSemester(2019, Semester.GANJIL);
        int expResult = +1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class TahunSemester.
     */
    @Test
    public void testEquals() {
        Object obj = new TahunSemester(2018, Semester.GENAP);
        TahunSemester instance = new TahunSemester(2019, Semester.GANJIL);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class TahunSemester.
     */
    @Test
    public void testToString() {
        TahunSemester instance = new TahunSemester(2018, Semester.GENAP);
        String expResult = "TahunSemester ["+2018+"/"+Semester.GENAP+"]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}