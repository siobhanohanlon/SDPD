import java.io.*;
import java.util.Scanner;

public class Temperature
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		//Read from a file code
		//Creates a file object and specifies a file
		File readFile = new File("NewYorkTemp.txt");

		//Create scanner object and specify file object created on line 11
		Scanner inputFile = new Scanner(readFile);

		//Test that file reads okay
		//System.out.println(inputFile.nextLine());

		//Declare an array of doubles, specify size to hold 8 values
		double[] temps = new double[120];

		int line = 0;
		//While loop to populate array with doubles from file
		while(inputFile.hasNext())
		{
			temps[line] = inputFile.nextDouble();
			line++;
		}

		System.out.println("New York Temperature Data - From 1900 to 2020");

		double average = 0;

		for(int i = 0; i <=119; i++)
		{
			average += temps[i];
		}

		average = average / 120;

		double min = temps[0];
		double max = temps[0];
		int minYear = 1900;
		int maxYear = 1900;

		for(int j = 0; j <=119; j++)
		{
			if(temps[j] < min)
			{
				min = temps[j];
				minYear = j + 1900;
			}
			if(temps[j] > min)
			{
				max = temps[j];
				maxYear = j + 1900;
			}
		}

		System.out.printf("Average temperature since 1900 was %.4f \n", average);
		System.out.println("Minimum temperture since 1900 was " + min + " in " + minYear);
		System.out.println("Maximum temperture since 1900 was " + max + " in " + maxYear);

		System.out.println("Search specific year: ");

		int yearSearch = keyboard.nextInt();

		for(int k = 0; k <=113; k++)
		{
			if(yearSearch == (k + 1900))
			{
				System.out.println("Temperature in " + yearSearch + " was " + temps[k]);
			}
		}
	}
}