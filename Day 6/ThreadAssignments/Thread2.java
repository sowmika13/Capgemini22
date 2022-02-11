package ThreadAssignments;
import java.util.Random;


public class Thread2 implements Runnable {

	public static void main(String[] args) {
		Thread2 colors = new Thread2();
		Thread t1 = new Thread(colors);
		t1.start();
	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(5)) != 4) {
			System.out.println(colours[index]);
		}		
	}

}
