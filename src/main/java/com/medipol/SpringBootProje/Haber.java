package com.medipol.SpringBootProje;

/**
 * Bu sinif haber servisinin özelliklerini olusturur.
 * 
 * @author MertcanArici
 *
 */
public class Haber {

	/**
	 * @param COUNT
	 *            adinda bir integer, deger olarak sifir atanir
	 * @param id
	 *            adinda bir integer
	 * @param haberbaslik
	 *            adinda bir string
	 * @param habericerik
	 *            adinda bir string
	 *
	 */
	private static int COUNT = 0;
	public int id;
	public String haberbaslik;
	public String habericerik;

	/**
	 * Haber adinda bir metod olusturulup, alacagi parametreler tanimlanir.
	 * 
	 * @param haberbaslik
	 *            adinda bir string
	 * @param habericerik
	 *            adinda bir string
	 *
	 */
	public Haber(String haberbaslik, String habericerik) {
		this.id = ++COUNT;
		this.haberbaslik = haberbaslik;
		this.habericerik = habericerik;
	}

	/**
	 * haberbaslik degiskenini alabilmek için gethaberbaslik adinda bir metod
	 * olusturulur.
	 * 
	 * @return haberbaslik adli alinan degiskeni döndürür
	 *
	 */
	public String gethaberbaslik() {
		return haberbaslik;
	}

	/**
	 * habericerik degiskenini alabilmek için gethabericerik adinda bir metod
	 * olusturulur.
	 * 
	 * @return habericerik adli alinan degiskeni dondurur
	 *
	 */
	public String gethabericerik() {
		return habericerik;
	}
}
