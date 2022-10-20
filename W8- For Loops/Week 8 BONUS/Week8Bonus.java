// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

import java.util.Scanner;

public class Week8Bonus
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int size=1;

		//While Statement
		do
		{
			//Prompt and input values
			System.out.print("Specify Size of Triangle: ");
			size = keyboard.nextInt();

			//Outer loop will run x times
			for (int i=1; i<=size; i++)
			{
				//Outputting x amount of * each time it runs
				for(int x=1; x<=i; x++)
				{
					System.out.print("*");
				}

				//This will output a new-line character
				System.out.print("\n");
			}

			//Outer loop will run x times
			for (int i=size; i>=1; i--)
			{
				//Outputting x amount of * each time it runs
				for(int x=i; x>=1; x--)
				{
					System.out.print("*");
				}

				//This will output a new-line character
				System.out.print("\n");
			}
		}while(size>0);
	}
}