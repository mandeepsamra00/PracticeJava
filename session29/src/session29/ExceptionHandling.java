package session29;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("CAshbacks App Started");
		
		int[] cashBacks = {100, 20, 30, 80, 90, 66, 75, 45, 25};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your lucky number: ");
		
		int luckyNumber = -1 ;
		try {
			luckyNumber = scanner.nextInt();
		}catch(Exception ref) {
			System.out.println("Exception "+ref);
		}
		
		scanner.close();
		
		int cashBackEarned = 0;
		
		try {
			cashBackEarned = cashBacks[luckyNumber];
			}catch(ArrayIndexOutOfBoundsException ref) {
				//System.out.println("Execption"+ref);
				//System.out.println("Sorry!! something went wrong");
				//System.out.println("Exception Occured: "+ref);
				//System.out.println("Message: "+ref.getMessage());
				ref.printStackTrace();
			}finally {
				System.out.println("This is an important instruction");
			}
		
		//int cashBackEarned = cashBacks[luckyNumber];
		System.out.println("Thank you for participation. Your Earned a cashBack of s"+cashBackEarned);
		
		
		System.out.println("CashBack App Finished");

	}

}
