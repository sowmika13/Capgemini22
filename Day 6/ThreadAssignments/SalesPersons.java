package ThreadAssignments;
public class SalesPersons implements Runnable {

		Thread t;
		SalesPersons()
		{
			t=new Thread(this,"P.name");
			t.start();
		}
		public void run() {
			System.out.println("P1, "+"P2, "+"P3, "+"P4, "+"P5");
		}
}
