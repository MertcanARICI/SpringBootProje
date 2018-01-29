package com.medipol.SpringBootProje;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bu sinif RESTServis haberlerin islem sayfalarini ve islemleri yaratir.
 * 
 * @author MertcanArici
 *
 */
@RestController
public class RESTServisi {

	/**
	 * Disaridan erisilemeyen, HABERLER adinda bir ArrayList'den tureyen bir List
	 * nesnesi olusturup, icerisinde Haber degiskeni dondurulur.
	 * 
	 * @param Haber
	 * 
	 */
	private static final List<Haber> HABERLER = new ArrayList<Haber>();

	/**
	 * Haber ekle url "/haber/ekle" olarak ayarlanır haberOlustur adinda method
	 * olusturulup, alacagı parametreler tanimlanir.
	 * 
	 * @param haberbaslik
	 *            adinda bir string
	 * @param habericerik
	 *            adinda bir string Haber adinda yeni bir haber nesnesi olusturulup,
	 *            degiskenler atanir. HABERLER Listesine olusturulan haber eklenir.
	 * @return Haber nesnesi dondurulur.
	 * 
	 */
	@RequestMapping("/haber/ekle")
	public Haber haberEkle(String haberbaslik, String habericerik) {
		Haber Haber = new Haber(haberbaslik, habericerik);
		HABERLER.add(Haber);
		return Haber;
	}

	/**
	 * Haber listele url "/haber/listele" olarak ayarlanir List Haber nesnesini
	 * iceren haberListele adinda method olusturulur.
	 * 
	 * @return HABERLER Listesi dondurulur.
	 * 
	 */
	@RequestMapping("/haber/listele")
	public List<Haber> haberListele() {
		return HABERLER;
	}

	/**
	 * Haber sil url "/haber/sil" olarak ayarlanir haberSil adinda method
	 * olusturulup, alacagı parametreler tanimlanir.
	 * 
	 * @param index
	 *            adinda bir integer HABERLER Listesinden index silinir.
	 * @return "İlk Haber Silindi."
	 * 
	 */
	@RequestMapping("/haber/sil")
	public String haberSil(int index) {
		HABERLER.remove(index);
		return "İlk Haber Silindi.";
	}

	/**
	 * Haber temizle url "/haber/temizle" olarak ayarlanir haberTemizle adinda
	 * method olusturulur. HABERLER Listesinden index silinir.
	 * 
	 * @return "Haberler Silindi."
	 * 
	 */
	@RequestMapping("/haber/temizle")
	public String haberTemizle() {
		HABERLER.clear();
		return "Haberler Silindi.";
	}
}