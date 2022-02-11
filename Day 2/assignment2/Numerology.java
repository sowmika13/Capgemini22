package assignment2;

import java.util.Scanner;

public class Numerology {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int add=calc(num);
		if(add<10)
			System.out.println("Numerologynum is: "+add);
		else 
			System.out.println("Numerologynum is: "+(add));
		even_odd(num);
	}
	
	    public static int calc(int num) {
	    	int add=0,temp=num;
	    	while(temp>0) {
	    		int k=temp%10;
	    		add+=k;
	    		temp=temp/10;
	    	}
	    	return add;
	    }
	    public static void even_odd(int num) {
	    	int even=0,odd=0;
	    	while(num>0) {
	    		int k=num%10;
	    		if(k%2==0)
	    			even++;
	    		else 
	    			odd++;
	    		num=num/10;
	    	}
	    	System.out.println("\nNumber of odd numbers: "+odd+"\nNumber of even numbers: "+even);
	    }
	    public static int Numerologynumber(int num) {
	    	int add=0,temp=num;
	    	while(temp>0) {
	    		int k=temp%10;
	    		add+=k;
	    		temp=temp/10;
	    	}
	    	if(add>=10)
	    		return Numerologynumber(add);
	    	else 
	    		return add;
	    }
}
