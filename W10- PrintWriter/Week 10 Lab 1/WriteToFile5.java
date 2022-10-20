// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile5
{
	public static void main(String [] args) throws IOException
	{
		String name, text, inputloop;
		int linenum, count=0;

		name = JOptionPane.showInputDialog("Enter your File Name: ");

		inputloop = JOptionPane.showInputDialog("How Many lines of text would you like to add? ");
		linenum = Integer.parseInt(inputloop);

		PrintWriter outputFile = new PrintWriter(name);

		do
		{
			++count;
			text = JOptionPane.showInputDialog("Enter File Content for line "+count+" : ");
			outputFile.println(text);
		}while(count<linenum);

		outputFile.close();
	}
}
