package StringsAssignments;

public class Withoutfirstlast {
	public static void main(String[] args) {
		String str = "Capgemini";
		
		str = str.substring(1, str.length() - 1);
		
		System.out.println(str);
	}

}
