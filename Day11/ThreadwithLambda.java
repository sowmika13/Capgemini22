package Day11;

public class ThreadwithLambda {
	   public static void main(String[] args) {
	    
	       Runnable A = () -> {  
	           
	             for(int i=1; i <= 5; i++) {
	            System.out.println("A Thread prints :A"+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      };
	      Runnable B = () -> {   
	            for(int j=1; j <= 5; j++) {
	            System.out.println("B Thread prints :B"+ j);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      };
	      new Thread(A).start();
	      new Thread(B).start();
	   }
}
