// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

import java.util.Scanner;

public class JavaNestedFor2
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int width,height;

		//Prompt and input values
		System.out.print("\n\nEnter Width of Rectangle: ");
		width = keyboard.nextInt();
		System.out.print("\n\nEnter Height of Rectangle: ");
		height = keyboard.nextInt();

		System.out.print("\n\n");

		//Outer loop will run 5 times
		for (int i=1; i<=height; i++)
		{
			//Inner for loop will run 10 times
			//Outputting ********** each time it runs
			for(int x=1; x<=width; x++)
			{
				System.out.print("*");
			}

			//This will output a new-line character
			System.out.print("\n");
		}

		System.out.print("\n\n");
	}
}