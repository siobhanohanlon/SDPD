// Siobhan O Hanlon, G00389108
// Week 8-Lab 2-Random

import java.util.Random;

public class JavaRandom3
{
	public static void main(String [] args)
	{
		Random randomNumber = new Random();

		int num1, num2;

		num1= randomNumber.nextInt(41) + 10;
		num2= randomNumber.nextInt(41) + 10;

		System.out.println("Random Number 1: " + num1);
		System.out.println("Random Number 2: " + num2);
	}
}