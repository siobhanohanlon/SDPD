// Siobhan O Hanlon, G00389108
// Week 10- Lab 1-PrintWriter

import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile8
{
	public static void main(String [] args) throws IOException
	{
		String name, surname, occupation, birthYear, birthMonth, month="", fileName;
		int year, monthnum, age,choose;

		do
		{

			name = JOptionPane.showInputDialog("Enter First Name: ");
			surname = JOptionPane.showInputDialog("Enter Surname: ");
			occupation = JOptionPane.showInputDialog("Enter Occupation: ");
			birthYear = JOptionPane.showInputDialog("Year of Birth: ");
			year = Integer.parseInt(birthYear);
			birthMonth = JOptionPane.showInputDialog("Month of Birth(1-12): ");
			monthnum = Integer.parseInt(birthMonth);

			age=2020-year;

			if (monthnum == 1)
			{
				month="January";
			}
			else if (monthnum == 2)
			{
				month="February";
			}
			else if (monthnum == 3)
			{
				month="March";
			}
			else if (monthnum == 4)
			{
				month="April";
			}
			else if (monthnum == 5)
			{
				month="May";
			}
			else if (monthnum == 6)
			{
				month="June";
			}
			else if (monthnum == 7)
			{
				month="July";
			}
			else if (monthnum == 8)
			{
				month="August";
			}
			else if (monthnum == 9)
			{
				month="September";
			}
			else if (monthnum == 10)
			{
				month="October";
			}
			else if (monthnum == 11)
			{
				month="November";
			}
			else if (monthnum == 12)
			{
				month="December";
			}

			fileName= surname+" - "+name+".txt";
			PrintWriter outputFile = new PrintWriter("PERSONNEL FILES/"+fileName);

			outputFile.println("========= PERSONNEL FILE =========");
			outputFile.println("NAME: "+name+" "+surname);
			outputFile.println("==================================");
			outputFile.println("DATE OF BIRTH: "+month+", "+year);
			outputFile.println("AGE: "+age);
			outputFile.println("==================================");
			outputFile.println("OCCUPATION: "+occupation);
			outputFile.println("==================================");

			outputFile.close();

			JOptionPane.showMessageDialog(null,"File Generated: "+fileName);

			choose = JOptionPane.YES_NO_OPTION;
			JOptionPane.showConfirmDialog(null,"Add Another Employee? ");
		}while(choose == 0);

		JOptionPane.showMessageDialog(null,"Data Entry Complete!");
	}
}
