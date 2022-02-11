package StringsAssignments;

public class repetion {
	public static void main(String[] args) {
		String str = "Capgemini";
		int n = 3;
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
	}

}
