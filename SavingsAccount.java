package assignment1;

public class SavingsAccount {
	static double annualInterestRate;
    double savingsBalance;
		public SavingsAccount(double IntRate, double savBal) {
			annualInterestRate = IntRate;
			savingsBalance = savBal;
	}
    double calculateMonthlyInterest()
	{
		double IntRate=(savingsBalance*annualInterestRate/12);
		savingsBalance=savingsBalance+IntRate;
		return IntRate;
	}
    public static void modifyInterestRate(double newIntRate)
    {
        annualInterestRate=newIntRate;	
    }
    void setSavingsBalance(double newBal)
    {
    	savingsBalance=newBal;
    }
    double getSavingsBalance()
    {
    	return savingsBalance;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SavingsAccount saver1=new SavingsAccount(0.04,2000.00);
    SavingsAccount saver2=new SavingsAccount(0.04,3000.00);
    
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("New Balance for Saver1:"+saver1.getSavingsBalance());
    System.out.println("New Balance for Saver2:"+saver2.getSavingsBalance());

    SavingsAccount.modifyInterestRate(0.05);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("New Balance for Saver1:"+saver1.getSavingsBalance());
    System.out.println("New Balance for Saver2:"+saver2.getSavingsBalance());

	}

}
