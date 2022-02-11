package com;

public class QuotientRemainder {

	public static void main(String[] args) {
		int dividend = 100;
		int divisor = 2;
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		
		System.out.println("The quotient is "+quotient);
		System.out.println("The remainder is"+remainder);
	}
}
