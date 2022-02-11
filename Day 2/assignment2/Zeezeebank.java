package assignment2;

import java.util.Scanner;

public class Zeezeebank {
	public static void main(String args[]) {
		String accountnumber="9876543210";
		int initialbalance=1500;
		int depositedamount,with_amount;
		
		System.out.println("Enter the deposited amount");
		Scanner s=new Scanner(System.in);
		depositedamount=s.nextInt();
		
		System.out.println("Enter the withdraw amount");
		with_amount=s.nextInt();
		
		int availablebalance;
		availablebalance=initialbalance+depositedamount;
		
		if(with_amount>availablebalance) {
			System.out.println("Insufficient balance");
		}
		else {
			availablebalance=with_amount;
		}
		
		System.out.println("The available balance is: "+availablebalance);
		
				
	}

}
