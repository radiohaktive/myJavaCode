// WhileCounter.java
// Counter-controlled repetition with the while repetition statement.

public class WhileCounter {
    public static void main( String[] args ) {
	int counter = 1; // control variable

	while( counter <= 10 ) {

	    if( counter == 3 ) {
		continue;
	    }
	    
	    System.out.printf( "%d ", counter );
	   
	}
	System.out.println();
    } // end main
} // end class WhileCounter
	    
	

   
