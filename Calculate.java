//Calculation application
//That takes the sum, average and product of three integers.

import java.util.Scanner;

public class Calculate
{
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int number3;
	int sum;
	int average;
	int product;

	System.out.printf("Enter first integer:");
	number1 = input.nextInt();
	    
	System.out.printf("Enter second integer:");
	number2 = input.nextInt();
	    
	System.out.printf("Enter third integer:");
	number3 = input.nextInt();

	sum = number1 + number2 + number3;
	average = (number1 + number2 + number3)/3;
	product = number1 * number2 * number3;

	System.out.printf("Sum is %d%n", sum);
	System.out.printf("Average is %d%n", average);
	System.out.printf("Product is %d%n", product);
    }
}
	  
	  

	  
	
       
