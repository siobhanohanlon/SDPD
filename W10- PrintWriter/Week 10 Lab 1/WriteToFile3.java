// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile3
{
	public static void main(String [] args) throws IOException
	{
		String name, text;

		name = JOptionPane.showInputDialog("Enter your File Name: ");
		text = JOptionPane.showInputDialog("Enter File Content: ");

		PrintWriter outputFile = new PrintWriter(name);

		outputFile.println(text);
		outputFile.close();
	}
}