/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.id.ac.unpar.siamodels;

import java.util.List;
import main.java.id.ac.unpar.siamodels.Mahasiswa;
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
        Mahasiswa mahasiswa = null;
        List<String> reasonsContainer = null;
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
}
