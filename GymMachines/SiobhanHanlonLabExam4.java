// Siobhan O Hanlon, G00389108
//27 April 2021

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class SiobhanHanlonLabExam4
{
	public static void main(String[] args) throws IOException
	{
		//Create an object of the class Scanner called Keyboard
		Scanner keyboard = new Scanner(System.in);

		//Declare Variables
		int i=0, number=0, use;
		String search;
		boolean found= false, end=false;

		//Create new Instances of Member
		MemberClass A = new MemberClass("Arnold", "Schwartz");
		MemberClass B = new MemberClass("Becky", "Roberts", 'p');
		MemberClass C = new MemberClass("Cate", "Leigh");

		//Read from file gymkit
		String filename = "gymkit.txt";
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		//Create an array of Machine Names
		String[] machines = new String[16];

		//Print Machines to Console
		System.out.println("*****WELCOME TO THE JAVA GYM*****");
		System.out.println("-- List of Available Gym Machines --\n");
		while(inputFile.hasNext())
		{
			machines[i] = inputFile.nextLine();
			System.out.println((i+1)+". "+ machines[i]);
			i++;
		}

		//While Loop for Search Machine Option
		do{
			//Search Feature
			System.out.print("\nSearch for Machine: ");
			search = keyboard.nextLine();

			//If end is entered it ends the loop
			if(search.equalsIgnoreCase("end"))
			{
				end=true;
			}


			//If anything but end is entered iit searches for machine
			else
			{
				//Search Array for Machine entered
				for(int c=0; c<machines.length; c++)
				{
					if(search.equalsIgnoreCase(machines[c]))
					{
						found= true;
						number= c;
					}
				}

				//If Machine Found
				if(found == true)
				{
					System.out.println(machines[number]+" is Machine Number "+(number+1));
				}


				//If Machine is not on list
				else
				{
					System.out.println("Machine Not Found");
				}
			}
		}while(end==false);//Loop ends if end is enetered in search

		//Print Member Deatils
		A.setType();
		B.setType();
		C.setType();
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		//Print Reports
		MemberClass.gymReport();
		MemberClass.annualReport();
		MemberClass.openingHours();

		/*//Machines in Use
		do{
			System.out.print("\nType Number of Machine in Use (0 to exit): ");
			use = keyboard.nextInt();
			//Ran out of time but must select the array number minus 1 as it begins at 0 and 0 ends this code
			//then edit the output to say it is in use while printing all machines
		}while(use!=0);*/
	}
}