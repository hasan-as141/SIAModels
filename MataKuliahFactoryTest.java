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
 * @author User
 */
public class MataKuliahFactoryTest {
    
    public MataKuliahFactoryTest() {
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
     * Test of getInstance method, of class MataKuliahFactory.
     */
     /**@Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MataKuliahFactory expResult = null;
        MataKuliahFactory result = MataKuliahFactory.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        System.out.println("createMataKuliah");
        String kode = "AIF101";
        int sks = 6;
        String nama = "akang";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah expResult = instance.createMataKuliah(kode);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        System.out.println("createMataKuliah");
        String expResult = "AIF103";
        String kode = "AIF103";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah MK = instance.createMataKuliah(kode);
        String result = MK.getKode();
        
        assertEquals(expResult, result);
        
    }
    
}
