// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

import java.util.Scanner;

public class JavaFor4
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int num1;

		//Beginning of Program
		System.out.println("Counter Program\nThis Program will count from zero up to whatever number you enter.\n\n");

		//Prompt and input values
		System.out.print("Enter a Number to count up to: ");
		num1 = keyboard.nextInt();

		//For Statement
		for (int i=0; i<=num1; i++)
		{
			System.out.println(i);
		}
	}
}