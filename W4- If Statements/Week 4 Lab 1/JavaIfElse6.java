// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse6
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		int firstNum, secondNum;
		char operator;

		//Processing and Calculations



		//Prompt and input values
		System.out.print("Enter first number: ");
		firstNum = keyboard.nextInt();
		System.out.print("Enter second number: ");
		secondNum = keyboard.nextInt();
		System.out.print("Enter operator: (a, s, d, m): ");
		operator = keyboard.next().charAt(0);

		//If Statement

		if (operator == 'a')
		{
			System.out.println(firstNum + " plus " + secondNum + " is : " + (firstNum + secondNum));
		}
		else if (operator == 's')
		{
			System.out.println(firstNum + " minus " + secondNum + " is : " + (firstNum - secondNum));
		}
		else if (operator == 'd')
		{
			System.out.println(firstNum + " divided by " + secondNum + " is : " + (firstNum / secondNum));
		}
		else if (operator == 'm')
		{
			System.out.println(firstNum + " multiplied by " + secondNum + " is : " + (firstNum * secondNum));
		}
		else
		{
			System.out.println("That's not a valid option!");
		}


	}
}