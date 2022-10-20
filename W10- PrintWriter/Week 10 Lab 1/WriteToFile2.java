// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile2
{
	public static void main(String [] args) throws IOException
	{
		String name;

		name = JOptionPane.showInputDialog("Enter your File Name: ");
		PrintWriter outputFile = new PrintWriter(name);

		outputFile.println("This is Java!");
		outputFile.close();
	}
}