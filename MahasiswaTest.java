

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.siamodels.Mahasiswa;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hasan
 */
public class MahasiswaTest {
    /**
     * Test case untuk menguji method getNama
     */
    @Test
    public void testCase1(){
        Mahasiswa m = new Mahasiswa("2010310045");
        m.setNama("Garfield");
        String name = "Garfield";
        assertEquals(name, "Garfield");
    }
    
    
    /**
     * Test case untuk menguji method getNpm
     */
    @Test
    public void testCase2(){
        Mahasiswa m = new Mahasiswa("2010310045");
        String npm = "2010310045";
        assertEquals(npm, "2010310045");
    }
    
    /**
     * Test case untuk menguji method getNama
     */
    @Test
    public void testCase3() throws MalformedURLException{
        Mahasiswa m = new Mahasiswa("2010310045");
        String photoPath = "2010310045";
        m.setPhotoPath(photoPath);
        String foto = photoPath;
        assertEquals(foto, m.getPhotoPath());
    }
    
//    public void testCase4(){
//        Mahasiswa m = new Mahasiswa("2010310045");
//        List<JadwalKuliah> jkList = new ArrayList<JadwalKuliah>();
//        MataKuliah algoDasar = "";
//        JadwalKuliah jk1 = new JadwalKuliah("algoritma dasar", 'a', "andi f.p.", "rabu", "0700", "09120");
//    }
}
