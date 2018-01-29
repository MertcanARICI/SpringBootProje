package com.medipol.SpringBootProje;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot hata payini en aza indirmek icin olusturulan SpringRunner test
 * sinifidir.
 * 
 * @author MertcanArıcı
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTests {

	/**
	 * contextLoads adinda bir test metodu olusturulur.
	 *
	 */
	@Test
	public void contextLoads() {
	}

}
