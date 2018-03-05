/* Television Client
   Ben Carmona
*/

public class TelevisionClient {
	public static void main( String [] args ) {

		Television hidef = new Television( "Sony", 1000.0 );
		System.out.println( hidef.toString() );

		Television lodef = new Television( "Magnavox", 500.0 );
		System.out.println();
		System.out.println( lodef );

		if( lodef.equals( hidef ) )
			System.out.println( "\nlodef and hidef are equal" );
		else
			System.out.println( "\nlodef and hidef are not equal" );
	}
}

