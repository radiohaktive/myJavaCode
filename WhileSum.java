// WhileSum.java

public class WhileSum {
    public static void main( String[] args ) {

	// initialize control variables
	int count = 0;
	int total = 0;

	// begin counter-controlled repetition
	while( count <= 10 ) {
	    // counter starts at 0 and initializes total at 0
	    total+=count;
	    count++; // increment counter to 1 and tally the total
	    if( count == 3 ) { // if counter hits 3, continue
		continue;
	    } else if( count == 6 ) { // if counter hits 6, continue
		continue;
	    } // end if loop
	    count++; // increment counter after it hits 6
	} 
	total+=count; // tally running total

	// print results: termination phase
	System.out.printf( "The sum of the numbers 1 through 10, skipping 3 and 6, is %d.%n", total );
    } // end method main
    
} // end class WhileSum
		
		
	      
	    
