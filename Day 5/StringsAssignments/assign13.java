package StringsAssignments;

public class assign13 {
	public static void main(String[] args) {
		String st = "XY123XY";
		String word = "XY";
		int sLen = st.length();
		int wLen = word.length();
		
		String fin = "";
		
		for(int i=0; i<sLen-wLen+1; i++){
			String tmp = st.substring(i,i+wLen);
			if(i>0 && tmp.equals(word)){
				fin+=st.substring(i-1,i);
			}
			if(i<sLen-wLen && tmp.equals(word)){
				fin+=st.substring(i+wLen, i+wLen+1);
			}	
		}
		
		System.out.println(fin);
	}	
}
