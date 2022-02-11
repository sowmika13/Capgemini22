
package stringsdemo;

public class Split {
	public static void main(String args[]) {
		String s1="Sowmika@Boyapati";
		String[] arrOfs1 = s1.split("@",2);
		
		for (String a : arrOfs1)
			System.out.println(a);
	}

}
