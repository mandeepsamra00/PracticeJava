package session31;

class BankAccount{
	
int balance;
int miniBalance;
int attempts = 0;
	
	public BankAccount() {
		balance = 10000;
		miniBalance = 2000;
	}
	
	void withdraw(int amount) throws BankingException {
		balance -= amount;
		
		if(balance < miniBalance) {
			balance += amount;
			System.out.println("withdraw Failed. Please deposit more money for transaction. Balance is low: "+balance);
			attempts++;
		}else {
			System.out.println("Withdrawl Successful. New Balance is "+balance);
		}
		
		if(attempts == 3) {
			BankingException exception = new BankingException("Illegal Attepmts: "+attempts);
			throw exception;
		}
		
	}
}

class BankingException extends Exception{
	public BankingException(String message) {
		super(message);
	}
}

public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking Started");
		
		BankAccount johnAccount = new BankAccount();
		
		try {
		for(int i=0; i<5000; i++) {
			johnAccount.withdraw(3000);
		}
		
		}catch(Exception e) {
			System.out.println("Exception is: "+e);
		}
		
		
		
	/*	johnAccount.withdraw(3000);
		johnAccount.withdraw(3000);
		johnAccount.withdraw(3000);
		johnAccount.withdraw(3000);
	
	*/

		System.out.println("Banking Finished");
	}
	

	}

