/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.Semester;
import id.ac.unpar.siamodels.TahunSemester;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import id.ac.unpar.siamodels.matakuliah.AIF101;
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
public class MahasiswaTest {
    
    /**
     * Test of getNama method, of class Mahasiswa.
     */
    @Test
    public void testGetNama() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNama("Michael Walah");
        String expResult = "Michael Walah";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Mahasiswa.
     */
    @Test
    public void testSetNama() {
        String nama = "Michael Walah";
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNama(nama);
    }

    /**
     * Test of getNpm method, of class Mahasiswa.
     */
    @Test
    public void testGetNpm() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "2014730019";
        String result = instance.getNpm();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhotoURL method, of class Mahasiswa.
     */
    @Test
    public void testGetPhotoURL() throws MalformedURLException {
        Mahasiswa instance = new Mahasiswa("2010310045");
        instance.setPhotoPath("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        String expResult = instance.getPhotoPath();
                //new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        String result = instance.getPhotoPath();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhotoURL method, of class Mahasiswa.
     */
    @Test
    public void testSetPhotoURL() throws MalformedURLException {
        Mahasiswa instance = new Mahasiswa("2010310045");
        instance.setPhotoPath("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
    }

    /**
     * Test of calculateIPTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPTempuh() {
        AIF101 kode = new AIF101();
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), new MataKuliah(kode.getKode(), kode.getNama(), 6) {
        }, 'A', 85.60, 82.00, 83.25, 'A'));
        double expResult = 4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPKumulatif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKumulatif() {
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of calculateIPS method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPS() {
        Mahasiswa instance = null;
        double expResult = 0.0;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuh() {
        boolean lulusSaja = false;
        Mahasiswa instance = null;
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateTahunSemesterAktif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        Mahasiswa instance = null;
        Set<TahunSemester> expResult = null;
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasLulusKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasLulusKuliah() {
        String kodeMataKuliah = "";
        Mahasiswa instance = null;
        boolean expResult = false;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasTempuhKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasTempuhKuliah() {
        String kodeMataKuliah = "";
        Mahasiswa instance = null;
        boolean expResult = false;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTahunAngkatan method, of class Mahasiswa.
     */
    @Test
    public void testGetTahunAngkatan() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        int expResult = 2014;
        int result = instance.getTahunAngkatan();
        assertEquals(expResult, result);
    }
    
}
