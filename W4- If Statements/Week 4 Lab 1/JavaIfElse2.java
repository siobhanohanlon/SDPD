// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse2
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		double temperature;

		//Processing and Calculations


		//Prompt and input values
		System.out.print("Temperature is: ");
		temperature = keyboard.nextInt();

		//If Statement

		if (temperature > 25 )
		{
			System.out.println("It's hot outside!");
		}
		else if (temperature < 5)
		{
			System.out.println("It's cold outside!");
		}
		else
		{
			System.out.println("It's okay outside!");
		}

	}
}