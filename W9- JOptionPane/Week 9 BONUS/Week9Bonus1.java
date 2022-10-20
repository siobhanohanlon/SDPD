// Siobhan O Hanlon, G00389108
// Week 9- BONUS1-JOptionPane

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Week9Bonus1
{
	public static void main(String[] args)
	{
		//Declare Instance of Scanner
		Scanner keyboard = new Scanner(System.in);

		//Declare Variables
		int menuChoice;
		short counter = 0;
		double output, cal;
		float outputMoney;
		String menuOutput, menuInput, optionInput;

		//INITIAL OUTPUT
		JOptionPane.showMessageDialog(null, "======================================\n      JAVA MULTI-CONVERTOR\n======================================\n\n","LAB EXAM 1", JOptionPane.PLAIN_MESSAGE);

		//Do while loop to run until keepRunning is no longer valid or counter is greater than 3
		do
		{
			//MENU OUTPUT
			menuOutput= "********************** MENU ******************************\n\n\tChoose from one of the following menu options:"
			+"\n\n\t1. Convert Distance: Miles to Kilometers\n\t2. Convert Distance: Kilometers to Miles\n\t3. Convert Temperature: Celsius to Farenheit\n\t4. Convert Temperature: Farneheit to Celsius"
			+"\n\t5. Convert Length: Inches to Millimeters\n\t6. Convert Length: Millimeters to Inches\n\t7. Convert Finance: Euros to Sterling\n\t8. Convert Finance: Sterling to Euros\n\n*********************************************************";
			menuInput=JOptionPane.showInputDialog(null,menuOutput+"\n\nEnter Option(1-8):");
			menuChoice=Integer.parseInt(menuInput);

			switch(menuChoice)
			{
				case 1:
					optionInput=JOptionPane.showInputDialog(null,"Enter Miles: ");
					output = Double.parseDouble(optionInput);
					cal= output*1.609;
					JOptionPane.showMessageDialog(null,output+" Miles is "+cal+" in Kilometers");
					counter++;
					break;

				case 2:
					optionInput=JOptionPane.showInputDialog(null,"Enter Kilometers: ");
					output = Double.parseDouble(optionInput);
					cal= output/1.609344;
					JOptionPane.showMessageDialog(null,output+" Kilometers is "+cal+" in Miles");
					counter++;
					break;

				case 3:
					optionInput=JOptionPane.showInputDialog(null,"Enter Temperature in Celsius: ");
					output = Double.parseDouble(optionInput);
					cal= ((output*1.8)+32);
					JOptionPane.showMessageDialog(null,output+" Celsius is "+cal+" in Farenheit");
					counter++;
					break;

				case 4:
					optionInput=JOptionPane.showInputDialog(null,"Enter temperature in Farenheit: ");
					output = Double.parseDouble(optionInput);
					cal= ((output-32)/1.8);
					JOptionPane.showMessageDialog(null,output+" Farenheit is "+cal+" in Celsius");
					counter++;
					break;

				case 5:
					optionInput=JOptionPane.showInputDialog(null,"Enter measurement in Inches: ");
					output = Double.parseDouble(optionInput);
					cal= (output*25.4);
					JOptionPane.showMessageDialog(null,output+" Inches is "+cal+" in Millimeters");
					counter++;
					break;

				case 6:
					optionInput=JOptionPane.showInputDialog(null,"Enter measurement in Millimeters: ");
					output = Double.parseDouble(optionInput);
					cal= (output/25.4);
					JOptionPane.showMessageDialog(null,output+" Millimeters is "+cal+" in Inches");
					counter++;
					break;

				case 7:
					optionInput=JOptionPane.showInputDialog(null,"Enter value in Euros: ");
					outputMoney = Float.parseFloat(optionInput);
					cal= (outputMoney*0.897234f);
					JOptionPane.showMessageDialog(null,outputMoney+" Euros is "+cal+" in Sterling");
					counter++;
					break;

				case 8:
					optionInput=JOptionPane.showInputDialog(null,"Enter value in Sterling: ");
					outputMoney = Float.parseFloat(optionInput);
					cal= (outputMoney*1.11454f);
					JOptionPane.showMessageDialog(null,outputMoney+" Sterling is "+cal+" in Euros");
					counter++;
					break;

				default:
					JOptionPane.showMessageDialog(null,"That's not a valid option. Choose from options 1 to 8.");
					break;
			}
		}while(counter <3);
	}
}