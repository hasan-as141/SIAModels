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
 * @author i15059
 */
public class MataKuliahTest {
    
    public MataKuliahTest() {
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
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {
        MataKuliah instance = new MataKuliah("AIF101","Pemrograman Berorientasi Objek",6);
        String expResult = "AIF101";
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        MataKuliah instance = new MataKuliah("AIF101","Pemrograman Berorientasi Objek",6);
        String expResult = "Pemrograman Berorientasi Objek";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        MataKuliah instance = new MataKuliah("AIF101","Pemrograman Berorientasi Objek",6);
        Integer expResult = 6;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEquals() {
        Object o = new MataKuliah("AIF101","Pemrograman Berorientasi Objek",6);
        MataKuliah instance = new MataKuliah("AIF101","Pemrograman Berorientasi Objek",6);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
}
