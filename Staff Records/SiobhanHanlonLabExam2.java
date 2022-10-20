// Siobhan O Hanlon, G00389108
// Week 6- Sample Lab Exam 2

import java.util.Scanner;

public class SiobhanHanlonLabExam2
{
	public static void main(String[] args)
	{
		// Create an object of the class Scanner called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Declare variables
		int accnum;
		char acctype,check='y';
		double prevbal, deposit, newbal;

		//While Statement
		while (check == 'y')
		{
			//Prompt and input values
			System.out.print("\n\n\tEnter Account Number: ");
			accnum = keyboard.nextInt();
			System.out.print("\tEnter Account type (S or C): ");
			acctype = keyboard.next().charAt(0);
			System.out.print("\tEnter existing balance: ");
			prevbal = keyboard.nextDouble();
			System.out.print("\tEnter Deposit: ");
			deposit = keyboard.nextDouble();
			//Calculations
			newbal= (prevbal+deposit);

			switch (accnum)
			{
				case 46728:
				case 87324:
				case 79873:
				case 89832:
				case 98322:
				System.out.println("\n\n\n_________________________________BANK OF JAVA ACCOUNT MANAGEMENT ______________________________");
				System.out.println("\n\tAcc No.\t\tType\tDeposit\t\tPrevious Balance\tNew Balance");

				if(acctype=='s' && deposit>1000 && prevbal>3000)
				{ newbal= (prevbal+deposit+25);	}

				System.out.printf("\t%d\t\t %c\t%,.2f\t%,.2f\t\t%,.2f\n", accnum, acctype, deposit, prevbal, newbal);
				System.out.println("\n______________________________________________________________________________________________");

				if(acctype=='s' && deposit>1000 && prevbal>3000)
				{ System.out.println("\nBANK OF JAVA BONUS: You have received an additional 25 euro bonus to your account!"); }

				System.out.printf("\nNEW CURRENT BALANCES IS %,.2f", newbal);
				break;

				default:
				System.out.println("Please enter a valid account number");

			}
			System.out.print("\n\n\nCheck another account: ");
			check = keyboard.next().charAt(0);
		}
	}
}