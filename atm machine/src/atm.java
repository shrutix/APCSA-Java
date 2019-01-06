//Shruti Janardhanan period 3
import java.util.Scanner;

public class atm {
	public static void main( String [] args)
	{
		System.out.println("Hi, welcome to our bank");
		
		int starter = 0;
		int password = 4678999;
		int cash = 5000;
		
		Scanner input = new Scanner(System.in);
		
		while(password != starter)
		{
			System.out.println("Type in your password");
			starter = input.nextInt();
			input.nextLine();
		}
		
		if (password == 4678999)
		{
			bank(cash);
		}
		else
		{
			input.close();
		}
		
	}
	
	public static void bank(int money)
	{
		int options;
		
		Scanner input = new Scanner(System.in);
		boolean actions = false;
		if (actions == true)
		{
			System.out.println("Do you want to....?");
			System.out.println("1. deposit money\n 2. withdraw money");
			options = input.nextInt();
			input.nextLine();
			
			if (options == 1)
			{
				System.out.println("Deposit amount?");
				options = input.nextInt();
				input.nextLine();
				
				money = deposit(money, options);
				balance(money);
			}
			else if (options == 2)
			{
				System.out.println("Withdraw amount?") ;
				options = input.nextInt();
				input.nextLine();
				
				money = withdraw(money, options);
				balance(money);
			}
			System.out.println("Thanks for visiting, press 8 to exit");
		}
		input.close();
	}
	
	public static int deposit(int first, int entered)
	{
		return first + entered;
	}
	
	public static int withdraw(int starting, int pull)
	{
		return starting - pull;
	}
	public static void balance(int value)
	{
		System.out.println("your balance is" + " " + "$" + value);
	}
	
	

}
