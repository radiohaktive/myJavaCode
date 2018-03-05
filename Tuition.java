import java.util.Scanner;

public class Tuition
{
    public static void main( String[] args )
    {
	Scanner input = new Scanner( System.in );

	int y1, y2, y3, misc;
	int sum;

	System.out.printf( "Enter the first year: ");
	y1 = input.nextInt();
	System.out.printf( "Enter the second year: ");
	y2 = input.nextInt();
	System.out.printf( "Enter the third year: ");
	y3 = input.nextInt();

	sum = y1 + y2 + y3;

	System.out.printf( "First year's tuition is: $%d%n", y1 );
	System.out.printf( "Second year's tuition is: $%d%n", y2 );
	System.out.printf( "Third year's tuition is: $%d%n", y3 );
	System.out.printf( "The total cost of tuition is: $%d%n", sum);
    }
}
