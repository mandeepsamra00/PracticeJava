package session3;

import java.util.Scanner;

public class RelationalOrConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//< > >== <== == !=
		
		int eWallet = 500; 
		
		int cabFare = 500;
		
		boolean result = eWallet >= cabFare;
		/*If you change it to 500 since you are testing the greater than or equal to conditions, answer 
	      will be true.*/
		
		
		//boolean result = eWallet > cabFare;
		/* If you have a condition called Greater Than, though both quantities are the same, 
         the answer will be false.*/
		
		
		
		System.out.println("Can I book Cab: "+result);
		
		int promoCode = 10021;
		
		/*In the util package you have a class called scanner. Type scanner as a new scanner, and 
        inside you will pass system.in.*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Promo Code: ");
		
		/*In the util package you have a class called scanner. Type scanner as a new scanner, and 
           inside you will pass system.in.
		 */int code = scanner.nextInt();
		 
		 System.out.println("IS Promo Code Applied Succesfully: "+(promoCode == code));
		 
		 /*
		  *  Now print, can I get a discount or Is the Promo code applied successfully, then here, write 
      the promo code should be equal to the code. You need to close it in the end after you have 
      used it
		  */
		 scanner.close();

	}

}
