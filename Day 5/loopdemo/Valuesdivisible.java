package demo.loopdemo;

public class Valuesdivisible {
	static void result(int N)
    {    
        for (int num = 0; num < N; num++)
        {    
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
        }
    }
    public static void main(String []args)
    {
        int N = 100;
        result(N);
    }
}

