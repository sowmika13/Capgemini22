package Day11;

interface ArrayProcessor {
    double apply( double[] array );
}

public class LambdaArrayprocessor {
	public static ArrayProcessor counter( double value ) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if ( array[i] == value )
                    count++;
            }
            return count;
        };
    }

    public static final ArrayProcessor maxer = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > max)
                max = array[i];
        }
        return max;
    };

    public static final ArrayProcessor miner = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min)
                min = array[i];
        }
        return min;
    };

    public static final ArrayProcessor sumer = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };

    public static final ArrayProcessor averager = 
            array -> sumer.apply(array) / array.length;

    public static void main(String[] args) {
        
        double[] firstList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] secondList = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };
        
        System.out.println("Sum of first list " 
                                                 + sumer.apply(firstList) );
        System.out.println("Average of first list  " 
                                                 + averager.apply(firstList) );
        System.out.println("Minimum of second list  " 
                                                 + miner.apply(secondList) );
        System.out.println("Maximum of second list  " 
                                                 + maxer.apply(secondList) );
        
        System.out.println();
        
        System.out.println("Count of 17.0 in second list  " 
                                                 + counter(17.0).apply(secondList) );
        System.out.println("Count of 20.0 in second list  " 
                                                 + counter(20.0).apply(secondList) );
        System.out.println("Count of 5.0 in first list  " 
                                                 + counter(5.0).apply(firstList) );
        
    }
    
    

}
