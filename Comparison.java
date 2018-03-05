// Compare integers using if statements, relational operators
// and equality operators.
import java.util.Scanner; //program uses class Scanner

public class Comparison
{
    //main methnod begins execution of Java application
    public static void main(String[] args)
    {
	//creates Scanner to obtain input from cmd line
	Scanner input = new Scanner(System.in);

	int number1;
	int number2;

	System.out.printf("Enter first integer: ");
	number1 = input.nextInt();

	System.out.printf("Enter second integer: ");
	number2 = input.nextInt();

	if (number1 == number2)
	    System.out.printf("%d == %d%n", number1, number2);

	if (number1 != number2)
	    System.out.printf("%d != %d%n", number1, number2);

	if (number1 < number2)
	    System.out.printf("%d < %d%n", number1, number2);

	if (number1 > number2)
	    System.out.printf("%d > %d%n", number1, number2);

	if (number1 <= number2)
	    System.out.printf("%d <= %d%n", number1, number2);

	if (number1 >= number2)
	    System.out.printf("%d >= %d%n", number1, number2);
    }
}
	    

