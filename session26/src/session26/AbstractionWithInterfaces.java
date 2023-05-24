package session26;

//abstract class GooglePay{
interface GooglePay{
	
	default void payFromGoogle(int amount) {
		System.out.println("[GooglePay] Amount Paid: "+amount);
		onSuccess(101, "Transaction Success");
	}
	
	void onSuccess(int code, String message); // -> public abstract
	abstract void onFailure(int code, String message);
		
}

//abstract class ApplePay{
interface ApplePay{
	
	default void payFromApple(int amount) {
	System.out.println("[ApplePay] Amount Paid: "+amount);
	onFailure("Bank interface Down. ErrorCode 33120");
	}
	
	
	abstract void onSuccess(String message);
	abstract void onFailure(String message);
	
}

interface Payments extends GooglePay, ApplePay{
	
}

 
//class FoodDeliveryAppPayments extends GooglePay, ApplePay{ // error as multiple extends not supported
class FoodDeliveryAppPayments implements Payments{ //GooglePay, ApplePay{
	
	@Override
	public void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment Recevied. We will Deliver the order soon..."+code+" "+message);
	}

	@Override
	public void onFailure(int code, String message) {
		System.out.println("[FDA] Payment Failed. Please Try Again..."+code+" "+message);
	}
	
	@Override
	public void onSuccess(String message) {
		System.out.println("[FDA] Payment Recevied. ");
	}

	@Override
	public void onFailure(String message) {
		System.out.println("[FDA] Payment Failed. Meggage:  "+message);
		
	}
}

public class AbstractionWithInterfaces {

	public static void main(String[] args) {
		// reference variable of parent can refer to the child object ->class to class inheritance
		//reference variable of interface can refer to the object of class which implements it -> no inheritance and simply implementtion


		//GooglePay ref = new FoodDeliveryAppPayments(); //polymorphic statement work same way :)
		//ref.payFromGoogle(3000);
		
		ApplePay ref = new FoodDeliveryAppPayments();
		ref. payFromApple(3000);
		ref.payFromApple(5000);

	}

}
