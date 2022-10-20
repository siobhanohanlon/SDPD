import java.util.Scanner;

public class LabExam1_Solution1 {
	public static void main(String[] args){
			//Declare Instance of Scanner
			Scanner keyboard = new Scanner(System.in);

			//Declare Variables
			int menuChoice;
			short counter = 0;
			double miles, kilometers, celsius, farenheit, inches, millimeter;
			float euros, sterling;
			String output="", keepRunning = "Yes", name;

			//INITIAL OUTPUT
			System.out.println("\t\t    ======================================");
			System.out.println("\t\t             JAVA MULTI-CONVERTOR");
			System.out.println("\t\t    ======================================\n\n");

			//MENU OUTPUT
			System.out.println("\t********************** MENU ******************************");
			System.out.println("\t*                                                        *");
			System.out.println("\t*    Choose from one of the following menu options:      *");
			System.out.println("\t*                                                        *");
			System.out.println("\t*    1. Convert Distance: \tMiles to Kilometers      *");
			System.out.println("\t*    2. Convert Distance: \tKilometers to Miles      *");
			System.out.println("\t*    3. Convert Temperature: \tCelsius to Farenheit     *");
			System.out.println("\t*    4. Convert Temperature: \tFarneheit to Celsius     *");
			System.out.println("\t*    5. Convert Length: \tInches to millimeters    *");
			System.out.println("\t*    6. Convert Length: \tmillimeters to inches    *");
			System.out.println("\t*    7. Convert Finance: \tEuros to Sterling 	 *");
			System.out.println("\t*    8. Convert Finance: \tSterling to Euros 	 *");
			System.out.println("\t*                                                        *");
			System.out.println("\t**********************************************************");

			//Do while loop to run until keepRunning is no longer valid or counter is greater than 3
			do
			{

					//Prompt user for option
					System.out.print("\n\nEnter option (1 to 8): ");
					menuChoice = keyboard.nextInt(); //User enters number

					switch(menuChoice)
					{
							case 1: //If user entered number 1 ...
								System.out.println("\t\t1. Convert Miles to Kilometers"); //Output to console
								System.out.print("\t\t\tEnter Miles: "); //Request user to input miles
								miles = keyboard.nextDouble(); //Scanner input of double
								System.out.print("\t\t" + miles + " miles is " + (miles*1.609) + " in kilometers \n"); //Output result to console using formula
								output = output + "\t" + miles + " miles is " + (miles*1.609) + " kilometers\n"; //Concatenate the result to the "output" varible (it is initialised as empty string on line 13)

								/*
								A longer alternative that would work could utilize 3 different variables, eg., history1, history2 and history3

									if(counter == 1)
									{
										history1 = "\t" + miles + " miles is " + (miles*1.609) + " kilometers\n";
									} else if(counter == 2)
									{
										history2 = "\t" + miles + " miles is " + (miles*1.609) + " kilometers\n";
									} else
									{
										history3 = "\t" + miles + " miles is " + (miles*1.609) + " kilometers\n";
									}
								The 3 history variables could then be output at the end, in order
								*/

								counter++; //Increment the counter
								break;

							case 2: //If 2 is entered...
								System.out.println("\t\t2. Convert Kilometers to Miles");
								System.out.print("\t\t\tEnter Kilometers: ");
								kilometers = keyboard.nextDouble();
								System.out.print("\t\t" + kilometers + " kilometers is " + (kilometers/1.609344) + " miles \n");
								output = output + "\t" + kilometers + " kilometers is " + (kilometers/1.609344) + " miles\n";
								counter++;
								break;

							case 3: //If 3 is entered...
								System.out.println("\t\t3. Convert Celsius to Farenheit");
								System.out.print("\t\t\tEnter temperature in Celsius: ");
								celsius = keyboard.nextDouble();
								System.out.print("\t\t" + celsius + " degrees celsius is " + ((celsius*1.8)+32) + " degrees farenheit \n");
								output = output + "\t" + celsius + " degrees celsius is " + ((celsius*1.8)+32) + " degrees farenheit\n";
								counter++;
								break;

							case 4: //If 4 is entered...
								System.out.println("\t\t4. Convert Farenheit to Celsius");
								System.out.print("\t\t\tEnter temperature in Farenheit: ");
								farenheit = keyboard.nextDouble();
								System.out.print("\t\t" + farenheit + " degrees farenheit is " + ((farenheit-32)/1.8) + " degrees celsius\n");
								output = output + "\t" + farenheit + " degrees farenheit is " + ((farenheit-32)/1.8) + " degrees celsius\n";
								counter++;
								break;

							case 5: //If 5 is entered...
								System.out.println("\t\t5. Convert inches to millimeters");
								System.out.print("\t\t\tEnter measurement in inches: ");
								inches = keyboard.nextDouble();
								System.out.printf("\t\t%,.1f inches is %,.1f in millimeters\n", inches, (inches*25.4));
								output = output + "\t" + inches + " inches is " + (inches*25.4) + " millimeters \n";
								counter++;
								break;

							case 6: //If 6 is entered...
								System.out.println("\t\t6. Convert millimeters to inches");
								System.out.print("\t\t\tEnter measurement in millimeters: ");
								millimeter = keyboard.nextDouble();
								System.out.printf("\t\t%,.1f millimeters is %,.1f in inches\n", millimeter, (millimeter/25.4));
								output = output + "\t" + millimeter + " millimeters is " + (millimeter/25.4) + " inches\n";
								counter++;
								break;

							case 7: //If 7 is entered...
								System.out.println("\t\t7. Convert Euros to Sterling");
								System.out.print("\t\t\tEnter value in Euros: ");
								euros = keyboard.nextFloat();
								System.out.printf("\t\t%,.2f Euros is %,.2f in Sterling \n", euros, (euros*0.897234f));
								output = output + "\t" + euros + " Euros is " + (euros*0.897234f) + " Sterling \n";
								counter++;
								break;

							case 8: //If 8 is entered...
								System.out.println("\t\t8. Convert Sterling to Euros");
								System.out.print("\t\t\tEnter value in Sterling: ");
								sterling = keyboard.nextFloat();
								System.out.printf("\t\t%,.2f Sterling is %,.2f in Euros\n", sterling, (sterling*1.11454f));
								output = output + "\t" + sterling + " Sterling is " + (sterling*1.11454f) + " Euros\n";
								counter++;
								break;

							default: //If anything other than 1 to 8 is entered...
								System.out.println("\t\tThat's not a valid option. Choose from options 1 to 8.\n");
								break;
					} //end of switch



					//If number of calcualtions is less than 3, prompt the user if they would like to perform another calculation.
					if(counter < 3)
					{
						System.out.print("\n\nContinue? Enter Yes: ");
						keyboard.nextLine(); //Clear the buffer
						keepRunning = keyboard.nextLine();
					}


			}while(keepRunning.equalsIgnoreCase("yes") && counter <3); //End of do while loop - If the user typed in "Yes" and the counter is less than 3, keep running


			//Output at end of program
			System.out.print("\nCalculations complete!\n");


			//Prompt user to enter name
			System.out.print("\nEnter your name: ");
			name = keyboard.next();


			//Output message to user with all caps using printf %S
			System.out.printf("\n\n\n\tEND OF PROGRAM REACHED %S!\n", name);


			//Output count of calculations
			System.out.printf("\tThere were %d calculations in total. \n", counter);


			//Output the calculation summary with the name
			System.out.println("\t" + name + ", the Calculations were: ");


			//This will output the contents of the "output" variable.
			//Each time a calculation was performed, content was added to this variable (See lines 13, 51, 77, 87, 95, 104, 113, 122, 131)
			System.out.printf("%s \n\n\t", output);

	}
}