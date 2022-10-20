// Siobhan O Hanlon, G00389108, 10/12/2020
// Week 10- Sample Lab Exam

import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;

public class OHanlonSiobhanLabExam
{
	public static void main(String [] args) throws IOException
	{
		//Create Random Number Instance
		Random randomNumber = new Random();

		//Declare Variables
		String name, surname, startYear, wageSlip, fileName, wageSlipMonth, wageSlipMonthP1,wageSlipMonthP2, employeeID, consoleMonthString;
		int year, randomID, yesNo, yearDifference, generateFile, month, consoleMonth;
		double wage, monthWage, monthTax, newMonthWage, newMonthTax, totalPaid=0, totalTaxPaid=0, totalWageAfterTax=0;
		boolean detailsCorrect;

		//Output Message at Beginning
		JOptionPane.showMessageDialog(null,"Welcome to\n\nACME LIMITED\n\nEMPLOYEE PAYAROLL SYSTEM\n");

		//Input into Input Dialog
		name = JOptionPane.showInputDialog("Enter First Name: ");
		surname = JOptionPane.showInputDialog("Enter Surname: ");
		startYear = JOptionPane.showInputDialog("Enter Year of Employment Start: ");
		year = Integer.parseInt(startYear);

		//Generate Employee ID using Random Class
		randomID= randomNumber.nextInt(99999) + 100000;
		employeeID= ("G-"+randomID+"-"+year);

		//Calculate Wage
		yearDifference = 2020 - year;
		switch (yearDifference)
		{
			case 0:
				wage = 5000;
				break;
			case 1:
				wage = 6000;
				break;
			case 2:
				wage = 7000;
				break;
			case 3:
				wage = 8000;
				break;
			case 4:
				wage = 9000;
				break;
			case 5:
				wage = 10000;
				break;
			default: //6 or more
				wage = 15000;
		}

		//Calculations
		monthWage= wage/12;
		monthTax= monthWage*0.4;
		newMonthWage= monthWage-monthTax;
		totalPaid= totalPaid+monthWage;
		totalTaxPaid= totalTaxPaid+monthTax;
		totalWageAfterTax= totalWageAfterTax+newMonthWage;

		//Generate Wage Slip
		yesNo = JOptionPane.YES_NO_OPTION;
		wageSlip= "======================== WAGE SLIP ========================\n";
		wageSlip+= "NAME: "+name+" "+surname+"\n\nEmployee ID: "+employeeID;
		wageSlip+= "\n\n===========================================================";
		wageSlip+= "\n\nANNUAL WAGE: "+wage+"\n\n\n\n";
		JOptionPane.showConfirmDialog(null,wageSlip+"Are all details correct?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);

		if(yesNo == 0)
		{}

		else
		{
			detailsCorrect = true;
			do
			{
				name = JOptionPane.showInputDialog("CURRENT FIRST NAME: "+name+"\n\nAmend First Name: ");
				surname = JOptionPane.showInputDialog("CURRENT SURNAME: "+surname+"\n\nAmend Surname: ");
				yesNo = JOptionPane.YES_NO_OPTION;
				wageSlip= "======================== WAGE SLIP ========================\n";
				wageSlip+= "NAME: "+name+" "+surname+"\n\nEmployee ID: "+employeeID;
				wageSlip+= "\n\n===========================================================\n\n";
				wageSlip+= "ANNUAL WAGE: "+wage+"\n\n\n\n";
				JOptionPane.showConfirmDialog(null,wageSlip+"Are all details correct?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
				if(yesNo == 1)
				{detailsCorrect = true;}
				else
				{detailsCorrect = false;}
			}while(detailsCorrect = true);
		}

		//Generate to File
		generateFile = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null,"Would you like to Generate Wage Slip?");

		if(generateFile == 0)
		{
			for (int i=1; i<=12; i++)
			{
		//Wage Slip
				fileName= "PAYSLIP_"+surname+" - "+name+"MONTH_"+i+".txt";
				PrintWriter outputFile = new PrintWriter("WAGEFOLDER/"+ fileName);
				wageSlipMonth = "======================== WAGE SLIP ========================\n"+
				"NAME: "+name+" "+surname+"\n\nDATE: 01/01/2020\n\n\n==========================================================="+
				"\nANNUAL WAGE: "+wage+"\nMONTHLY WAGE: "+monthWage+"\nTAX THIS MONTH: "+monthTax+"WAGE AFTER TAX THIS MONTH: "+newMonthWage+
				"\n\n===========================================================\n\n\nTOTAL PAID after "+i+" Month(s): "+totalPaid+
				"TOTAL TAX PAID after "+i+" Month(s): "+totalTaxPaid+"\nTOTAL WAGE AFTER TAX PAID after "+i+" Month(s): "+totalWageAfterTax;
				outputFile.println(wageSlipMonth);
				outputFile.close();
			}

			//Generate to Console
			consoleMonthString = JOptionPane.showInputDialog("View Month on Console? (Enter 1-12 or type Exit to End)");
			if (consoleMonthString.equalsIgnoreCase("EXIT"))
			{
				System.exit(0);
			}
			else if (consoleMonthString.equals("1") || consoleMonthString.equals("2") || consoleMonthString.equals("3") || consoleMonthString.equals("4") || consoleMonthString.equals("5") || consoleMonthString.equals("6") || consoleMonthString.equals("7") || consoleMonthString.equals("8") || consoleMonthString.equals("9") || consoleMonthString.equals("10") || consoleMonthString.equals("11") || consoleMonthString.equals("12"))
			{
				consoleMonth = Integer.parseInt(consoleMonthString);
				totalPaid= monthWage*consoleMonth;
				totalTaxPaid= monthTax*consoleMonth;
				totalWageAfterTax= newMonthWage*consoleMonth;
				wageSlipMonthP1 = "======================== WAGE SLIP ========================\n"+"NAME: "+name+" "+surname+"\n\nDATE: 01/01/2020\n\n\n===========================================================";
				wageSlipMonthP2="\n\n===========================================================\n\n\n";

				System.out.printf("%s\nANNUAL WAGE: %,.2f\nMONTHLY WAGE: %,.2f\nTAX THIS MONTH: %,.2f\nWAGE AFTER TAX THIS MONTH: %,.2f",wageSlipMonthP1,wage,monthWage,monthTax,newMonthWage);
				System.out.printf("%sTOTAL PAID after %d Month(s): %,.2f\nTOTAL TAX PAID after %d Month(s): %,.2f\nTOTAL WAGE AFTER TAX PAID after %d Month(s): %,.2f\n\n",wageSlipMonthP2,consoleMonth,totalPaid,consoleMonth,totalTaxPaid,consoleMonth,totalWageAfterTax);
			}
			else
			{
				 JOptionPane.showMessageDialog(null,"Invalid option!","Message",JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}