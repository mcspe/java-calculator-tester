package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator calc;

	@BeforeEach
	void init() {
		try {			
			calc = new Calculator();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Test sum positive number")
	void sumPositiveNum() {
		float sum = calc.add(2.3f, 3.2f);
		assertEquals(5.5f, sum, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test sum negative number")
	void sumNegativeNum() {
		float sum = calc.add(-2.3f, -3.2f);
		assertEquals(-5.5f, sum, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test sum natural number")
	void sumNaturalNum() {
		float sum = calc.add(2.3f, -3.2f);
		assertEquals(-0.9f, sum, 0.000001f);
	}

	@Test
	@DisplayName("Test subtract positive number")
	void subtractPositiveNum() {
		float subtraction = calc.subtract(2.3f, 3.2f);
		assertEquals(-0.9, subtraction, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test subtract negative number")
	void subtractNegativeNum() {
		float subtraction = calc.subtract(-2.3f, -3.2f);
		assertEquals(0.9, subtraction, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test subtract natural number")
	void subtractNaturalNum() {
		float subtraction = calc.subtract(2.3f, -3.2f);
		assertEquals(5.5f, subtraction, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test divide positive number")
	void dividePositiveNum() {
		try {
			float division = calc.divide(2.3f, 3.2f);
			assertEquals(0.71875, division, 0.0000001f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test divide negative number")
	void divideNegativeNum() {
		try {
			float division = calc.divide(-2.3f, -3.2f);
			assertEquals(0.71875, division, 0.0000001f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test divide natural number")
	void divideNaturalNum() {
		try {
			float division = calc.divide(2.3f, -3.2f);
			assertEquals(-0.71875, division, 0.0000001f);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@DisplayName("Test divide for 0 exception")
	void divideForZero() {
		assertThrows(Exception.class, () -> {
				float division = calc.divide(2.3f, 0.0f);
			}, "Operation must throw an exception");
	}
	
	@Test
	@DisplayName("Test divide 0")
	void divideZero() {
		assertDoesNotThrow(() -> {
			float division = calc.divide(0.0f, 2.3f);
		}, "Operation must throw an exception");
	}
	
	@Test
	@DisplayName("Test multiply positive number")
	void multiplyPositiveNum() {
		float moltiplication = calc.multiply(2.3f, 3.2f);
		assertEquals(7.36f, moltiplication, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test multiply negative number")
	void multiplyNegativeNum() {
		float moltiplication = calc.multiply(-2.3f, -3.2f);
		assertEquals(7.36f, moltiplication, 0.0000001f);
	}
	
	@Test
	@DisplayName("Test multiply natural number")
	void multiplyNaturalNum() {
		float moltiplication = calc.multiply(2.3f, -3.2f);
		assertEquals(-7.36f, moltiplication, 0.0000001f);
	}
	
}
