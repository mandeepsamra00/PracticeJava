package session25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface PaymentCallBacks{
	void onSuccess(String message);
	void onFailure(String message);
	
}

/*class Payment implements PaymentCallBacks{
	@Override
	public void onFailure(String message) {
		System.out.println("Payment Fialed: "+message);
	}
	
	@Override
	public void onSuccess(String message) {
		System.out.println("Payment Passed: "+message);
	}
}*/

class ButtonClickListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

public class AnonymousClasses {

	public static void main(String[] args) {
		
		//PaymentCallBacks ref = new Payment();
		//ref.onSuccess("Amount paid 2000");
		//ref.onFailure("Amount 2000 not processed");
		
		PaymentCallBacks ref = new PaymentCallBacks() { //new paymentCallBacks(){} => class noname implements PaymentCallBacks{}
			@Override
			public void onSuccess(String message) {
				System.out.println("Payment Passed: "+message);
			}
			
			@Override 
			public void onFailure(String message) {
				System.out.println("Payment failed: "+message);
			}
		};
		
		ref.onSuccess("Amount paid 20000");
		ref.onFailure("Amount not paid for 2000");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				}	
	};
	}
}



	

