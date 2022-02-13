package Day11;

import java.util.Scanner;

interface Finder {
	public double calculate(double num1,double num2);
}
public class FunctionalInterface {
	static double operator(double a,double b,Finder operation) {
		return operation.calculate(a,b);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		Finder sum=(double num1,double num2)->num1 + num2;
		Finder subtract=(double num1,double num2)->num1 - num2;
		Finder multiply=(double num1,double num2)->num1 * num2;
		Finder divide=(double num1,double num2)->num1 / num2;
		Finder reminder=(double num1,double num2)->num1 % num2;
		Finder max=(double num1,double num2)->num1 > num2 ? num1:num2;
		Finder min=(double num1,double num2)->num1 < num2 ? num1:num2;
		Finder sumsquare=(double num1,double num2)->num1*num1 + num2*num2;
		
		System.out.println("Sum of two numbers is "+operator(p,q,sum));
		System.out.println("Subtraction of two numbers is: "+operator(p,q, subtract));
		System.out.println("Multiplication of two numbers is: "+operator(p,q, multiply));
		System.out.println("Division of two numbers is: "+operator(p,q, divide));
		System.out.println("Reminder of two numbers is: "+operator(p,q, reminder));
		System.out.println("Maximum number of two numbers is: "+operator(p,q, max));
		System.out.println("Minimum number of two numbers is: "+operator(p,q, min));
		System.out.println("Square sum value of two numbers is: "+operator(p,q, sumsquare));
		}

}
