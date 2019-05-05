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
import id.ac.unpar.siamodels.matakuliah.*;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;

/**
 *
 * @author lenovo
 */
public class MataKuliahFactoryTest {
    
    /**
     * Test yang dilakukan untuk menguji pembuatan mata kuliah
     * berdasarkan kode mata kuliah, jumlah sks mata kuliah tersebut, dan nama mata kuliah.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        AIF131101 kode = new AIF131101();
        int sks = 6;
        MataKuliahFactory instance = new MataKuliahFactory();
        MataKuliah result = instance.createMataKuliah(kode.getKode(), sks, kode.getNama());
        MataKuliah expResult = instance.createMataKuliah("AIF131101");
        assertEquals(expResult, result);
        
    }

    /**
     * Test yang dilakukan untuk menguji pembuatan mata kuliah hanya dengan menggunakan kode mata kuliah saja.
     */
    @Test
    public void testCreateMataKuliah_String() {
        AIF131101 kode = new AIF131101();
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance.createMataKuliah(kode.getKode());
        MataKuliah expResult = matkul;
        MataKuliah result = instance.createMataKuliah(kode.getKode());
        assertEquals(expResult, result);
        
    }
}
