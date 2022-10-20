// Siobhan O Hanlon, G00389108
// Week 6- Sample Lab Exam

import java.util.Scanner;

public class SiobhanHanlonLabExam1
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		String password;
		double num1, num2, sum, minus, mult, divide, remain;
		int amountCal=0;
		char oper, cal='y';

		//Prompt and input values
		System.out.print("CONSOLE CALCULATOR\nInput Password to enter: ");
		password = keyboard.next();

		//If Statement
		if (password.equalsIgnoreCase("pass"))
		{
			System.out.println("\n----------WELCOME TO CALCULATOR----------");
			System.out.println("Enter two numbers for calculation\n-----------------------------------------");

		//While Statement
			while (cal == 'y')
			{
				++amountCal;
				System.out.print("Enter first number: ");
				num1= keyboard.nextDouble();
				System.out.print("Enter second number: ");
				num2= keyboard.nextDouble();
				System.out.print("What calculation do you wish to perform?\nEnter A for add, S for subtract, M for multiply, D for divide, R for remainder: ");
				oper = keyboard.next().charAt(0);

		//Calculator Operators
				if (oper == 'a')
				{
					sum= (num1 + num2);
					System.out.printf("\t%.2f plus %.2f is : %,.2f\n", num1, num2, sum);
				}
				else if (oper == 's')
				{
					minus= (num1 - num2);
					System.out.printf("\t%.2f minus %.2f is : %,.2f\n", num1, num2, minus);
				}
				else if (oper == 'd')
				{
					divide= (num1 / num2);
					System.out.printf("\t%.2f divide %.2f is : %,.2f\n", num1, num2, divide);;
				}
				else if (oper == 'm')
				{
					mult= (num1 * num2);
					System.out.printf("\t%.2f multiply %.2f is : %,.2f\n", num1, num2, mult);
				}
				else if (oper == 'r')
				{
					remain= (num1 % num2);
					System.out.printf("\t%.2f remainer %.2f is : %,.2f\n", num1, num2, remain);
				}
				else
				{
					System.out.println(oper + " is not a valid option! Enter Y to perform another calculation:");
					cal = keyboard.next().charAt(0);
				}
				System.out.println("Enter Y to perform another calculation:");
				cal = keyboard.next().charAt(0);
			}
			System.out.printf("\n\nEND OF PROGRAM REACHED\nThe program performed %d calculation(s)\n\n",amountCal);
		}

		//Wrong Password
		else
		{
			System.out.println("Invalid password entered!\n-----------------------------------------\n\nEND OF PROGRAM REACHED\nThe program performed 0 calculation(s)\n\n");
		}
	}
}