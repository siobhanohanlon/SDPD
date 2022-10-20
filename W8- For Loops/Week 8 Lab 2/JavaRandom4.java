// Siobhan O Hanlon, G00389108
// Week 8-Lab 2-Random

import java.util.Random;
import java.util.Scanner;

public class JavaRandom4
{
	public static void main(String [] args)
	{
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		int num1, num2, cal, guess;

		System.out.println("WELCOME TO THE MATHS ADDITION GAME\n");

		//For Statement to ask 5 Qs
		for (int i=1; i<=5; i++)
		{

			num1= randomNumber.nextInt(45) + 15;
			num2= randomNumber.nextInt(45) + 15;

			cal= num1+num2;

			System.out.printf("Q%d - What is %d plus %d?: ",i,num1,num2);
			guess = keyboard.nextInt();

			if(guess == cal)
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.printf("Hmmm... that's not corrcet. The answer is %d.\n\n", cal);
			}
		}
	}
}