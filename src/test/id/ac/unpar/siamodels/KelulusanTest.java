/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.*;
import id.ac.unpar.siamodels.prodi.teknikinformatika.Kelulusan;
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
public class KelulusanTest {
    
    /**
     * Test yang dilakukan untuk mengecek apakah mahasiswa layak untuk lulus atau tidak
     * berdasarkan mata kuliah yang diambil dan total jumlah sks.
     */
    @Test
    public void testCheckPrasyarat() {
        Mahasiswa mahasiswa = new Mahasiswa("2014730019");
        
        AIF181103 kode =  new AIF181103();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 4, kode.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance3, "A"));
        
        AIF181105 kode2 = new AIF181105();
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance5, "C"));
        
        AIF181107 kode3 = new AIF181107();
        MataKuliahFactory instance6 = new MataKuliahFactory();
        MataKuliah instance7 = instance6.createMataKuliah(kode3.getKode(), 3, kode3.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance7, "A"));
        
        AIF181202 kode4 = new AIF181202();
        MataKuliahFactory instance8 = new MataKuliahFactory();
        MataKuliah instance9 = instance8.createMataKuliah(kode4.getKode(), 4, kode4.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance9, "A"));
        
        AIF181104 kode5 = new AIF181104();
        MataKuliahFactory instance10 = new MataKuliahFactory();
        MataKuliah instance11 = instance10.createMataKuliah(kode5.getKode(), 3, kode5.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance11, "B"));
        
        AIF182101 kode6 = new AIF182101();
        MataKuliahFactory instance12 = new MataKuliahFactory();
        MataKuliah instance13 = instance12.createMataKuliah(kode6.getKode(), 4, kode6.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance13, "B"));
        
        AIF182103 kode7 = new AIF182103();
        MataKuliahFactory instance14 = new MataKuliahFactory();
        MataKuliah instance15 = instance14.createMataKuliah(kode7.getKode(), 4, kode7.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance15, "C"));
        
        AIF182105 kode8 = new AIF182105();
        MataKuliahFactory instance16 = new MataKuliahFactory();
        MataKuliah instance17 = instance16.createMataKuliah(kode8.getKode(), 6, kode8.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance17, "C"));
        
        AIF182109 kode9 = new AIF182109();
        MataKuliahFactory instance18 = new MataKuliahFactory();
        MataKuliah instance19 = instance18.createMataKuliah(kode9.getKode(), 3, kode9.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance19, "B"));
        
        AIF182100 kode10 = new AIF182100();
        MataKuliahFactory instance20 = new MataKuliahFactory();
        MataKuliah instance21 = instance20.createMataKuliah(kode10.getKode(), 4, kode10.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance21, "C"));
        
        AIF182302 kode11 = new AIF182302();
        MataKuliahFactory instance22 = new MataKuliahFactory();
        MataKuliah instance23 = instance22.createMataKuliah(kode11.getKode(), 4, kode11.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance23, "C"));
        
        AIF182106 kode12 = new AIF182106();
        MataKuliahFactory instance24 = new MataKuliahFactory();
        MataKuliah instance25 = instance24.createMataKuliah(kode12.getKode(), 4, kode12.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance25, "B"));
        
        AIF182308 kode13 = new AIF182308();
        MataKuliahFactory instance26 = new MataKuliahFactory();
        MataKuliah instance27 = instance26.createMataKuliah(kode13.getKode(), 3, kode13.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance27, "C"));
        
        AIF182210 kode14 = new AIF182210();
        MataKuliahFactory instance28 = new MataKuliahFactory();
        MataKuliah instance29 = instance28.createMataKuliah(kode14.getKode(), 4, kode14.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance29, "C"));
        
        AIF183201 kode15 = new AIF183201();
        MataKuliahFactory instance30 = new MataKuliahFactory();
        MataKuliah instance31 = instance30.createMataKuliah(kode15.getKode(), 4, kode15.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance31, "B"));
        
        AIF183303 kode16 = new AIF183303();
        MataKuliahFactory instance32 = new MataKuliahFactory();
        MataKuliah instance33 = instance32.createMataKuliah(kode16.getKode(), 3, kode16.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance33, "B"));
        
        AIF183107 kode17 = new AIF183107();
        MataKuliahFactory instance34 = new MataKuliahFactory();
        MataKuliah instance35 = instance34.createMataKuliah(kode17.getKode(), 4, kode17.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance35, "C"));
        
        AIF183111 kode18 = new AIF183111();
        MataKuliahFactory instance36 = new MataKuliahFactory();
        MataKuliah instance37 = instance36.createMataKuliah(kode18.getKode(), 3, kode18.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance37, "B"));
        
        AIF183002 kode19 = new AIF183002();
        MataKuliahFactory instance38 = new MataKuliahFactory();
        MataKuliah instance39 = instance38.createMataKuliah(kode19.getKode(), 2, kode19.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance39, "B"));
        
        AIF183204 kode20 = new AIF183204();
        MataKuliahFactory instance40 = new MataKuliahFactory();
        MataKuliah instance41 = instance40.createMataKuliah(kode20.getKode(), 2, kode20.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance41, "A"));
        
        AIF184005 kode21 = new AIF184005();
        MataKuliahFactory instance42 = new MataKuliahFactory();
        MataKuliah instance43 = instance42.createMataKuliah(kode21.getKode(), 2, kode21.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance43, "A"));
        
        AIF184000 kode22 = new AIF184000();
        MataKuliahFactory instance44 = new MataKuliahFactory();
        MataKuliah instance45 = instance44.createMataKuliah(kode22.getKode(), 4, kode22.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance45, "A"));
        
        AIF181101 kode23 = new AIF181101();
        MataKuliahFactory instance46 = new MataKuliahFactory();
        MataKuliah instance47 = instance46.createMataKuliah(kode23.getKode(), 3, kode23.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance47, "A"));
        
        MKU130001 kode24 = new MKU130001();
        MataKuliahFactory instance48 = new MataKuliahFactory();
        MataKuliah instance49 = instance48.createMataKuliah(kode24.getKode(), 2, kode24.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance49, "A"));
        
        MKU130002 kode25 = new MKU130002();
        MataKuliahFactory instance50 = new MataKuliahFactory();
        MataKuliah instance51 = instance50.createMataKuliah(kode25.getKode(), 2, kode25.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance51, "A"));
        
        MKU130008 kode26 = new MKU130008();
        MataKuliahFactory instance52 = new MataKuliahFactory();
        MataKuliah instance53 = instance52.createMataKuliah(kode26.getKode(), 2, kode26.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance53, "A"));
        
        MKU130009 kode27 = new MKU130009();
        MataKuliahFactory instance54 = new MataKuliahFactory();
        MataKuliah instance55 = instance54.createMataKuliah(kode27.getKode(), 2, kode27.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance55, "A"));
        
        MKU130011 kode28 = new MKU130011();
        MataKuliahFactory instance56 = new MataKuliahFactory();
        MataKuliah instance57 = instance56.createMataKuliah(kode28.getKode(), 2, kode28.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance57, "A"));
        
        MKU130012 kode29 = new MKU130012();
        MataKuliahFactory instance58 = new MataKuliahFactory();
        MataKuliah instance59 = instance58.createMataKuliah(kode29.getKode(), 2, kode29.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance59, "A"));
        
        MKU130003 kode30 = new MKU130003();
        MataKuliahFactory instance60 = new MataKuliahFactory();
        MataKuliah instance61 = instance60.createMataKuliah(kode30.getKode(), 2, kode30.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance61, "A"));
        
        AIF183337 kode31 = new AIF183337();
        MataKuliahFactory instance62 = new MataKuliahFactory();
        MataKuliah instance63 = instance62.createMataKuliah(kode31.getKode(), 3, kode31.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance63, "A"));
        
        AIF181100 kode32 = new AIF181100();
        MataKuliahFactory instance64 = new MataKuliahFactory();
        MataKuliah instance65 = instance64.createMataKuliah(kode32.getKode(), 4, kode32.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance65, "A"));
        
        AIF181106 kode33 = new AIF181106();
        MataKuliahFactory instance66 = new MataKuliahFactory();
        MataKuliah instance67 = instance66.createMataKuliah(kode33.getKode(), 3, kode33.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance67, "A"));
        
        AIF182007 kode34 = new AIF182007();
        MataKuliahFactory instance68 = new MataKuliahFactory();
        MataKuliah instance69 = instance68.createMataKuliah(kode34.getKode(), 4, kode34.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance69, "A"));
        
        AIF182204 kode35 = new AIF182204();
        MataKuliahFactory instance70 = new MataKuliahFactory();
        MataKuliah instance71 = instance70.createMataKuliah(kode35.getKode(), 3, kode35.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance71, "A"));
        
        AIF184344 kode36 = new AIF184344();
        MataKuliahFactory instance72 = new MataKuliahFactory();
        MataKuliah instance73 = instance72.createMataKuliah(kode36.getKode(), 3, kode36.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance73, "A"));
        
        AIF183209 kode37 = new AIF183209();
        MataKuliahFactory instance74 = new MataKuliahFactory();
        MataKuliah instance75 = instance74.createMataKuliah(kode37.getKode(), 3, kode37.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance75, "A"));
        
        AIF183300 kode38 = new AIF183300();
        MataKuliahFactory instance76 = new MataKuliahFactory();
        MataKuliah instance77 = instance76.createMataKuliah(kode38.getKode(), 3, kode38.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance77, "A"));
        
        AIF183122 kode39 = new AIF183122();
        MataKuliahFactory instance78 = new MataKuliahFactory();
        MataKuliah instance79 = instance78.createMataKuliah(kode39.getKode(), 3, kode39.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance79, "A"));
        
        AIF183119 kode40 = new AIF183119();
        MataKuliahFactory instance80 = new MataKuliahFactory();
        MataKuliah instance81 = instance80.createMataKuliah(kode40.getKode(), 3, kode40.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance81, "A"));
        
        AIF183114 kode41 = new AIF183114();
        MataKuliahFactory instance82 = new MataKuliahFactory();
        MataKuliah instance83 = instance82.createMataKuliah(kode41.getKode(), 3, kode41.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance83, "A"));
        
        AIF183112 kode42 = new AIF183112();
        MataKuliahFactory instance84 = new MataKuliahFactory();
        MataKuliah instance85 = instance84.createMataKuliah(kode42.getKode(), 2, kode42.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance85, "A"));
        
        AIF184230 kode43 = new AIF184230();
        MataKuliahFactory instance86 = new MataKuliahFactory();
        MataKuliah instance87 = instance86.createMataKuliah(kode43.getKode(), 3, kode43.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance87, "A"));
        
        AIF184334 kode44 = new AIF184334();
        MataKuliahFactory instance88 = new MataKuliahFactory();
        MataKuliah instance89 = instance88.createMataKuliah(kode44.getKode(), 3, kode44.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance89, "A"));
        
        AIF184338 kode45 = new AIF184338();
        MataKuliahFactory instance90 = new MataKuliahFactory();
        MataKuliah instance91 = instance90.createMataKuliah(kode45.getKode(), 3, kode45.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance91, "A"));
        
        AIF184339 kode46 = new AIF184339();
        MataKuliahFactory instance92 = new MataKuliahFactory();
        MataKuliah instance93 = instance92.createMataKuliah(kode46.getKode(), 3, kode46.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance93, "A"));
        
        AIF184110 kode47 = new AIF184110();
        MataKuliahFactory instance94 = new MataKuliahFactory();
        MataKuliah instance95 = instance94.createMataKuliah(kode47.getKode(), 3, kode47.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance95, "A"));
        
        AIF183346 kode48 = new AIF183346();
        MataKuliahFactory instance96 = new MataKuliahFactory();
        MataKuliah instance97 = instance96.createMataKuliah(kode48.getKode(), 3, kode48.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance97, "A"));
        
        AIF183342 kode49 = new AIF183342();
        MataKuliahFactory instance98 = new MataKuliahFactory();
        MataKuliah instance99 = instance98.createMataKuliah(kode49.getKode(), 3, kode49.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance99, "A"));
        
        AIF183339 kode50 = new AIF183339();
        MataKuliahFactory instance100 = new MataKuliahFactory();
        MataKuliah instance101 = instance100.createMataKuliah(kode50.getKode(), 3, kode50.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance101, "A"));
        
        int tempSKSLulus = mahasiswa.calculateSKSLulus();
        
        SortedMap<LocalDate, Integer> scoreTOEFL = new TreeMap<>();
        scoreTOEFL.put(LocalDate.of(2016, Month.JANUARY, 21), 620);
        mahasiswa.setNilaiTOEFL(scoreTOEFL);
        mahasiswa.getNilaiTOEFL();
        
        List<String> reasonsContainer = new ArrayList<>();
        reasonsContainer.add(tempSKSLulus+"" + mahasiswa.getNilaiTOEFL()+"");
        
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
}
