package id.ac.unpar.siamodels;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InfoMataKuliah {

    /**
     * Jumlah bobot sks dari mata kuliah ini
     *
     * @return jumlah bobot sks
     */
    public int sks();

    /**
     * Nama mata kuliah ini
     *
     * @return nama mata kuliah
     */
    public String nama();
}
