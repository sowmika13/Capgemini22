package Collections;
import java.util.Vector;

public class Vectordemo {


	/**
	 * Vector is like the dynamic array which can grow or shrink its size
	 * 
	 * Vector is synchronized. Java Vector contains many legacy methods that are not
	 * the part of a collections framework.
	 * 
	 * **
	 * 
	 *
	 */

		public static void main(String args[]) {


			// Create a vector
			Vector<String> vec = new Vector<String>();
			// Adding elements using add() method of List
			vec.add("Tiger");
			vec.add("Lion");
			vec.add("Dog");
			vec.add("Elephant");
			// Adding elements using addElement() method of Vector
			vec.addElement("Rat");
			vec.addElement("Cat");
			vec.addElement("Deer");

			System.out.println("Elements are: " + vec);
			System.out.println("Elements are: " + vec.size());
			

		}
}
