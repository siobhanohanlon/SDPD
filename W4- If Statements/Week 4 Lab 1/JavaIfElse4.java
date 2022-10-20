// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse4
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		int userNumber;

		//Processing and Calculations


		//Prompt and input values
		System.out.print("Enter a number: ");
		userNumber = keyboard.nextInt();

		//If Statement

		if (userNumber >= 0 )
		{
			System.out.println("The number you entered is positive");
		}
		else if (userNumber < 0)
		{
			System.out.println("The number you entered is negative");
		}

	}
}