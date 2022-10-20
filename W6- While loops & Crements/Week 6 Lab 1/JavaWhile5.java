// Siobhan O Hanlon, G00389108
// Week 6-Lab 1-While

import java.util.Scanner;

public class JavaWhile5
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int num1;

		//Prompt and input values
		System.out.print("Enter a Number: ");
		num1 = keyboard.nextInt();

		//While Statement
		while (num1 > 0 && num1 < 50)
		{
			System.out.print("Enter a Number: ");
			num1 = keyboard.nextInt();
		}
	}
}