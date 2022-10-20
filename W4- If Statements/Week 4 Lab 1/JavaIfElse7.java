// Siobhan O Hanlon, G00389108
// Week 4-Lab 1-If Else Statement

import java.util.Scanner;

public class JavaIfElse7
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		double score;
		char grade;

		//Processing and Calculations



		//Prompt and input values
		System.out.print("Enter score number: ");
		score = keyboard.nextDouble();

		//If Statement

		if (score >= 70 && score <=100)
		{
			grade = 'A';
			System.out.println("Score of " + score + ". Grade is " + grade);
		}
		else if (score >= 60 && score <70)
		{
			grade = 'B';
			System.out.println("Score of " + score + ". Grade is " + grade);
		}
		else if (score >= 50 && score <60)
		{
			grade = 'C';
			System.out.println("Score of " + score + ". Grade is " + grade);
		}
		else if (score >= 40 && score <50)
		{
			grade = 'D';
			System.out.println("Score of " + score + ". Grade is " + grade);
		}
		else if (score < 40 && score >=0)
		{
			grade = 'E';
			System.out.println("Score of " + score + " is less than 40. Grade is " + grade);
		}
		else
		{
			System.out.println("An incorrect score was entered");
		}

	}
}