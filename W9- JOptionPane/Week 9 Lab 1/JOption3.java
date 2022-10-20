// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JOption3
{
	public static void main(String[] args)
	{
		//Declare variables
		String name;

		//Create an object of the class Scanner
		Scanner keyboard = new Scanner(System.in);

		//Ask user to input name
		System.out.print("Enter your name: ");
		name=keyboard.next();

		JOptionPane.showMessageDialog(null, "Hello " + name + "\n\nWelcome to the Program!");
	}
}