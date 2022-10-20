// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse5
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		int firstNum, secondNum;

		//Processing and Calculations


		//Prompt and input values
		System.out.print("Enter first number: ");
		firstNum = keyboard.nextInt();
		System.out.print("Enter second number: ");
		secondNum = keyboard.nextInt();

		//If Statement

		if (firstNum > secondNum)
		{
			System.out.println("The first number is greater than the second number");
		}
		else if (firstNum < secondNum)
		{
			System.out.println("The second number is greater than the first number");
		}
		else
		{
			System.out.println("The numbers are equal!");
		}

	}
}