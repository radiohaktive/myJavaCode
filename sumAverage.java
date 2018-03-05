// SOlving the number-average problem using counter-controlled repetition.
import java.util.Scanner;

public class sumAverage
{
    public static void main( String[] args )
    {
	// create Scanner
	Scanner input = new Scanner( System.in );

	// initialization phase
	int total = 0; // initialize sum of numbers entered by the user
	int numberCounter = 1; // initialize # of numbers to be entered next

	// processing phase uses counter-controlled repetition

	while( numberCounter <= 10 ) // loop 10 times
	    {
		System.out.print( "Enter number: " ); // prompt
		int number = input.nextInt(); // input next number
		total = total + number; // add grade to total 
		numberCounter = numberCounter + 1; // increment counter by 1
	    }
	// termination phase
	int average = total / 10; // integer division yields integer result

	System.out.printf( "%nTotal of all 10 numbers is %d%n", total );
	System.out.printf( "Number average is %d%n", average );
    }
} // end class sumAverage
    
    
