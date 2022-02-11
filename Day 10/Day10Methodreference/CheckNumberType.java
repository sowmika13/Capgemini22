package Day10Methodreference;
import java.util.Scanner;

interface NumberType {
   boolean checkNumber(int num);
}

public class CheckNumberType {
   public static NumberType isOdd() {
       return (num) -> num % 2 != 0;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();

       if (isOdd().checkNumber(num)) {
           System.out.println(num + " is odd");
       } else {
           System.out.println(num + " is not odd");
       }
   }
}

