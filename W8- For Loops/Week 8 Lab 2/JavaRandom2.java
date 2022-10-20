// Siobhan O Hanlon, G00389108
// Week 8-Lab 2-Random

import java.util.Random;
import java.util.Scanner;

public class JavaRandom2
{
	public static void main(String [] args)
	{
		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		int num1, guess;

		num1= randomNumber.nextInt(10) + 1;

		System.out.println("GUESSING GAME");
		System.out.print("Guess the random number generated between 1 and 10: ");
		guess = keyboard.nextInt();

		if(guess == num1)
		{
			System.out.println("You Guessed Correctly!");
		}
		else
		{
			System.out.println("Sorry, that's not the number i was thinking of!");
			System.out.printf("It was %d. Better luck next time!\n", num1);
		}
	}
}