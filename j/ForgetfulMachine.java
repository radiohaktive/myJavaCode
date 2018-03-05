import java.util.Scanner;

public class ForgetfulMachine {
    public static void main( String[] args ) {
	Scanner keyboard = new Scanner( System.in );

	System.out.printf( "What city is the capital of France?" );
	keyboard.next();

	System.out.printf( "What is 6 multiplied by 7?" );
	keyboard.nextInt();

	System.out.printf( "Enter a number between 0.0 and 1.0." );
	keyboard.nextDouble();

	System.out.printf( "Is there anything else you would like to type?" );
	keyboard.next();
    }
} // end Forgetful Machine
