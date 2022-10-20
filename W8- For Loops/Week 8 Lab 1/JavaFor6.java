// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

import java.util.Scanner;

public class JavaFor6
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int num1;

		//Prompt and input values
		System.out.print("\n\nEnter a Number: ");
		num1 = keyboard.nextInt();

		//For Statement
		for (int i=0; i<=100; i=i+num1)
		{
			System.out.println(i);
		}
	}
}