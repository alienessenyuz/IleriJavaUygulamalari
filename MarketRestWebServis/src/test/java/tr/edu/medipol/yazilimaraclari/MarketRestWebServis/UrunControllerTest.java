package tr.edu.medipol.yazilimaraclari.MarketRestWebServis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrunControllerTest {

    private String urunAdi;

	@Test
    public void testUrunEkle() {
        UrunController urunController = new UrunController(null);
        setUrunAdi("Test Urun");
        var urunAdi2 = getUrunAdi();
		String result = urunController.urunEkle(urunAdi2);
        assertEquals("Ürün eklendi: " + urunAdi2, result);
        assertTrue(urunController.urunleriListele().contains(urunAdi2));
    }

    @Test
    public void testUrunleriListele() {
        UrunController urunController = new UrunController(null);
        System.out.println("Başlangıç: " + urunController.urunleriListele());  // Debug amaçlı
        assertEquals(1, urunController.urunleriListele().size()); // Zaten bir ürün eklenmiş
        
        urunController.urunEkle("Urun1");
        System.out.println("Urun1 eklendikten sonra: " + urunController.urunleriListele());  // Debug amaçlı
        assertEquals(2, urunController.urunleriListele().size());

        urunController.urunEkle("Urun2");
        System.out.println("Urun2 ekledikten sonra: " + urunController.urunleriListele());  // Debug amaçlı
        assertEquals(3, urunController.urunleriListele().size());
    }



    @Test
    public void testUrunSil() {
        UrunController urunController = new UrunController(null);
        String urunAdi = "Test Urun";
        urunController.urunEkle(urunAdi);

        String result = urunController.urunSil(urunAdi);
        assertEquals("Ürün silindi: " + urunAdi, result);
        assertFalse(urunController.urunleriListele().contains(urunAdi));
    }

    @Test
    public void testUrunSil_UrunBulunamadi() {
        UrunController urunController = new UrunController(null);
        String urunAdi = "Bulunmayan Urun";
        
        String result = urunController.urunSil(urunAdi);
        assertEquals("Ürün bulunamadı: " + urunAdi, result);
    }

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
}
