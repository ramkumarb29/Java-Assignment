package assignment1;
import java.util.Scanner;

public class Account {
	double balance;
	public Account(double initialBalance)
	{
	if ( initialBalance > 0.0 )
	{
		balance = initialBalance;
	}
	}
	public void credit(double amount)
	{
	    balance = balance + amount;	
	} 

	public void debit(double amount)
	{
	if (amount > balance)
	{
		amount = 0.0;
		System.out.println( "Debit amount exceeded account balance." );
	}
	else
	{
	balance = balance - amount;
	}
	}
	public double getBalance()
	{
	return balance; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Account account1 = new Account(50.00); 

		
		System.out.println("Account balance:"+ account1.getBalance());

		double depositAmount; 

		System.out.print("Enter deposit amount for account: "); 
		depositAmount = input.nextDouble();
		account1.credit(depositAmount); 
		
		System.out.println("Account balance:"+ account1.getBalance());

		double withdrawalAmount;
		
		System.out.print("Enter withdrawal amount for account:"); 
		withdrawalAmount = input.nextDouble();
		account1.debit(withdrawalAmount);

		System.out.println("Account balance:"+account1.getBalance());
	}

}

