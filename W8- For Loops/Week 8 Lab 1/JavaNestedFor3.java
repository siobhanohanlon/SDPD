// Siobhan O Hanlon, G00389108
// Week 8-Lab 1-For Loop

public class JavaNestedFor3
{
	public static void main(String[] args )
	{
		//Outer loop will run 5 times
		for (int i=1; i<=6; i++)
		{
			//Inner for loop will run 10 times
			//Outputting ********** each time it runs
			for(int x=1; x<=i; x++)
			{
				System.out.print("*");
			}

			//This will output a new-line character
			System.out.print("\n");
		}
	}
}