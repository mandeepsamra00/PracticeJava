package session4;



import java.util.Scanner;

public class IfElseConstruct{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("Enter the Promo Code: ");
		int promoCode = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Amount is :"+amount+" and promo code is : " +promoCode);
		
		//JUMBO | 1001
		// 0.25 but , amount should be greater than 1000
		/* if case, write print, jumbo promo code applied. In the else case, write 
            print, invalid promo code.
          	*/  
		// Simple if/else
		
	/*	if(promoCode == 1001 && amount > 1000) {
			System.out.println("JUMBO Promo code Applied");
			double discount = 0.25 * amount;
			System.out.println("Discount is: "+discount);
			System.out.println("Amount to Pay is: "+(amount - discount));
			
		}else {
			System.out.println("Invalid Promo Code Or amount is lesser");
		}
	
		*/
		 // Nested if/ Else
		double discount = 0;
		if(promoCode == 1001) {
			if(amount >1000) {
				System.out.println("JUMBO applied Successfully");
				discount = 0.25 * amount;
				System.out.println("Discount is : "+discount);
			}else {
				System.out.println("Amount is lesser, Please add items worth: "+(1001-amount)+" more");
			}
			
		}else {
			System.out.println("Invalid Promo Code, Try 1001 as Promo code");
		}
		
		System.out.println("[AMOUNT]: "+(amount-discount));
		
		
	}

}
