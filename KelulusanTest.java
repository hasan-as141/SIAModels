/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import main.java.id.ac.unpar.siamodels.Mahasiswa;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF101;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF102;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF103;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF104;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF105;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF106;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF201;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF202;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF203;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF204;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF205;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF206;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF208;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF210;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF301;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF302;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF303;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF305;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF306;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF311;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF312;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF313;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF314;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF315;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF334;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF341;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF342;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF344;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF347;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF401;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF402;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF403;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF441;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF442;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF450;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF456;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF457;
import main.java.id.ac.unpar.siamodels.matakuliah.AIF462;
import main.java.id.ac.unpar.siamodels.matakuliah.AMS100;
import main.java.id.ac.unpar.siamodels.matakuliah.AMS200;
import main.java.id.ac.unpar.siamodels.matakuliah.APS402;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU001;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU002;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU003;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU004;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU008;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU009;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU010;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU011;
import main.java.id.ac.unpar.siamodels.matakuliah.MKU012;
import main.java.id.ac.unpar.siamodels.prodi.teknikinformatika.Kelulusan;
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
     * Test of checkPrasyarat method, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat() {
        Mahasiswa mahasiswa = new Mahasiswa("2014730019");
        
        AIF101 kode =  new AIF101();
        MataKuliahFactory instance2 = new MataKuliahFactory();
        MataKuliah instance3 = instance2.createMataKuliah(kode.getKode(), 6, kode.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance3, 'A', 85.60, 82.00, 83.25, 'A'));
        
        AIF102 kode2 = new AIF102();
        MataKuliahFactory instance4 = new MataKuliahFactory();
        MataKuliah instance5 = instance4.createMataKuliah(kode2.getKode(), 4, kode2.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance5, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF103 kode3 = new AIF103();
        MataKuliahFactory instance6 = new MataKuliahFactory();
        MataKuliah instance7 = instance6.createMataKuliah(kode3.getKode(), 3, kode3.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance7, 'A', 80.35, 87.80, 81.65, 'A'));
        
        AIF104 kode4 = new AIF104();
        MataKuliahFactory instance8 = new MataKuliahFactory();
        MataKuliah instance9 = instance8.createMataKuliah(kode4.getKode(), 3, kode4.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance9, 'A', 85.00, 91.00, 93.00, 'A'));
        
        AIF105 kode5 = new AIF105();
        MataKuliahFactory instance10 = new MataKuliahFactory();
        MataKuliah instance11 = instance10.createMataKuliah(kode5.getKode(), 3, kode5.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance11, 'A', 78.00, 72.00, 77.00, 'B'));
        
        AIF106 kode6 = new AIF106();
        MataKuliahFactory instance12 = new MataKuliahFactory();
        MataKuliah instance13 = instance12.createMataKuliah(kode6.getKode(), 3, kode6.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance13, 'A', 72.00, 78.90, 63.80, 'B'));
        
        AIF206 kode7 = new AIF206();
        MataKuliahFactory instance14 = new MataKuliahFactory();
        MataKuliah instance15 = instance14.createMataKuliah(kode7.getKode(), 4, kode7.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance15, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF202 kode8 = new AIF202();
        MataKuliahFactory instance16 = new MataKuliahFactory();
        MataKuliah instance17 = instance16.createMataKuliah(kode8.getKode(), 4, kode8.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance17, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF203 kode9 = new AIF203();
        MataKuliahFactory instance18 = new MataKuliahFactory();
        MataKuliah instance19 = instance18.createMataKuliah(kode9.getKode(), 4, kode9.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance19, 'A', 82.00, 85.00, 65.00, 'B'));
        
        AIF204 kode10 = new AIF204();
        MataKuliahFactory instance20 = new MataKuliahFactory();
        MataKuliah instance21 = instance20.createMataKuliah(kode10.getKode(), 4, kode10.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance21, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF205 kode11 = new AIF205();
        MataKuliahFactory instance22 = new MataKuliahFactory();
        MataKuliah instance23 = instance22.createMataKuliah(kode11.getKode(), 3, kode11.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance23, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF208 kode12 = new AIF208();
        MataKuliahFactory instance24 = new MataKuliahFactory();
        MataKuliah instance25 = instance24.createMataKuliah(kode12.getKode(), 4, kode12.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance25, 'A', 74.00, 65.00, 75.00, 'B'));
        
        AIF210 kode13 = new AIF210();
        MataKuliahFactory instance26 = new MataKuliahFactory();
        MataKuliah instance27 = instance26.createMataKuliah(kode13.getKode(), 2, kode13.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance27, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF301 kode14 = new AIF301();
        MataKuliahFactory instance28 = new MataKuliahFactory();
        MataKuliah instance29 = instance28.createMataKuliah(kode14.getKode(), 3, kode14.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance29, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF302 kode15 = new AIF302();
        MataKuliahFactory instance30 = new MataKuliahFactory();
        MataKuliah instance31 = instance30.createMataKuliah(kode15.getKode(), 2, kode15.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance31, 'A', 75.00, 75.00, 70.00, 'B'));
        
        AIF303 kode16 = new AIF303();
        MataKuliahFactory instance32 = new MataKuliahFactory();
        MataKuliah instance33 = instance32.createMataKuliah(kode16.getKode(), 3, kode16.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance33, 'A', 72.00, 74.00, 71.00, 'B'));
        
        AIF305 kode17 = new AIF305();
        MataKuliahFactory instance34 = new MataKuliahFactory();
        MataKuliah instance35 = instance34.createMataKuliah(kode17.getKode(), 4, kode17.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance35, 'A', 60.85, 78.90, 63.80, 'C'));
        
        AIF401 kode18 = new AIF401();
        MataKuliahFactory instance36 = new MataKuliahFactory();
        MataKuliah instance37 = instance36.createMataKuliah(kode18.getKode(), 4, kode18.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance37, 'A', 74.00, 78.90, 68.00, 'B'));
        
        AIF402 kode19 = new AIF402();
        MataKuliahFactory instance38 = new MataKuliahFactory();
        MataKuliah instance39 = instance38.createMataKuliah(kode19.getKode(), 6, kode19.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance39, 'A', 71.00, 75.00, 76.30, 'B'));
        
        AIF403 kode20 = new AIF403();
        MataKuliahFactory instance40 = new MataKuliahFactory();
        MataKuliah instance41 = instance40.createMataKuliah(kode20.getKode(), 2, kode20.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance41, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AMS100 kode21 = new AMS100();
        MataKuliahFactory instance42 = new MataKuliahFactory();
        MataKuliah instance43 = instance42.createMataKuliah(kode21.getKode(), 4, kode21.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance43, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AMS200 kode22 = new AMS200();
        MataKuliahFactory instance44 = new MataKuliahFactory();
        MataKuliah instance45 = instance44.createMataKuliah(kode22.getKode(), 3, kode22.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance45, 'A', 87.00, 85.00, 82.00, 'A'));
        
        APS402 kode23 = new APS402();
        MataKuliahFactory instance46 = new MataKuliahFactory();
        MataKuliah instance47 = instance46.createMataKuliah(kode23.getKode(), 2, kode23.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance47, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU001 kode24 = new MKU001();
        MataKuliahFactory instance48 = new MataKuliahFactory();
        MataKuliah instance49 = instance48.createMataKuliah(kode24.getKode(), 2, kode24.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance49, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU002 kode25 = new MKU002();
        MataKuliahFactory instance50 = new MataKuliahFactory();
        MataKuliah instance51 = instance50.createMataKuliah(kode25.getKode(), 2, kode25.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance51, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU003 kode26 = new MKU003();
        MataKuliahFactory instance52 = new MataKuliahFactory();
        MataKuliah instance53 = instance52.createMataKuliah(kode26.getKode(), 2, kode26.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GANJIL), instance53, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU008 kode27 = new MKU008();
        MataKuliahFactory instance54 = new MataKuliahFactory();
        MataKuliah instance55 = instance54.createMataKuliah(kode27.getKode(), 2, kode27.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance55, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU009 kode28 = new MKU009();
        MataKuliahFactory instance56 = new MataKuliahFactory();
        MataKuliah instance57 = instance56.createMataKuliah(kode28.getKode(), 2, kode28.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance57, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU010 kode29 = new MKU010();
        MataKuliahFactory instance58 = new MataKuliahFactory();
        MataKuliah instance59 = instance58.createMataKuliah(kode29.getKode(), 2, kode29.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2014, Semester.GENAP), instance59, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU011 kode30 = new MKU011();
        MataKuliahFactory instance60 = new MataKuliahFactory();
        MataKuliah instance61 = instance60.createMataKuliah(kode30.getKode(), 2, kode30.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance61, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU012 kode31 = new MKU012();
        MataKuliahFactory instance62 = new MataKuliahFactory();
        MataKuliah instance63 = instance62.createMataKuliah(kode31.getKode(), 2, kode31.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance63, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF311 kode32 = new AIF311();
        MataKuliahFactory instance64 = new MataKuliahFactory();
        MataKuliah instance65 = instance64.createMataKuliah(kode32.getKode(), 2, kode32.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance65, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF312 kode33 = new AIF312();
        MataKuliahFactory instance66 = new MataKuliahFactory();
        MataKuliah instance67 = instance66.createMataKuliah(kode33.getKode(), 2, kode33.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GENAP), instance67, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF313 kode34 = new AIF313();
        MataKuliahFactory instance68 = new MataKuliahFactory();
        MataKuliah instance69 = instance68.createMataKuliah(kode34.getKode(), 2, kode34.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance69, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF314 kode35 = new AIF314();
        MataKuliahFactory instance70 = new MataKuliahFactory();
        MataKuliah instance71 = instance70.createMataKuliah(kode35.getKode(), 2, kode35.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GANJIL), instance71, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF315 kode36 = new AIF315();
        MataKuliahFactory instance72 = new MataKuliahFactory();
        MataKuliah instance73 = instance72.createMataKuliah(kode36.getKode(), 2, kode36.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance73, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF306 kode37 = new AIF306();
        MataKuliahFactory instance74 = new MataKuliahFactory();
        MataKuliah instance75 = instance74.createMataKuliah(kode37.getKode(), 6, kode37.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance75, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF201 kode38 = new AIF201();
        MataKuliahFactory instance76 = new MataKuliahFactory();
        MataKuliah instance77 = instance76.createMataKuliah(kode38.getKode(), 4, kode38.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2015, Semester.GANJIL), instance77, 'A', 87.00, 85.00, 82.00, 'A'));
        
        MKU004 kode39 = new MKU004();
        MataKuliahFactory instance78 = new MataKuliahFactory();
        MataKuliah instance79 = instance78.createMataKuliah(kode39.getKode(), 2, kode39.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2016, Semester.GENAP), instance79, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF334 kode40 = new AIF334();
        MataKuliahFactory instance80 = new MataKuliahFactory();
        MataKuliah instance81 = instance80.createMataKuliah(kode40.getKode(), 3, kode40.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance81, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF341 kode41 = new AIF341();
        MataKuliahFactory instance82 = new MataKuliahFactory();
        MataKuliah instance83 = instance82.createMataKuliah(kode41.getKode(), 3, kode41.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance83, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF342 kode42 = new AIF342();
        MataKuliahFactory instance84 = new MataKuliahFactory();
        MataKuliah instance85 = instance84.createMataKuliah(kode42.getKode(), 3, kode42.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GANJIL), instance85, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF344 kode43 = new AIF344();
        MataKuliahFactory instance86 = new MataKuliahFactory();
        MataKuliah instance87 = instance86.createMataKuliah(kode43.getKode(), 3, kode43.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance87, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF347 kode44 = new AIF347();
        MataKuliahFactory instance88 = new MataKuliahFactory();
        MataKuliah instance89 = instance88.createMataKuliah(kode44.getKode(), 3, kode44.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance89, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF441 kode45 = new AIF441();
        MataKuliahFactory instance90 = new MataKuliahFactory();
        MataKuliah instance91 = instance90.createMataKuliah(kode45.getKode(), 3, kode45.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2017, Semester.GENAP), instance91, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF442 kode46 = new AIF442();
        MataKuliahFactory instance92 = new MataKuliahFactory();
        MataKuliah instance93 = instance92.createMataKuliah(kode46.getKode(), 3, kode46.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance93, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF450 kode47 = new AIF450();
        MataKuliahFactory instance94 = new MataKuliahFactory();
        MataKuliah instance95 = instance94.createMataKuliah(kode47.getKode(), 3, kode47.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GANJIL), instance95, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF457 kode48 = new AIF457();
        MataKuliahFactory instance96 = new MataKuliahFactory();
        MataKuliah instance97 = instance96.createMataKuliah(kode48.getKode(), 3, kode48.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance97, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF462 kode49 = new AIF462();
        MataKuliahFactory instance98 = new MataKuliahFactory();
        MataKuliah instance99 = instance98.createMataKuliah(kode49.getKode(), 3, kode49.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2018, Semester.GENAP), instance99, 'A', 87.00, 85.00, 82.00, 'A'));
        
        AIF456 kode50 = new AIF456();
        MataKuliahFactory instance100 = new MataKuliahFactory();
        MataKuliah instance101 = instance100.createMataKuliah(kode50.getKode(), 3, kode50.getNama());
        mahasiswa.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester(2019, Semester.GANJIL), instance101, 'A', 87.00, 85.00, 82.00, 'A'));
        
        int tempSKSLulus = mahasiswa.calculateSKSLulus();
        
        SortedMap<LocalDate, Integer> scoreTOEFL = new TreeMap<>();
        scoreTOEFL.put(LocalDate.of(2016, Month.JANUARY, 21), 620);
        mahasiswa.setNilaiTOEFL(scoreTOEFL);
        mahasiswa.getNilaiTOEFL();
        
        List<String> reasonsContainer = new ArrayList<>();
        reasonsContainer.add(tempSKSLulus+"" + mahasiswa.getNilaiTOEFL()+"");
        
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
}
