import java.util.Scanner;

public class DupTest
{

        public static void main(String [] args)
{


	Boolean duplicate = false;

	int [] numbers;
	numbers = new int[5];
	int counter = 0;
	int next_number;

	Scanner data = new Scanner(System.in);


	while(counter < 5)
        {
                
	  System.out.printf("\nEnter a number: ");
	  next_number = data.nextInt();
          if((next_number >=10) && (next_number <=100))
 	  {
		numbers[counter] = next_number;
		counter = counter + 1;
		for(int i=0; i<counter-1; i++)
		{
			System.out.printf("%d ",numbers[i]);
			if (numbers[i] == next_number)
			{
				duplicate = true;
				System.out.printf("\n %d has already been entered\n", next_number);
				counter = counter - 1;
				break;
			}
			
		}
          }
	  else
	  {
		System.out.printf("\nEnter a number between 10 and 100: ");
          }
	}


	System.out.printf("\n\n");
	for(int j=0; j<5; j++)
	{
	 	System.out.printf("%d ",numbers[j]);
	}
}

}
