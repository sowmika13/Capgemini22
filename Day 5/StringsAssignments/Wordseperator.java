package StringsAssignments;
import java.util.Scanner;

public class Wordseperator {
	public static void main(String[] args) {
		String str1 = "Capgemini";
		String str2 = "X";
		int separator = 3;
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i < separator - 1; i++) 
			sb.append(str1).append(str2);
		sb.append(str1);
		
		System.out.println(sb);
	}
}
