// Siobhan O Hanlon, G00389108
// Week 8-Bonus 2

import java.util.Scanner;

public class Week8Bonus2
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int size=1;

		//Prompt and input values
		System.out.print("Input Number of Rows: ");
		size = keyboard.nextInt();

		//Outer loop will run x times
		for (int i=1; i<=size; i++)
		{
			// loop to print the number of spaces before the star
			for (int j = size; j >= i; j--)
			{
			   	System.out.print(" ");
            }

			//Outputting x amount of * each time it runs
			for(int x=1; x<=i; x++)
			{
				System.out.print("* ");
			}

			//This will output a new-line character
			System.out.print("\n");
		}
	}
}