// Siobhan O Hanlon, G00389108
//27 April 2021
//SiobhanHanlonLabExam4

public class MemberClass
{
	// Declare class Attributes
	private String firstName, lastName, randomID, memberID, memberS;
	private char type;
	private int num=101, extraFee;

	//Static Variables
	private static int sMembers=0, pMembers=0;
	private static double totalFees=0.0;
	//private static;

	//2 Argument Constructor
	public MemberClass(String f, String l)
	{
		firstName= f;
		lastName= l;
		type= 's';
		memberID= randomID;
		totalFees+= 40.00;
		sMembers+= 1;
	}

	//3 Argument Constructor
	public MemberClass(String f, String l, char p)
	{
		firstName= f;
		lastName= l;
		type= p;
		memberID= randomID;
		totalFees+= 52.50;
		pMembers+=1;
	}

	//Change Type
	public void changeType()
	{
		if(type == 's')
		{
			type = 'p';
			totalFees+= 15.00;
			pMembers+=1;
			sMembers-=1;
		}

		if(type == 'p')
		{
			type = 's';
			sMembers+=1;
			pMembers-=1;
		}
	}

//Set Methods
	//Generate ID this wasnt working and wouldnt set it for the string method
	//have this part included in the string method due to this
	/*public void setID()
	{
		//Generate Member ID
		randomID= ("G"+num);
		num++;
	}*/

	//Membership Type
	public void setType()
	{
		if(type=='p')
		{
			memberS= "Premium";
		}
		else if (type=='s')
		{
			memberS= "Standard";
		}
	}

	//First Name
	public void setFirstName(String f)
	{
		firstName= f;
	}

	//Last Name
	public void setLastName(String l)
	{
		lastName= l;
	}

	//Member ID
	public void setMemberID(String id)
	{
		memberID= id;
	}

//Get Methods
	//ID
	public String getID()
	{
		return randomID;
	}

	//Type
	public String getType()
	{
		return memberS;
	}

	//First Name
	public String getFirstName()
	{
		return firstName;
	}

	//Last Name
	public String getLastName()
	{
		return lastName;
	}

	//Member ID
	public String getMemberID()
	{
		return memberID;
	}

	//Total Fees
	public static double getTotalFees()
	{
		return totalFees;
	}


	//To String
	public String toString()
	{
		//Create a String Representing the Object
		String str= "\n----  MEMBER DETAILS  ----";
		str+= "\nName: "+firstName+" "+lastName;
		str+= "\nMember ID: "+("G"+num);
		str+= "\nMembership Type: "+memberS;
		str+= "\n--------------------------";
		num++;

		return str;
	}

//Static Methods
	//Gym Report
	public static void gymReport()
	{
		System.out.println("\n--------- GYM REPORT ---------");
		System.out.println("Standard Members: "+sMembers);
		System.out.println("Preumium Members: "+pMembers);
		System.out.println("Total Members: "+(sMembers+pMembers));
		System.out.println("Total Fees Collected: "+totalFees);
	}

	//Annual Report
	public static void annualReport()
	{
		System.out.println("\n--------- ANNUAL REPORT ---------");
		System.out.println("TOTAL FEES COLLECTED IN 12 MONTHS:");
		System.out.println("EUR "+(totalFees*12));
	}

	//Opening Hours
	public static void openingHours()
	{
		System.out.println("\n**************************");
		System.out.println("Welcome to the Java Gym");
		System.out.println("Opening Hours are:");
		System.out.println("Monday to Friday: 7am to 10pm");
		System.out.println("Saturdays and Sundays: 9am to 8pm");
		System.out.println("\n**************************");
	}
}