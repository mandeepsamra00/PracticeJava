package session3;

public class TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ? :
		int eWallet = 300;
		int cabFare = 500;
		//boolean result = (eWallet >= cabFare) ? true : false;
		
		int amountToPay = (eWallet >= cabFare) ? 10 : (cabFare-eWallet)+10;
		System.out.println("Amount to pay: "+amountToPay);

	}

}
