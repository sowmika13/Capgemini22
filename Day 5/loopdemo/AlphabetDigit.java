package demo.loopdemo;

public class AlphabetDigit {
	static void charCheck(char element)
    {
        // CHECKING FOR ALPHABET
        if ((element >= 65 && element <= 90)
            || (element >= 97 && element <= 122))
            System.out.println(" Alphabet ");
 
        // CHECKING FOR DIGITS
        else if (element >= 48 && element <= 57)
            System.out.println(" Digit ");
 
        // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println(" Special Character ");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        char element = '3';
        charCheck(element);
    }
}
