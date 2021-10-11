package com.manageo.test.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NumberMulitpleTest {

	/**
	 * Some numbers multiple of 3 and 5: 0, 15, 30 , 45 , 60 , 75 , 90
	 */
	@Test
	public void testMultipleWithModulo() {
		Integer index = 15;
		assertThat(index % 3 == 0 && index % 5 == 0).isEqualTo(true);
		
		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("A number multiple of 3 and 5: " + i);
			}
		}
	}

}
