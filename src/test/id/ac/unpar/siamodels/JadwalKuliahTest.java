package id.ac.unpar.siamodels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.DayOfWeek;
import java.time.LocalTime;
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
public class JadwalKuliahTest {
    
    /**
     * Test untuk menguji data suatu mata kuliah yang ada di daftar mata kuliah
     */
    @Test
    public void testGetMataKuliah() {
        AIF131101 kode = new AIF131101();
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode());
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        MataKuliah expResult = matkul;
        MataKuliah result = instance.getMataKuliah();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk menguji mata kuliah baru yang dibuat atau diubah
     */
    @Test
    public void testSetMataKuliah() {
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        AIF131101 kode = new AIF131101();
        MataKuliah mataKuliah = instance2.createMataKuliah(kode.getKode());
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
    }

    /**
     * Test untuk menguji data kelas yang 
     */
    @Test
    public void testGetKelas() {
        AIF131101 kode = new AIF131101();
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        Character expResult = 'A';
        Character result = instance.getKelas();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk menguji kelas yang baru dibuat atau diubah
     */
    @Test
    public void testSetKelas() {
        Character kelas = 'A';
        JadwalKuliah instance = new JadwalKuliah();
        instance.setKelas(kelas);
    }

    /**
     * Test untuk menguji jadwal hari pada suatu mata kuliah
     */
    @Test
    public void testGetHari() {
        AIF131101 kode = new AIF131101();
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "senin", "08:00-11:00", "9122");
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = instance.getHari();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk megatur hari pada sebuah mata kuliah
     */
    @Test
    public void testSetHari() {
        DayOfWeek hari = DayOfWeek.MONDAY;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setHari(hari);
    }

    /**
     * Test untuk menguji waktu mulai pada sebuah mata kuliah
     */
    @Test
    public void testGetWaktuMulai() {
        AIF131101 kode = new AIF131101();
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        LocalTime expResult = LocalTime.of(8, 0);
        LocalTime result = instance.getWaktuMulai();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk mengatur dan mengubah waktu mulai sebuah mata kuliah
     */
    @Test
    public void testSetWaktuMulai() {
        LocalTime waktuMulai = LocalTime.of(8, 0);
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuMulai(waktuMulai);
    }

    /**
     * Test untuk menguji waktu selesai pada sebuah mata kuliah
     */
    @Test
    public void testGetWaktuSelesai() {
        AIF131101 kode = new AIF131101();
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        LocalTime expResult = LocalTime.of(11, 0);
        LocalTime result = instance.getWaktuSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk mengatur dan mengubah waktu mulai sebuah mata kuliah
     */
    @Test
    public void testSetWaktuSelesai() {
        LocalTime waktuSelesai = LocalTime.of(11, 0);
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuSelesai(waktuSelesai);
    }

    /**
     * Test untuk menguji lokasi ruangan pada sebuah mata kuliah
     */
    @Test
    public void testGetLokasi() {
        AIF131101 kode = new AIF131101();
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        String expResult = "9122";
        String result = instance.getLokasi();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk mengatur dan mengubah lokasi ruangan sebuah mata kuliah
     */
    @Test
    public void testSetLokasi() {
        String lokasi = "9122";
        JadwalKuliah instance = new JadwalKuliah();
        instance.setLokasi(lokasi);
    }

    /**
     * Test untuk menguji data pengajar pada sebuah mata kuliah
     */
    @Test
    public void testGetPengajar() {
        AIF131101 kode = new AIF131101();
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        Dosen expResult = pengajar;
        Dosen result = instance.getPengajar();
        assertEquals(expResult, result);
    }

    /**
     * Test untuk mengatur dan mengubah data pengajar sebuah mata kuliah 
     */
    @Test
    public void testSetPengajar() {
        Dosen pengajar = new Dosen("141401", "Keenan");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setPengajar(pengajar);
    }

    /**
     * Test untuk menguji waktu jam pelajaran sebuah mata kuliah
     */
    @Test
    public void testGetWaktuString() {
        AIF131101 kode = new AIF131101();
        String waktu = "08:00-11:00";
        Dosen pengajar = new Dosen("10560", "Keenan");
        MataKuliahFactory instance2 = MataKuliahFactory.getInstance();
        MataKuliah matkul = instance2.createMataKuliah(kode.getKode(), 6, "Pemrograman Berorientasi Objek");
        JadwalKuliah instance = new JadwalKuliah(matkul, 'A', pengajar, "Senin", waktu, "9122");
        String expResult = "08:00-11:00";
        String result = instance.getWaktuString();
        assertEquals(expResult, result);
    }

    /**
     * Test utuk menguji dan mencocokkan sebuah hari dalam indonesia
     */
    @Test
    public void testIndonesianToDayOfWeek() {
        String indonesian = "senin";
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
}
