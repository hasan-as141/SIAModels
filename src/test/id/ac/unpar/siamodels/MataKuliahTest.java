/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;
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
        AIF131101 kode = new AIF131101();
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
        AIF131101 kode = new AIF131101();
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
        AIF131101 kode = new AIF131101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Integer expResult = 6;
        Integer result = instance.getSks();
        assertEquals(expResult, result);
    }
}
