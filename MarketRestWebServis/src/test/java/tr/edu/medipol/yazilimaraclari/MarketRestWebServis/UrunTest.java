package tr.edu.medipol.yazilimaraclari.MarketRestWebServis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrunTest {

    @Test
    public void testUrunAdiGetSet() {
        // Arrange
        String expectedUrunAdi = "Bilgisayar";
        Urun urun = new Urun();

        // Act
        urun.setUrunAdi(expectedUrunAdi);
        String actualUrunAdi = urun.getUrunAdi();

        // Assert
        assertEquals(expectedUrunAdi, actualUrunAdi);
    }

    @Test
    public void testUrunVarsayilanConstructor() {
        // Arrange
        Urun urun = new Urun();

        // Act
        String actualUrunAdi = urun.getUrunAdi();

        // Assert
        assertEquals(null, actualUrunAdi);
    }

    @Test
    public void testUrunParametreliConstructor() {
        // Arranged
        String expectedUrunAdi = "Televizyon";

        // Act
        Urun urun = new Urun(expectedUrunAdi);
        String actualUrunAdi = urun.getUrunAdi();

        // Assert
        assertEquals(expectedUrunAdi, actualUrunAdi);
    }
}
