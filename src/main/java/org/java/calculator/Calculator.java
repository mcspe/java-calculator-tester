package org.java.calculator;

public class Calculator {

	public float add(float n1, float n2) {
		return n1 + n2;
	}
	
	public float subtract(float n1, float n2) {
		return n1 - n2;
	}
	
	public float divide(float n1, float n2) throws Exception {
		if (n2 != 0) return n1 / n2;
		else throw new Exception("Operation not admitted, please insert a divisor different from 0");
	}
	
	public float multiply(float n1, float n2) {
		return n1 * n2;
	}
	
}
