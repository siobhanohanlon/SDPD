// Siobhan O Hanlon, G00389108, 15/12/2020
// Week 11- Lab Exam 2

import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;

public class SiobhanOHanlonLabExam2
{
	public static void main(String[] args) throws IOException
	{
		//Create Random Number Instance
		Random randomNumber = new Random();

		//Declare Variables
		String name, surname, nightsStayed, invoiceNum, fileName, convertExtra, logFile, finalOutput="";
		String openMessage, infoMessage, invoiceTxt, extraMessage, extrasTxt1, extrasTxt2, loyaltyMessage, totalTxt1, anotherGMessage;
		int stayed, randomNum1, extrasYesNo, loyaltyYesNo, anotherYesNo, count=0;
		double cost, totalIncEx=0, extra, loyaltyDis, totalCost, finalTotal, customerTotal=0;
		double runningCost, fixedCost, profit;

		//Output Message at Beginning
		openMessage= "\n\n\n\nWelcome to the\n------------------------\nJAVA\nHOTEL\n------------------------"+
		"\n\nGUEST CHECKOUT\nBILLING SYSTEM\n------------------------\n\n";
		JOptionPane.showMessageDialog(null,openMessage);

		//RandomNumber
		randomNum1= randomNumber.nextInt(501) + 5000;

		//Log File
		PrintWriter outputFile = new PrintWriter("INVOICES/"+"LOGFILE.txt");
		outputFile.println("LOG FILE RECORD OF INVOICES PROCESSED:\n");
		outputFile.close();

		do{
			//Input into Input Dialog
			name = JOptionPane.showInputDialog("Enter First Name: ");
			surname = JOptionPane.showInputDialog("Enter Surname: ");
			nightsStayed = JOptionPane.showInputDialog("How Many Nights was your stay? ");
			stayed = Integer.parseInt(nightsStayed);

			//Calculate Cost
			switch (stayed)
			{
				case 1:
					cost = 100;
					break;
				case 2:
					cost = 180;
					break;
				case 3:
					cost = 240;
					break;
				case 4:
					cost = 280;
					break;
				default: //5 or more
					cost = (stayed*70);
					break;
			}
			totalIncEx=totalIncEx+cost;

			//Generate Invoice Number using Random Class
			invoiceNum= ("JH-"+(randomNum1+count));

			//Message of Information
			infoMessage="\n\n------------------------\nJAVA\nHOTEL\n------------------------"+
			"\nBooking System\n\nNAME: "+name+" "+surname+"\n\nNIGHTS: "+stayed+
			"\n\nTOTAL COST: "+cost+"\n\nINVOICE NUMBER: "+invoiceNum+"\n";
			JOptionPane.showMessageDialog(null,infoMessage);

			//Message of saving Invoice
			fileName= name+surname+".txt";
			JOptionPane.showMessageDialog(null,"Creating Invoice for this Stay...\n\nFILENAME: "+fileName);

			//Save Invoice to TextFile
			new PrintWriter("INVOICES/"+ fileName);
			invoiceTxt = "\n----------------------- THE JAVA HOTEL -----------------------\n"+
			"---------------------- CUSTOMER INVOICE ----------------------\n"+
			"\nINVOICE NUMBER: "+invoiceNum+"\nNAME: "+name+" "+surname+
			"\nSTAY DURATION: "+stayed+" Nights"+"\n\nCOST: EUR "+ cost+
			"\n          ------";
			outputFile.println(invoiceTxt);
			outputFile.close();

			//Extra Charges Option
			//JOptionPane.YES_NO_OPTION;
			extraMessage= "\n\n\nADD EXTRAS PER NIGHT?\n(Drinks, Food, Room Service, Mini-Bar)\n";
			extrasYesNo= JOptionPane.showConfirmDialog(null,extraMessage,"Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);

			//Extra Charges
			if(extrasYesNo == 0)
			{
				//Amend File
				FileWriter fwriter = new FileWriter(fileName,true);
				extrasTxt1="\n\n------------------------ Extras ------------------------\n"+"EXTRAS:\n";
				outputFile.println(extrasTxt1);
				outputFile.close();
				for (int i=1; i<=stayed; i++)
				{
					convertExtra = JOptionPane.showInputDialog("Enter Extra Charges for Night "+i);
					extra = Double.parseDouble(convertExtra);
					//Amend File
					new FileWriter(fileName,true);
					extrasTxt2= "NIGHT "+i+" EXTRA\t\t"+extra;
					outputFile.println(extrasTxt2);
					outputFile.close();
					totalIncEx=totalIncEx+extra;
				}
				new FileWriter(fileName,true);
				totalTxt1= "TOTAL INC. EXTRAS:\t"+totalIncEx;
				outputFile.println(totalTxt1);
				outputFile.close();
			}

			else{}

			//Loyalty Card Option
			//JOptionPane.YES_NO_OPTION;
			loyaltyMessage= "\n\n\nDOES THE CUSTOMER HAVE A LOYALTY CARD?\n";
			loyaltyYesNo= JOptionPane.showConfirmDialog(null,loyaltyMessage,"Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);

			//Extra Charges
			loyaltyDis=(totalIncEx/100)*10;
			if(loyaltyYesNo == 0)
			{
				FileWriter fwriter = new FileWriter(fileName,true);
				outputFile.println("Less Loyalty Discount: - "+loyaltyDis);
				outputFile.close();
			}

			//Total
			finalTotal=(totalIncEx-loyaltyDis);
			FileWriter fwriter = new FileWriter(fileName,true);
			outputFile.println("\nFINAL TOTAL:\t\t"+finalTotal+"\n-----------------------------------------------");
			outputFile.close();

			//Another Guest
			anotherGMessage="\n\n\nINVOICE CREATED FOR "+name+" "+surname+"."+
			"\n\nWOULD YOU LIKE TO GENERATE ANOTHER INVOICE?\n";
			anotherYesNo= JOptionPane.showConfirmDialog(null,anotherGMessage,"Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
			count++;
			customerTotal=customerTotal+finalTotal;

			//LogFile Amend
			new FileWriter("LOGFILE.txt",true);
			outputFile.println("Invoice "+count+" -Invoice Number "+invoiceNum+" - Customer Name: "+name+" "+surname+" - Total Charge: "+finalTotal);
			outputFile.close();
			finalOutput+="\nInvoice "+count+" -Invoice Number "+invoiceNum+" - Customer Name: "+name+" "+surname+" - Total Charge: "+finalTotal;
		}while(anotherYesNo==0 && count<5);

		//Running Costs Calculations
		runningCost= customerTotal/2;
		fixedCost=250;
		profit=((customerTotal-runningCost)-fixedCost);

		//LogFile Amend
		FileWriter fwriter = new FileWriter("LOGFILE.txt",true);
		outputFile.println("\nTOTAL OF ALL STAYS:\t"+customerTotal);
		outputFile.println("\nRUNNING COSTS:\t\t"+runningCost+"\nFIXED COSTS:\t\t"+fixedCost+"\nPROFIT:\t\t\t"+profit+"\n");
		outputFile.close();

		//Completed Message
		JOptionPane.showMessageDialog(null,"PROGRAM COMPLETE!  LOGFILE GENERATED.\n");

		//Output to Console
		System.out.printf("INVOICES GENERATED IN THIS SESSION\n %s \n\nTOTAL OF ALL STAYS:\t%,.2f\n\nRUNNING COSTS:\t\t%,.2f\nFIXED COSTS:\t\t%,.2f\nPROFIT:\t\t\t%,.2f\n",finalOutput, customerTotal, runningCost, fixedCost, profit);
	}
}

//My files arent printint to text file and unsure as to why and didnt have time to proper investigate as from what i can see my code is correct