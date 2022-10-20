// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import java.util.Random;
import javax.swing.JOptionPane;

public class JOption9
{
	public static void main(String[] args)
	{
		//Create Random Class
		Random randomNumber = new Random();

		//Declare Variables
		String name;
		int playernum, dealernum, count=0, i;

		//Ask user for name
		name = JOptionPane.showInputDialog(null, "Enter your Name: ");

		for (i=1; i<=10; i++)
		{
			JOptionPane.showMessageDialog(null,"Rolling the Dice.....");

			playernum= randomNumber.nextInt(6) + 1;
			dealernum= randomNumber.nextInt(6) + 1;

			if (playernum>dealernum)
			{
				JOptionPane.showMessageDialog(null,"YOU WIN!!!!!!!!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
				count++;
			}
			else if (playernum<dealernum)
			{
				JOptionPane.showMessageDialog(null,"YOU LOSE!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Winner!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
			}
		}

		JOptionPane.showMessageDialog(null,"You won "+count+" games!");
	}
}
