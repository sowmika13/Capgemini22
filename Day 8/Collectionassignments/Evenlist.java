package Collectionassignments;
import java.util.*;
/*
 * 
Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, 
where N is a integer which is passed as a parameter to the method saveEvenNumbers().
The method should return the ArrayList (A1) created. In the same class create a method printEvenNumbers()
which iterates through the arrayList A1 in step 1, and It should multiply each number with 2 and 
display it in format 4,8,12….2*N.
 and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned. 
Create a method printEvenNumber(int N) parameter is a number N. This method should search the arrayList (A1) 
for the existence of the number ‘N’ passed. 
If exists it should return the Number else return zero.Hint: Use instance variable for storing the ArrayList A1 and A2. 
NOTE: You can test the methods using a main method.
List ArrayList 	
 */
class EvenNumber
{
	public ArrayList<Integer> SaveEvenNumbers(int n)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		//System.out.println(n);
		for(int i=2;i<=n;i++)
		{
			//System.out.println(i);
			if(i%2 ==  0)
			{
				a.add(i);
				//System.out.println(i);
			}
		}
		//System.out.println(a);
		return a;
	}
	public ArrayList<Integer> PrintEvenNumbers(ArrayList<Integer> n)
	{
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i : n)
		{
			System.out.print((i*2+" "));
			b.add(i*2);
		}
		
		//System.out.print(n+" ");
		return b;
	}
}
public class Evenlist {

	public static void main(String[] args) {
		
		EvenNumber q=  new EvenNumber();
		ArrayList<Integer> g=q.SaveEvenNumbers(25);
		q.PrintEvenNumbers(g);
		
		
		
	}

}

