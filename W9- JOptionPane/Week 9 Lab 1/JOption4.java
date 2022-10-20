// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import javax.swing.JOptionPane;

public class JOption4
{
	public static void main(String[] args)
	{
		//Declare variables
		String name;

		//Ask user to input name
		name = JOptionPane.showInputDialog(null, "Enter your Name: ");

		JOptionPane.showMessageDialog(null, "Hello " + name +"\n\nThis was created using swing!");
	}
}