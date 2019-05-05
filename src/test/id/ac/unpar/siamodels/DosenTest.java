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
public class DosenTest {

    /**
     * Test yang dilakukan untuk mendapatkan nik seorang dosen
     */
    @Test
    public void testGetNik() {
        Dosen instance = new Dosen("119015", "Pascal");
        String expResult = "119015";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk membuat atau mengubah nik seorang dosen
     */
    @Test
    public void testSetNik() {
        String nik = "119015";
        Dosen instance = new Dosen(nik, "Pascal");
        instance.setNik(nik);
    }

    /**
     * Test yang dilakukan untuk mendapatkan nama seorang dosen
     */
    @Test
    public void testGetNama() {
        Dosen instance = new Dosen("2015","rafael");
        String expResult = "rafael";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk membuat atau mengubah nama dosen
     */
    @Test
    public void testSetNama() {
        String nama = "Keenan";
        Dosen instance = new Dosen("140058", "Keenan");
        instance.setNama(nama);
    }

    /**
     * Test yang dilakukan untuk menguji dan membandingkan nik dan nama seorang dosen
     */
    @Test
    public void testEquals() {
        Object obj = new Dosen("141401", "Keenan");
        Dosen instance = new Dosen("141401", "Adi");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
