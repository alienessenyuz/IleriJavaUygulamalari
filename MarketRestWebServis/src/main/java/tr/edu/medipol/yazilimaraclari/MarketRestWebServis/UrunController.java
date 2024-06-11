package tr.edu.medipol.yazilimaraclari.MarketRestWebServis; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.web.bind.annotation.*; 

 

import java.util.List; 

 

@RestController 

@RequestMapping("/urunler") 

public class UrunController { 

 

    private final UrunService urunService; 

 

    @Autowired 

    public UrunController(UrunService urunService) { 

        this.urunService = urunService; 

    } 

 

    @PostMapping("/ekle") 

    public String urunEkle(@RequestBody String urunAdi) { 

        urunService.urunEkle(urunAdi); 

        return "Ürün eklendi: " + urunAdi.getUrunAdi(); 

    } 

 

    @GetMapping("/listele") 

    public List<Urun> urunleriListele() { 

        return urunService.urunleriListele(); 

    } 

 

    @DeleteMapping("/sil/{urunAdi}") 

    public String urunSil(@PathVariable String urunAdi) { 

        return urunService.urunSil(urunAdi); 

    } 

} 

 