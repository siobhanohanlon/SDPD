// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import javax.swing.JOptionPane;

public class JOption7
{
	public static void main(String[] args)
	{
		//Declare variables
		Double num1,num2, cal;
		String input1, input2, input3, output=" ";
		char operator;

		//Ask user to input numbers
		input1= JOptionPane.showInputDialog(null, "Enter First Number: ");
		num1 = Double.parseDouble(input1);
		input2= JOptionPane.showInputDialog(null, "Enter Second Number: ");
		num2 = Double.parseDouble(input2);
		input3= JOptionPane.showInputDialog(null, "Enter Operator(A,S,D or M - or type Exit to end):");
		operator = input3.charAt(0);

		if (operator == 'a')
		{
			cal=num1+num2;
			output= num1 + " plus " + num2 + " = " +cal;
		}
		else if (operator == 's')
		{
			cal=num1-num2;
			output= num1 + " minus " + num2 + " = " +cal;
		}
		else if (operator == 'd')
		{
			cal=num1/num2;
			output= num1 + " divided by " + num2 + " = " +cal;
		}
		else if (operator == 'm')
		{
			cal=num1*num2;
			output= num1 + " multiple " + num2 + " = " +cal;
		}
		else
		{
			System.exit(0);
		}

		JOptionPane.showMessageDialog(null, "First Number Entered: " + num1 +"\nSecond Number Entered: "+num2+"\n"+output);
	}
}