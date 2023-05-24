package session20;

abstract class PayTmPaymentGateway{
	
	PayTmPaymentGateway(){
		System.out.println("[PayTm] PayTmPaymentGateway object constructed");
	}
	
	private boolean isBankInterfaceUp = false;
	
	void pay(int amount) {
		if(isBankInterfaceUp) {
			System.out.println("[PayTm] Payment successfully Done for Amount of "+amount);
			onSuccess("]PayTm] 101 - Payment Success");
		}else {
			System.out.println("[PayTm] Payment Failed.Palese try again later");
			onSuccess("[PayTm] 201 - Payment Failed");
		}
	}
	
	abstract void onSuccess(String message);
	abstract void onFailure(String message);
}

abstract class GooglePay{
	
}

abstract class Razorpay{
	
}

abstract class PayPal{
	
}

class EStorePayment extends PayTmPaymentGateway, GooglePay, RazorPay, PayPal{
	// This is not allowed. This is a major limitation when it comes to abstraction. You will be able to inherit only one single class.

	
	EStorePayment(){
		System.out.println("[EStore] EStorePayment object constructed");
	}
	
	void onSuccess(String message) {
		System.out.println("[EStore] "+message);
		System.out.println("[EStore] Thank you for placing an order. It shall be dispatched soon.");
	}
	
	void onFailure(String message) {
		System.out.println("[EStore] "+message);
		System.out.println("[EStore] Something went wrong. please try after some time :(");
	}
}

public class PaymentsApp {

	public static void main(String[] args) {
		
		//Not Allowed
		//PayTmPaymentGateway paymentGateway = new PayTmPaymentGateway();
		
		EStorePayment estorePayment = new EStorePayment();
		estorePayment.pay(3000);

	}

}
