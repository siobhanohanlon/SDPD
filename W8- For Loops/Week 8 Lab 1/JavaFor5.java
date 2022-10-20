// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

import java.util.Scanner;

public class JavaFor5
{
	public static void main(String[] args )
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int num1;

		//Beginning of Program
		System.out.println("MULTIPLICATION TABLE\n\n");

		//Prompt and input values
		System.out.print("Enter a Number to generate multiplication tables for: ");
		num1 = keyboard.nextInt();

		//For Statement
		for (int i=1; i<=10; i++)
		{
			System.out.println(num1+ " Times " +i+ " is "+ (num1*i));
		}
	}
}