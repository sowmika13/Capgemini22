package demo.loopdemo;

public class Sumofdigits {
	public static void main(String args[])  
	{  
	int number =1234 , digit, sum = 0;   
	while(number > 0)  
	{    
	digit = number % 10;   
	sum = sum + digit;   
	number = number / 10;  
	}  
	System.out.println("Sum of Digits: "+sum);  
	}  

}
