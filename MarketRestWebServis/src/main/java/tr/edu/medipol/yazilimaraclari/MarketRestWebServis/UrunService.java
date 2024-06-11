package tr.edu.medipol.yazilimaraclari.MarketRestWebServis; 

 

import org.springframework.stereotype.Service; 

 

import java.util.ArrayList;
import java.util.List; 

 

@Service 

public class UrunService { 

 

    private static List<Urun> urunListesi = new ArrayList<>(); 

 

    public void urunEkle(Urun urunAdi) { 

        urunListesi.add(urunAdi); 

    } 

 

    public List<Urun> urunleriListele() { 

        return urunListesi; 

    } 

 

    public String urunSil(String urunAdi) { 

        for (Urun urun : urunListesi) { 

            if (urun.getUrunAdi().equals(urunAdi)) { 

                urunListesi.remove(urun); 

                return "Ürün silindi: " + urunAdi; 

            } 

        } 

        return "Ürün bulunamadı: " + urunAdi; 

    } 

} 

 