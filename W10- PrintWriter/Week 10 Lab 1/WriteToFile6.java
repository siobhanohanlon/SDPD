// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile6
{
	public static void main(String [] args) throws IOException
	{
		String name, text, inputloop;
		int linenum, count=0, choose;

		name = JOptionPane.showInputDialog("Enter your File Name: ","File4.txt");
		choose = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null,"Would you like to overwrite existing file content?");

		if(choose == 0)
		{
			PrintWriter outputFile = new PrintWriter(name);
			text = JOptionPane.showInputDialog("Enter File Content for line: ");
			outputFile.println(text);
			outputFile.close();
		}
		else
		{
			FileWriter fwriter = new FileWriter(name,true);
			PrintWriter outputFile = new PrintWriter(fwriter);
			text = JOptionPane.showInputDialog("Enter File Content for line: ");
			outputFile.println(text);
			outputFile.close();
		}
	}
}
