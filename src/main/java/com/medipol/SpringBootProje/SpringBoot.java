package com.medipol.SpringBootProje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bu sinif SpringBoot program çalıstırma komutunu olusturur.
 * 
 * @author MertcanArici
 * 
 */
@SpringBootApplication
public class SpringBoot {

	/**
	 * Disarıdan erisilebilir, bir deger dondurmeyen, stringlerden olusan args
	 * adinda main objecti yaratilir. SpringApplication.run ile SpringBoot sinifinin
	 * olusturdugu tum args degiskenleri calistirilir.
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot.class, args);
	}
}
