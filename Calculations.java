// Calculate sum of integers from 1 to 10 using while loop
public class Calculations {
    public static void main( String[] args )
    {
	int sum;
	int x;

	x = 1;
	sum = 0;

	while( x <= 10 ) {
	    sum += x;
	    ++x;
	} // end while

	System.out.printf( "The sum is: %d\n", sum );
    } // end main
} // end Calculate2
	    
       
