public class Currency
{
	private String firstName;
	private String lastName;
	private int accountNumber;
	private int balance;

	private static int bitcoin = 100;
	private static int acc = 1001;
	private static int transactions = 0;

	public void buy(int b)
	{
		if(b > bitcoin)
		{
			System.out.println("Sorry, we don't have enought bitcoin left to sell this customer!");
		}else
		{
			balance += b;
			bitcoin = bitcoin - b;
			transactions++;
			System.out.println("Transaction complete");
		}
	}


	public Currency(String f, String l)
	{
		firstName = f;
		lastName = l;
		accountNumber = acc;
		acc++;
	}



	public String toString()
	{
		String str = "ACCOUNT DETAILS:\n";
		str += "First Name: " + firstName + "\n";
		str += "Surname: " + lastName + "\n";
		str += "Account Number: " + accountNumber + "\n";
		str += "Balance: " + balance + "\n";
		return str;
	}

	//Static Methods
	public static void showBitcoin()
	{
		System.out.println("Bitcoin in stock: " + bitcoin);
	}

	public static void showTransactionCount()
	{
		System.out.println("Number of transactions: " + transactions);
	}

	public static double calculateCost(int b, double price)
	{
		return b * price;
	}



}




