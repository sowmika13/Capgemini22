package stringsdemo;

public class GetChars {
	public static void main(String[] args) {  
        String str = new String("Sowmika Boyapati");  
        char[] ch  = new char[20];  
            str.getChars(1, 26, ch, 0);  
            System.out.println(ch);  
    } 
}
