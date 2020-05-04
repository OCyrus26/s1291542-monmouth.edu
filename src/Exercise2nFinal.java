import java.util.*;

public class Exercise2nFinal 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// (a)
		int sum=0;
		for(int i=2; i<=100; i=i+2)
		{
			sum = sum + i;
		}
		System.out.println("The sum of all even numbers between 2 and 100 is:" + sum);


		// (b)
		int n = 1;
		int square;
		int sum1 = 0;
		while (n <= 100) 
		{
			square= (n*n);
			sum1 += square; 
			n++;
		}
		System.out.println("The sum of all squares between 1 and 100 is:" + sum1);

		// (c)
		System.out.println("All powers of 2 between 2 and 20 are: ");
		for (int sum2 = 0; sum2 <= 20; sum2++)
		{
			double totalsum2 = Math.pow(2, sum2);
			System.out.println("2^" + sum2 + " = " + totalsum2);
		}

		// (d)
		System.out.print("Please enter the starting value and ending value: "); //prompts user for ints
		int a = scan.nextInt(); 
		int b = scan.nextInt();
		int sum3 = 0;

		for (int j = a; j <= b; j++)
		{
			if (j % 2 == 1)
				sum3 += j;
		}
		System.out.println("The sum of all odd numbers between " + a + " and "+ b + " is: " + sum3);
	}
}




	
	
	