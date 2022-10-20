// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import javax.swing.JOptionPane;

public class JOption6
{
	public static void main(String[] args)
	{
		//Declare variables
		int num1,num2, cal;
		String input1, input2;

		//Ask user to input numbers
		input1= JOptionPane.showInputDialog(null, "Enter First Number: ");
		num1 = Integer.parseInt(input1);
		input2= JOptionPane.showInputDialog(null, "Enter Second Number: ");
		num2 = Integer.parseInt(input2);

		//Calculation
		cal= num1+num2;

		JOptionPane.showMessageDialog(null, "First Number Entered: " + num1 +"\nSecond Number Entered: "+num2+"\n"+num1+" plus " + num2 + " = "+cal);
	}
}