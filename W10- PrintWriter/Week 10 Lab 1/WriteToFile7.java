// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7
{
	public static void main(String [] args) throws IOException
	{
		String name, text, start, end;
		int startnum, endnum, choose1, choose2;

		name = JOptionPane.showInputDialog("Enter your File Name: ","File5.txt");
		start = JOptionPane.showInputDialog("Enter your File Name: ","50");
		startnum = Integer.parseInt(start);
		end = JOptionPane.showInputDialog("Enter your File Name: ","100");
		endnum = Integer.parseInt(end);

		PrintWriter outputFile = new PrintWriter(name);

		choose1 = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null,"Output to Screen?: ");

		if(choose1 == 0)
		{
			do
			{
				text = "Count: "+startnum;
				System.out.println(text);
				startnum++;
			}while(startnum<=endnum);
		}

		choose2 = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null,"Output to File?: ");

		if(choose2 == 0)
		{
			do
			{
				text = "Count: "+startnum;
				outputFile.println(text);
				startnum++;
			}while(startnum<=endnum);
			outputFile.close();
		}


	}
}
