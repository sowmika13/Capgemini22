package Day11;

import java.util.Scanner;

interface CheckOperation {
	boolean check(int a);
}
class MyMath {
	public static boolean checker(CheckOperation p,int num) {
		return p.check(num);
	}
	public static CheckOperation isOdd() {
		return n->(n&1)==1;
	}
	public static CheckOperation isPrime() {
		return n-> {
			if(n<2 ) {
				return false;
			}
			int sqrt=(int)Math.sqrt(n);
			for(int i=2; i<=sqrt; i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		};
	}
	public static CheckOperation isPalindrome() {
		return n-> {
			String original=Integer.toString(n);
			String reversed=new StringBuilder(Integer.toString(n)).reverse().toString();
			return original.equals(reversed);
		};
	}
}
public class CheckOperations {
	public static void main(String[] args) {
		MyMath ob=new MyMath();
		Scanner sc=new Scanner(System.in);
		
		CheckOperation op;
		boolean ret=false;
		String ans=null;
		
		System.out.println("Enter your Choice");
		System.out.println("1.ODD/EVEN");
		System.out.println("2.IS PRIME?");
		System.out.println("3.IS PALINDROME?");
		int ch=sc.nextInt();
		System.out.println("Enter the number you want to check");
		int num=sc.nextInt();
		if(ch==1) {
			op=ob.isOdd();
			ret=ob.checker(op, num);
			ans=(ret)?num+"is ODD":num +"is EVEN";
		}
		else if(ch==2) {
			op=ob.isPrime();
			ret=ob.checker(op, num);
			ans=(ret)?num+"is PRIME":num +"is COMPOSITE"; 
		}
		else if(ch==3) {
			op=ob.isPalindrome();
			ret=ob.checker(op, num);
			ans=(ret)?num+"is PALINDROME":num +"is NOT PALINDROME";
	}
		System.out.println(ans);
	}	

}
