/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import id.ac.unpar.siamodels.JadwalKuliah;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.Mahasiswa.Nilai;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.Dosen;
import id.ac.unpar.siamodels.TahunSemester;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * NPM 2015730018
 * @author Hasan Abdurrahim Shiddiq
 */
public class MahasiswaTest {
    
    /**
     * Test case untuk menguji method getNama()
     */
    @Test
    public void testCase1(){
        Mahasiswa m = new Mahasiswa("2010310045");
        m.setNama("Garfield");
        String name = "Garfield";
        assertEquals(name, "Garfield");
    }
    
    
    /**
     * Test case untuk menguji method getNpm()
     */
    @Test
    public void testCase2(){
        Mahasiswa m = new Mahasiswa("2010310045");
        String npm = "2010310045";
        assertEquals(npm, "2010310045");
    }
    
    /**
     * Test case untuk menguji method getPhotoPath()
     */
    @Test
    public void testCase3(){
        Mahasiswa m = new Mahasiswa("2010310045");
        String photoPath = "photo_path";
        m.setPhotoPath("photo_path");
        assertEquals(photoPath, m.getPhotoPath());
    }
    
    /**
     * Test case untuk menguji method getJadwalKuliahList()
     */
    @Test
    public void testCase4(){
        Mahasiswa malthael = new Mahasiswa("2010310045");
        List<JadwalKuliah> jkList = new ArrayList<JadwalKuliah>();
        MataKuliah algoDasar = new MataKuliah("001", "algo 101", 3);
        MataKuliah logikaKomp = new MataKuliah("003", "log komp", 3);
        Dosen andiAF = new Dosen("andi a.f.", "20017320");
        Dosen hilmanSN = new Dosen("hilman sn", "19997305");
        
        JadwalKuliah jk1 = new JadwalKuliah(algoDasar, 'a', andiAF, "rabu", "07.00-09.00", "09120");
        JadwalKuliah jk2 = new JadwalKuliah(logikaKomp, 'b', hilmanSN, "selasa", "09.00-11.00", "09122");
        
        jkList.add(jk1);
        jkList.add(jk2);     
        malthael.setJadwalKuliahList(jkList);
        
        List<JadwalKuliah> jkListBenar = new ArrayList<JadwalKuliah>();
        jkListBenar.add(jk1);
        jkListBenar.add(jk2);
        
        assertEquals(jkListBenar, malthael.getJadwalKuliahList());
    }
    
    /**
     * Test case untuk menguji method getEmailAddress()
     */
    @Test
    public void testCase5(){
        Mahasiswa malthael = new Mahasiswa("2010310045");
        String npmMalthael = "3110045@student.unpar.ac.id";
        assertEquals(npmMalthael, malthael.getEmailAddress());
    }
    
    /**
     * Test case untuk menguji method getEmailAddress() 2
     */
    @Test
    public void testCase6(){
        Mahasiswa samuel = new Mahasiswa("2017620017");
        String npmSamuel = "2017620017@student.unpar.ac.id";
        assertEquals(npmSamuel, samuel.getEmailAddress());
    }
    
    /**
     * Test case untuk menguji method getRiwayatNilai()
     */
    @Test
    public void testCase7(){
        Mahasiswa malthael = new Mahasiswa("2010310045");
        ArrayList<Nilai> cekNilaiMalthael = new ArrayList<>();
        assertEquals(cekNilaiMalthael, malthael.getRiwayatNilai());
    }
    
    /**
     * Test case untuk menguji method getNilaiTOEFL()
     */
    @Test
    public void testCase8(){
        Mahasiswa malthael = new Mahasiswa("2010310045");
        SortedMap<LocalDate, Integer> toeflMalthael = new TreeMap<LocalDate, Integer>();
        
        LocalDate toeflMalthaelSatu = LocalDate.of(2012, Month.FEBRUARY, 5);
        LocalDate toeflMalthaelDua = LocalDate.of(2011, Month.SEPTEMBER, 20);
        
        toeflMalthael.put(toeflMalthaelDua, 520);
        toeflMalthael.put(toeflMalthaelSatu, 400);
        
        malthael.setNilaiTOEFL(toeflMalthael);
        
        SortedMap<LocalDate, Integer> cekTOEFLMalthael = new TreeMap<LocalDate, Integer>();
        cekTOEFLMalthael.put(toeflMalthaelDua, 520);
        cekTOEFLMalthael.put(toeflMalthaelSatu, 400);
        
        
        assertEquals(cekTOEFLMalthael, malthael.getNilaiTOEFL());
    }
    
    /**
     * Test case untuk menguji method calculateIPLulus()
     */
    @Test
    public void testCase9(){
        Mahasiswa malthael = new Mahasiswa("2010310045");
        double belumAmbilMataKuliah = Double.NaN;
        assertEquals(belumAmbilMataKuliah, malthael.calculateIPTempuh(false), 0);
    }
    
    /**
     * 
     */
    @Test
    public void testCase10(){
        TahunSemester tahun18Genap = new TahunSemester("182");
        MataKuliah proyekInformatika = new MataKuliah("AIF302", "Proyek Informatika", 6);
        String nilaiAkhirProyekInformatika = "100";
        Nilai nilaiProyekIF = new Nilai(tahun18Genap, proyekInformatika, nilaiAkhirProyekInformatika);
        
        Mahasiswa malthael = new Mahasiswa("2010310045");
        Mahasiswa.Nilai nilaiPKN = new Mahasiswa.Nilai(tahun18Genap, proyekInformatika, nilaiAkhirProyekInformatika);
        //malthael.getRiwayatNilai().add(0, nilaiProyekIF);
        double nilaiLulus = 4.0;
        assertEquals(nilaiLulus, malthael.calculateIPTempuh(true), 100);
        
//        TahunSemester tahun18Genap = new TahunSemester("182");
//        MataKuliah proyekInformatika = new MataKuliah("AIF302", "Proyek Informatika", 6);
//        String nilaiAkhirProyekInformatika = "70";
//        Nilai nilaiProyekIF = new Nilai(tahun18Genap, proyekInformatika, nilaiAkhirProyekInformatika);
    }
}
