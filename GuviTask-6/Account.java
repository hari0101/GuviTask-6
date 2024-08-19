package guvitaskjat6;

/*
  4. Create a class Account class with all necessary parameters as data member. 
  Create twoconstructors (no argument, and two arguments) and methods to withdraw and deposit balance & check balance.
*/

public class Account {

	//Main method
	public static void main(String[] args) {
		
		//Initialized the object to invoke the method.
		Account customer1 = new Account();

		//Invoking all the default details from the default constructor at begining
		System.out.println("Account Balance of the customer1 : " + customer1.getAccountBalance());
		System.out.println("Withdrawl amount : " + customer1.getWithDraw());
		System.out.println("Deposited amount : " + customer1.getDeposit());
		System.out.println("Check Balance after Withdrawl & Deposit : " + customer1.getCheckbalance());
		
		System.out.println(); //Line
		//Initializing the new object to pass the arguments in constructor.
		Account customer2 = new Account(30_000,26_000);
		System.out.println("Account Balance of customer2 : " + customer2.getAccountBalance());
		System.out.println("Withdrawl amount : " + customer2.getWithDraw());
		System.out.println("Deposited amount : " + customer2.getDeposit());
		System.out.println("Check Balance after Withdrawl & Deposit : " + customer2.getCheckbalance());
	
	}

	//Initializing the private instance variables.
	private int accountbalance;
	private int withdraw;
	private int deposit;
	private int checkbalance;
	
	//Default contructor have default value of the account holder
	public Account()
	{
		this.accountbalance = 50_000;
		this.withdraw = 10_000;
		this.deposit = 8000;
		this.getCheckbalance(); //invoking the getCheckbalance method to return the final balance in account
	}
	
	//Parameterized constructor to get the details in object
	public Account(int withdraw,int deposit)
	{
		this.accountbalance = 97_000;
		//Invoking the setwithdraw method directly by the constructor.
		setWithdraw(withdraw);
		//Invoking the setDeposit method directly by the constructor
		setDeposit(deposit);
	}
	
	
	//Method to get the AccountBalance
	public int getAccountBalance()
	{
		return accountbalance;
	}
	
	//Method get the withdraw amount.
	public int getWithDraw()
	{
		return withdraw;
	}
	
	//Method to get the balance after withdrawl
	public int getCheckbalance()
	{
		return checkbalance = accountbalance - withdraw + deposit;
		
	}
	
	//Method to get the deposit amount details
	public int getDeposit()
	{
		return deposit;
	}
	
	//Method to set Withdraw based on some conditions.
	public void setWithdraw(int withdraw)
	{
		if(withdraw == 0 || withdraw >= accountbalance)
		{
			System.out.println("Enter the sufficient withdrawl amount!");
		}
		else if(withdraw > 0 && withdraw < accountbalance)
		{
			//Stores new withdraw value in instance variable.
			this.withdraw = withdraw;
		}
	}
	
	//Method to set Deposit based on some conditions.
	public void setDeposit(int deposit)
	{
		if(deposit <=0)
		{
			System.out.println("Invalid deposit amount!");
		}
		else
		{
			//Stores new deposit value in instance variable.
			this.deposit = deposit;
		}
		
}
	
	
}
	
	
