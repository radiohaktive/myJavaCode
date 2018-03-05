// forLoopSwitch.java
// Counter-controlled repetition with the for repetition statement and a switch to assign letter values to the numbers counted during the loop.

public class forLoopSwitch
{
    public static void main( String[] args )
    {
	String letter;
	
	// initialize, continuation, increment
	for( int counter = 1; counter <= 5; counter++ )
	    {
		switch( counter )
		    {
		    case 1: letter = "A";
			break;
		    case 2: letter = "B";
			break;
		    case 3: letter = "C";
			break;
		    case 4: letter = "D";
			break;
		    default: letter = "F";
			break;		
		    }
		System.out.printf(letter);
	    }
    }
} // end forLoopSwitch


		      

			


		       
		    
	   
	
