//Addition program that inputs two numbers then displays their sum.

import java.util.Scanner; //class Scanner

public class Addition
{
    //main method begins execution of Java application
    public static void main(String[] args)
    {
	//creates Scanner to obtain input from command line
	Scanner input = new Scanner(System.in);
    
	int number1;
	int number2;
	int sum;

	System.out.printf("Enter first integer: "); //prompt
	number1 = input.nextInt(); //read first input

	System.out.printf("Enter second integer: "); //prompt
	number2 = input.nextInt(); //read second input

	sum = number1+number2;

	System.out.printf("Sum is %d%n", sum); //display sum
    } //end method main
} //end class Addition
       
	    
