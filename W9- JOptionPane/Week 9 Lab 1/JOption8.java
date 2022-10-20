// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import javax.swing.JOptionPane;

public class JOption8
{
	public static void main(String[] args)
	{
		//Declare variables
		int numamount, count=0;
		String inputloop, input = "", output;
		Double num, average, total=0.0;

		inputloop=JOptionPane.showInputDialog(null, "How many numbers do you wish to enter: ");
		numamount = Integer.parseInt(inputloop);

		do
		{
			count++;
			input= JOptionPane.showInputDialog(null, "Enter Number " + count + " :");
			num = Double.parseDouble(input);
			total= total +num;
		}while(count<numamount);

		average= total/numamount;
		JOptionPane.showMessageDialog(null, "The Average was " + average + "\n\nYou input " + count + " Numbers.","DISPLAY AVERAGE", JOptionPane.PLAIN_MESSAGE);
	}
}
