import java.util.Scanner;

public class PortalTest
{
    public static void main( String[] args )
    {
	// create a Scanner for input
	Scanner input = new Scanner( System.in );
	// create an Account object & assign it to myAccount
	Account myAccount = new Account();

	//display initial name( null )
	System.out.printf( "Initial name is: %s%n%n", myAccount.getName());

	//prompt for & read name
	System.out.println( "PLease enter the name: " );
	String theName = input.nextLine();
	myAccount.setName( theName );
	System.out.println();

	//display name from myAccount
	System.out.printf( "Name in object myAccount is: %s%n%n", myAccount.getName());
    }
}

       
    
