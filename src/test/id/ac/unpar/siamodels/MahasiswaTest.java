/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

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
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131102;
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
     * Test yang dilakukan untuk menguji pengambilan data mahasiswa berdasarkan nama mahasiswa.
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
     * Test yang dilakukan untuk menguji input data mahasiswa berdasarkan nama mahasiswa.
     */
    @Test
    public void testSetNama() {
        String nama = "Michael Walah";
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNama(nama);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan data mahasiswa berdasarkan npm mahasiswa.
     */
    @Test
    public void testGetNpm() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "2014730019";
        String result = instance.getNpm();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan foto mahasiswa.
     */
    @Test
    public void testGetPhotoPath() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String myURL = new String("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        instance.setPhotoPath(myURL);
        String expResult = instance.getPhotoPath();
        String result = instance.getPhotoPath();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji input foto mahasiswa.
     */
    @Test
    public void testSetPhotoPath() {
        String photoURL = new String("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNGfmUzzHKOTqKFkzC4gTRuUl5P5nP39Cti6KMLIdcyKOkwjuRHw");
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setPhotoPath(photoURL);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan jadwal kuliah mahasiswa
     * berdasarkan nama, kelas, npm, dosen, hari, jam, dan ruangan.
     */
    @Test
    public void testGetJadwalKuliahList() {
        AIF131101 kode = new AIF131101();
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
     * Test yang dilakukan untuk menguji input jadwal kuliah mahasiswa
     * berdasarkan nama, npm, kelas, dosen, hari, jam, dan ruangan.
     */
    @Test
    public void testSetJadwalKuliahList() {
        AIF131101 kode = new AIF131101();
        List<JadwalKuliah> jadwalKuliahList = new ArrayList<JadwalKuliah>();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Dosen dosen = new Dosen("1414051", "Keenan");
        jadwalKuliahList.add(new JadwalKuliah(instance3, 'A', dosen, "Senin", "08:00-10:00", "9122"));
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setJadwalKuliahList(jadwalKuliahList);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan data email mahasiswa.
     */
    @Test
    public void testGetEmailAddress() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "7314019@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan riwayat nilai dari mahasiswa
     * berdasarkan tahun semester, kode mata kuliah, jumlah sks, nama mata kuliah dan nilai akhir.
     */
    @Test
    public void testGetRiwayatNilai() {
        AIF131101 kode = new AIF131101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance3, "A"));
        List<Mahasiswa.Nilai> expResult = instance.getRiwayatNilai();
        List<Mahasiswa.Nilai> result = instance.getRiwayatNilai();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji pengambilan nilai TOEFL seorang mahasiswa
     * berdasarkan npm dan waktu saat ini,
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
     * Test yang dilakukan untuk menguji input nilai TOEFL mahasiswa
     * berdasarkan waktu saat ini dan npm mahasiswa.
     */
    @Test
    public void testSetNilaiTOEFL() {
        SortedMap<LocalDate, Integer> nilaiTOEFL = new TreeMap<>();
        nilaiTOEFL.put(LocalDate.now(), 20);
        Mahasiswa instance = new Mahasiswa("2014730019");
        instance.setNilaiTOEFL(nilaiTOEFL);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan ipk lulus dari seorang mahasiswa
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateIPKLulus() {
        AIF131101 kode = new AIF131101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPKLulus();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan ip lulus mahasiswa
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateIPLulus() {
        AIF131101 kode = new AIF131101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPLulus();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji ip tempuh seorang mahasiswa
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester dan nilai akhir.
     */
    @Test
    public void testCalculateIPTempuh() {
        AIF131101 kode = new AIF131101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        double expResult = 4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan ipk kumulatif dari mahasiswa selama 1 semester
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateIPKumulatif() {
        AIF131101 kode = new AIF131101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        double expResult = 4.0;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan ipk tempuh dari mahasiswa selama 1 semester
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateIPKTempuh() {
        AIF131101 kode = new AIF131101();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.calculateIPTempuh(lulusSaja);
        double expResult = 4.0;
        double result = instance.calculateIPKTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan ip sementara mahasiswa selama 1 semester.
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateIPS() {
        AIF131101 kode = new AIF131101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "C"));
        double expResult = 3.0;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan sks lulus dari seorang mahasiswa
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateSKSLulus() {
        AIF131101 kode =  new AIF131101();
        AIF131102 kode2 = new AIF131102();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance5, "C"));
        int expResult = 10;
        int result = instance.calculateSKSLulus();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan sks tempuh dari seorang mahasiswa selama 1 semester
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateSKSTempuh() {
        AIF131101 kode =  new AIF131101();
        AIF131102 kode2 = new AIF131102();
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance5, "C"));
        int expResult = 10;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji perhitungan tahun semester aktif bagi seorang mahasiswa
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        AIF131101 kode = new AIF131101();
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        Set<TahunSemester> expResult = new TreeSet<>();
        expResult.add(new TahunSemester("182"));
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji apakah seorang mahasiswa telah dinyatakan lulus terhadap 1 mata kuliah atau tidak
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testHasLulusKuliah() {
        String kodeMataKuliah = "AIF131101";
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kodeMataKuliah, 6, "Pemrograman Berorientasi Objek");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        boolean expResult = true;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk menguji apakah seorang mahasiswa telah menepuh suatu mata kuliah
     * berdasarkan npm mahasiswa, kode mata kuliah, sks mata kuliah, nama mata kuliah, tahun semester, dan nilai akhir.
     */
    @Test
    public void testHasTempuhKuliah() {
        String kodeMataKuliah = "AIF131101";
        Mahasiswa instance = new Mahasiswa("2014730019");
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kodeMataKuliah, 6, "Pemrograman Berorientasi Objek");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance3, "A"));
        boolean expResult = true;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk mendapatkan tahun angkatan dari seorang mahasiswa
     * berdasarkan npm mahasiswa yang diambil 4 digit terdepan.
     */
    @Test
    public void testGetTahunAngkatan() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        int expResult = 2014;
        int result = instance.getTahunAngkatan();
        assertEquals(expResult, result);
    }

    /**
     * Test yang dilakukan untuk mendapatkan npm dan nama dari seorang mahasiswa.
     */
    @Test
    public void testToString() {
        Mahasiswa instance = new Mahasiswa("2014730019");
        String expResult = "Mahasiswa [npm=" + instance.npm + ", nama=" + instance.nama + "]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
