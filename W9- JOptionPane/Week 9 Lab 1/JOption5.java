// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import javax.swing.JOptionPane;

public class JOption5
{
	public static void main(String[] args)
	{
		//Declare variables
		String firstName, surName, address;

		//Ask user to input
		firstName = JOptionPane.showInputDialog(null, "Enter your First Name: ");
		surName = JOptionPane.showInputDialog(null, "Enter your Surname: ");
		address = JOptionPane.showInputDialog(null, "Enter your Address: ");

		JOptionPane.showMessageDialog(null, "First Name: "+firstName +"\nSurname: "+surName+"\n**************************\nAddress: "+address);
	}
}