package session3;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + - * / %
		double amount = 2000;
		double taxes = 0.18;
		
		/*double taxesOnAmount = amount * taxes;
		 * System.out.println("Taxes on Amount:  "+taxesOnAmount);
		 * 
		 * double finalAmount = amount + taxesOnAmount;
		 * System.out.println("Final Amonut to be paid is : "+finalAmount);		 */
		
		double finalAmount = amount +(amount* taxes);
		System.out.println("Final Amonut to be paid is: "+finalAmount);
		
		int num1 = 10;
		int num2 = 3;
		int result = num1 % num2;
		result = num1 / num2;
		System.out.println("Remember is : "+result);

	}

}
