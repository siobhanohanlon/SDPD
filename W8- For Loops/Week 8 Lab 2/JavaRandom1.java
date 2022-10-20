// Siobhan O Hanlon, G00389108
// Week 8-Lab 2-Random

//Import the Random Class

import java.util.Random;

public class JavaRandom1
{
	public static void main(String[] args )
	{
		//Create an instance of Random Class
		Random randomNumber = new Random();

		int num1;

		//Generate a random number and store in varuable num1
		num1 = randomNumber.nextInt(10);

		//Output num1 variable
		System.out.println(num1);
	}
}