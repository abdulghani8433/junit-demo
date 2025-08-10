package com.junit.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calcUnderTest = new Calculator();

	@Test
	void testAddition() {
		int addition = calcUnderTest.addition(2, 4);
		assertEquals(6, addition, "expecting result is 5 but we got " + addition);
	}

	@Test
	void testIsEven() {

		assertTrue(calcUnderTest.isEven(2));
	}

	@Test
	void testIsDivided() {
		assertEquals(3, calcUnderTest.isDivided(6, 2));
	}

	@Test
	void testIsDividedByZeros() {
		ArithmeticException e = assertThrows(ArithmeticException.class, () -> calcUnderTest.isDivided(3, 0));
		assertEquals("Division by zero is not allowed", e.getMessage());
	}

}
