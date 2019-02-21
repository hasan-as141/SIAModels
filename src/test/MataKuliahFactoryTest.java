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
import main.java.id.ac.unpar.siamodels.matakuliah.*;

/**
 *
 * @author lenovo
 */
public class MataKuliahFactoryTest {
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        AIF101 kode = new AIF101();
        int sks = 6;
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah result = instance.createMataKuliah(kode.getKode(), sks, kode.getNama());
        MataKuliah expResult = instance.createMataKuliah("AIF101");
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance.createMataKuliah(kode.getKode());
        MataKuliah expResult = matkul;
        MataKuliah result = instance.createMataKuliah(kode.getKode());
        assertEquals(expResult, result);
        
    }
}
