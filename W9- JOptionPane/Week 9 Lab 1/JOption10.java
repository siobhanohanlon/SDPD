// Siobhan O Hanlon, G00389108
// Week 9- Lab 1-JOptionPane

import java.util.Random;
import javax.swing.JOptionPane;

public class JOption10
{
	public static void main(String[] args)
	{
		//Create Random Class
		Random randomNumber = new Random();

		//Declare Variables
		String name, input;
		int playernum, dealernum, count=0, cash=100, bet;

		//Ask user for name
		name = JOptionPane.showInputDialog(null, "Enter your Name: ");

		JOptionPane.showMessageDialog(null,"Greetings "+name+"Welcome to Roll the Dice!\n\nYou will start with €100 in your wallet!\n\nThe game ends when you are broke, or when you have doubled your money to €200.\n\nGood Luck!");

		do
		{
			input= JOptionPane.showInputDialog(null, "Place you Bet(1-"+cash+"):");
			bet=Integer.parseInt(input);

			JOptionPane.showMessageDialog(null,"Rolling the Dice.....");

			playernum= randomNumber.nextInt(6) + 1;
			dealernum= randomNumber.nextInt(6) + 1;

			if (playernum>dealernum)
			{
				JOptionPane.showMessageDialog(null,"YOU WIN!!!!!!!!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
				count++;
				cash= cash+bet;
			}
			else if (playernum<dealernum)
			{
				JOptionPane.showMessageDialog(null,"YOU LOSE!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
				cash= cash-bet;
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Winner!\n\nThe Dealer rolled a "+dealernum+"\n\n"+name+" rolled a "+playernum);
			}
			JOptionPane.showMessageDialog(null,"You now have "+cash+" Euros left....");

		}while(cash >0 && cash <200);

		JOptionPane.showMessageDialog(null,"You won "+count+" games!");
	}
}
