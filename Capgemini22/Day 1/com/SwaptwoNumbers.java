package com;

public class SwaptwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapping of two numbers a and b is" +a);
		System.out.println("Swapping of two numbers a and b is" +b);
		
	}

}
