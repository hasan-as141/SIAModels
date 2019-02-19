/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import main.java.id.ac.unpar.siamodels.matakuliah.AIF101;
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
public class MataKuliahTest {
    
    /**
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance = instance2.createMataKuliah(kode.getKode());
        String expResult = kode.getKode();
        String result = instance.getKode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        String expResult = kode.getNama();
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Integer expResult = 6;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEquals() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliahFactory instance3 = new MataKuliahFactory();
        Object o = instance3.createMataKuliah(kode.getKode(), 6, kode.getNama());
        MataKuliah instance = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
}
