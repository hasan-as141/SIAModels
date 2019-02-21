/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF101;
import main.java.id.ac.unpar.siamodels.Mahasiswa;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF102;
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
        Mahasiswa instance = new Mahasiswa("2014730019");
        URL myURL = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        instance.setPhotoURL(myURL);
        URL expResult = instance.getPhotoURL();
        URL result = instance.getPhotoURL();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhotoURL method, of class Mahasiswa.
     */
    @Test
    public void testSetPhotoURL() throws MalformedURLException {
        URL photoURL = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setPhotoURL(photoURL);
    }

    /**
     * Test of getJadwalKuliahList method, of class Mahasiswa.
     */
    @Test
    public void testGetJadwalKuliahList() {
        AIF101 kode = new AIF101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Dosen dosen = new Dosen("1414051", "Keenan");
        List<JadwalKuliah> instance4 = new ArrayList<>();
        instance4.add(new JadwalKuliah(instance3, 'A', dosen, "Senin", "08:00-10:00", "9122"));
        instance.setJadwalKuliahList(instance4);
        List<JadwalKuliah> expResult = instance4;
        List<JadwalKuliah> result = instance.getJadwalKuliahList();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJadwalKuliahList method, of class Mahasiswa.
     */
    @Test
    public void testSetJadwalKuliahList() {
        AIF101 kode = new AIF101();
        List<JadwalKuliah> jadwalKuliahList = new ArrayList<JadwalKuliah>();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Dosen dosen = new Dosen("1414051", "Keenan");
        jadwalKuliahList.add(new JadwalKuliah(instance3, 'A', dosen, "Senin", "08:00-10:00", "9122"));
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setJadwalKuliahList(jadwalKuliahList);
    }

    /**
     * Test of getEmailAddress method, of class Mahasiswa.
     */
    @Test
    public void testGetEmailAddress() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "7314019@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRiwayatNilai method, of class Mahasiswa.
     */
    @Test
    public void testGetRiwayatNilai() {
        AIF101 kode = new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance3, 'A', 80.50, 87.50, 78.60, 'A'));
        List<Mahasiswa.Nilai> expResult = instance.getRiwayatNilai();
        List<Mahasiswa.Nilai> result = instance.getRiwayatNilai();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNilaiTOEFL method, of class Mahasiswa.
     */
    @Test
    public void testGetNilaiTOEFL() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        SortedMap<LocalDate, Integer> instance2 = new TreeMap<>();
        instance2.put(LocalDate.now(), 20);
        instance.setNilaiTOEFL(instance2);
        SortedMap<LocalDate, Integer> expResult = new TreeMap<>();
        expResult.put(LocalDate.now(), 20);
        SortedMap<LocalDate, Integer> result = instance.getNilaiTOEFL();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNilaiTOEFL method, of class Mahasiswa.
     */
    @Test
    public void testSetNilaiTOEFL() {
        SortedMap<LocalDate, Integer> nilaiTOEFL = new TreeMap<>();
        nilaiTOEFL.put(LocalDate.now(), 20);
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNilaiTOEFL(nilaiTOEFL);
    }

    /**
     * Test of calculateIPKLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKLulus() {
        AIF101 kode = new AIF101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPKLulus();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPLulus() {
        AIF101 kode = new AIF101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPLulus();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPTempuh() {
        AIF101 kode = new AIF101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        double expResult = 4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPKumulatif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKumulatif() {
        AIF101 kode = new AIF101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        double expResult = 4.0;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPKTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKTempuh() {
        AIF101 kode = new AIF101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPKTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateIPS method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPS() {
        AIF101 kode = new AIF101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 60.85, 78.90, 63.80, 'C'));
        double expResult = 3.0;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calculateSKSLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSLulus() {
        AIF101 kode =  new AIF101();
        AIF102 kode2 = new AIF102();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance5, 'A', 60.85, 78.90, 63.80, 'C'));
        int expResult = 10;
        int result = instance.calculateSKSLulus();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuh() {
        AIF101 kode =  new AIF101();
        AIF102 kode2 = new AIF102();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance5, 'A', 60.85, 78.90, 63.80, 'C'));
        int expResult = 10;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateTahunSemesterAktif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        AIF101 kode = new AIF101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        Set<TahunSemester> expResult = new TreeSet<>();
        expResult.add(new TahunSemester("182"));
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasLulusKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasLulusKuliah() {
        String kodeMataKuliah = "AIF101";
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kodeMataKuliah, 6, "Pemrograman Berorientasi Objek");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        boolean expResult = true;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test of hasTempuhKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasTempuhKuliah() {
        String kodeMataKuliah = "AIF101";
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kodeMataKuliah, 6, "Pemrograman Berorientasi Objek");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        boolean expResult = true;
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

    /**
     * Test of toString method, of class Mahasiswa.
     */
    @Test
    public void testToString() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "Mahasiswa [npm=" + instance.npm + ", nama=" + instance.nama + "]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
