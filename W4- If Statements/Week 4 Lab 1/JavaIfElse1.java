// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse1
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		int num1;

		//Processing and Calculations


		//Prompt and input values
		System.out.print("Num1 Variable is: ");
		num1 = keyboard.nextInt();

		//If Statement

		if (num1 > 50 )
		{
			System.out.println("Value is greater than 50!");
		}
		else
		{
			System.out.println("Value is less than 50!");
		}

	}
}