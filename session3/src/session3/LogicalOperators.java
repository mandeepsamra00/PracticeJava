package session3;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&& || !
		
		boolean internet = true;
		boolean gps = true;
		
		System.out.println("Can I Navigate on google Maps: "+ (internet && gps));
		
		int promoCode = 2001;
		int amount = 5000;
		
		System.out.println("Can I get a discount: "+(promoCode == 2001 && amount > 3000));
		
		String phoneNumber = "";
		String email = "john@example.com";
		
		System.out.println("Can I login: "+(phoneNumber.length()!=0 || email.length()!=0));
		
		System.out.println("internet: "+internet);
		System.out.println("!internet: "+!internet);

	}

}
