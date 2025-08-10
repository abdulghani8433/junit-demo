package com.junit.demo.controller;

public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public Boolean isEven(int a) {
		return (a % 2) == 0 ? true : false;
	}

	public float isDivided(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		return (float) a / b;
	}

}
