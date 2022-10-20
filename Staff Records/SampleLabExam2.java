import java.util.Scanner;

public class SampleLabExam2 {

    public static void main(String[] args) {

        int  account;
        char type,reCheck;
        double balance, deposit, newBalance;

        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter account number: ");
            account = keyboard.nextInt();

            System.out.print("Enter account type (S or C): ");
            type = keyboard.next().charAt(0);

            while(type != 's' && type != 'S' && type != 'c' && type != 'C')
            {
                System.out.print("Incorrect character was entered please enter S or C: ");
                type = keyboard.next().charAt(0);
            }

            System.out.print("Enter existing balance: ");
            balance = keyboard.nextDouble();

            System.out.print("Enter Deposit:  ");
            deposit = keyboard.nextDouble();

            newBalance = balance + deposit;

            if(balance > 3000)
            {
                newBalance = newBalance + 25;
            }


            System.out.println("______________________BANK OF JAVA ACCOUNT MANAGEMENT____________________________________________");
            System.out.println("Acc no.\t\tType \t Deposit \t\t Previous Balance \t\t New Balance");
            System.out.printf("%d \t\t%c \t  %.2f \t\t %.2f \t\t\t %.2f \n",account,type,balance,deposit,newBalance);
            System.out.println("_________________________________________________________________________________________________\n");

            if(balance > 3000)
            {
                System.out.println("BANK OF JAVA BONUS: You have received an additional 25 euro bonus to your account!\n");
                System.out.printf("NEW CURRENT BALANCE IS %.2f\n\n",newBalance);
            }
            System.out.print("Check Another Account?: ");
            reCheck = keyboard.next().charAt(0);
        }while(reCheck == 'y');
    }
}
   /*  Scanner keyboard = new Scanner(System.in);
    System.out.print("Input password to enter: ");
    password = keyboard.next(); */