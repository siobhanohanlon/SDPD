//Siobhan O Hanlon, G00389108
//Description: Week 3 Exercise 1-Scanner

import java.util.Scanner;
public class JavaScanner1
{
	public static void main (String[] args)
	{
		//Create an object of the class Scanner called Keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare and Assign Variables&Constants
		int number1;

		//Prompt and input Integer Number
		System.out.print("Enter a number: ");
		number1 = keyboard.nextInt();


		//Output all Values
		System.out.println("Number input was: " + number1);

	}
}