import java.io.*;
import java.util.Scanner;

public class LabExam3
{
	public static void main(String[] args)
	{
		Currency a = new Currency("Alice", "Smith");
		Currency b = new Currency("Bob", "Jones");
		Currency c = new Currency("Charlie", "Biden");

		//Buy
		System.out.println("Customer 1 purchase - 25 bitcoins");
		a.buy(25);
		System.out.print("\n");

		//Buy
		System.out.println("Customer 2 purchase - 80 bitcoins");
		a.buy(80);
		System.out.print("\n");

		//Buy
		System.out.println("Customer 3 purchase - 25 bitcoins");
		a.buy(30);
		System.out.print("\n");

		System.out.println("Show Transaction count:");
		Currency.showTransactionCount();

		System.out.println("\nTo string method testing:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("Number of bitcoin left in stock:");
		Currency.showBitcoin();

	}
}