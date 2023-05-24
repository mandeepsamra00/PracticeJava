package session21;

final class PaymentGateway{
	
	final void pay(int amount) {
		//..certainly some more code for implementation of pay method would be thr.
		System.out.println("Payment Gateway Transaction succefull");
	}
}

class MyPaymentGateway{ //extends PaymentGateway { // -> cannot inherit from final less
	
	/*void pay(int amount) { //cannot be re-defined as it is marked as final by parent
		//customize /control the behaviour of pay method
		System.out.println("MY Payment Gateway Transaction is Finished");
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		int age = 20; //a regular variable
		age = 22; //value can be modified for age
		
		final int score = 90; //a final variable -> read only variable
		//score = 92; //value cannot be modified
		
		final int distance; //blank final variable - which has not been initialized
		distance = 312; //blank final variable got its 1st and last value :)

	}

}
