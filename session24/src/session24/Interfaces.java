package session24;

/*abstract class PayTMPaymentGateway{
	
	
}

abstract class RazorPay{
	
}

abstract class PayPal{
	
}

//Multiple extends of supported by java
class MyPaymentPage extends PayTMPaymentGateway, RazorPay{
	
}*/

interface PayTMPaymentGateway{
	
}
interface RazorPay{
	
}
interface PayPal{
	
}

//Multiple implements will be used now with interfaces
class MyPaymentPage implements PayTMPaymentGateway, RazorPay, PayPal{
	
}

interface Notification{
	//we cannot define methods in interface
	/*void show(){
	 * System.out.println("This is show of interface");
	 * }
	 */
	
	//we cannot have constructors in interface
	/*Notification(){
	 * } */
	
	//public abstract void notifyMessage(String text)
	void notifyMessage(String text); //public abstract - > method by default
}

interface ElectricityBillPayment{
	
	int billAccountNumber = 15421301;  //by defalut - > public static final int billAccountNumber = 15421301;
	
	void billGenerated();
	void payBillNotification();
}

class ElectricityApp {
	
	ElectricityBillPayment payment;
	
	void subscribeForBill(ElectricityBillPayment payment) {
		this.payment = payment;
	}
	
	void boardcaseBills() {
		payment.billGenerated();
		payment.payBillNotification();
	}
}


//inf as child form2 interface : inheritance -> inheritance between interfaces
interface Inf extends Notification, ElectricityBillPayment{
	
}

class User implements Inf { // Notification, ElectricityBillPayment{//this is implementation of interface and not inheritance
	
	public void notifyMessage(String text) {
		System.out.println("A new notification message: "+text);
	}
	
	@Override
	public void billGenerated() {
		System.out.println("[User] Your Elecricity bill is generated. plase pay in time");
	}
	
	@Override public void payBillNotification() {
		System.out.println("[User] Thank youk for paying your bill");
	}
}

interface MyInf{
	static void show() {
		System.out.println("This is show of MyInf");
	}
	
	default void hello() {
		System.out.println("This is hello of MyInf");
	}
	
	void bye();
}

class CA implements MyInf{
	
	public void bye() {
		System.out.println("This is bye from CA");
	}
}

public class Interfaces {
	

	public static void main(String[] args) {
		
		//polimorphic statements with interfaces
		//reference variable of interface can refer to the object/class implementing it :)
		Notification ref1 = new User();
		ElectricityBillPayment ref2 = new User();
		
		System.out.println("Bill Account Number is : "+ElectricityBillPayment.billAccountNumber);
		ElectricityApp elecrticityApp = new ElectricityApp();
		User john = new User();
		elecrticityApp.subscribeForBill(john);
		
		elecrticityApp.boardcaseBills();
		
		System.out.println();
		
		MyInf inf = new CA(); //polymorphic statement
		inf.hello(); //OK
		inf.bye(); //OK
		//inf.show(): //error
		
		MyInf.show(); //static methods can be accessed only by the name of interface//
		//CA.show(); //error

	}
	
	/*To see the byte codes generated for interfaces, go to Home -> java -> session 24 -> bin directory.*/

}
