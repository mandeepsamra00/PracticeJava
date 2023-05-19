package session9;

public class Overloading {
	
	/*
 	Rules for overlodaing
 	1. method name should be same
 	2. Unique Argument List
 		 increase or decrease the arguments
 		 different Data types for the arguments
 		 change the sequence for arguments
 	3.  return type of a method Plays no role
 */

		void add(int num1, int num2) {
			int result = num1 +num2;
			System.out.println("Result is: "+result);
		}
		
		/*void add(int x1, int  x2) {
			int result = x1 + x2;
			System.out.println("Result is: "+result);
			return result;
		} */
		
		void add(int num1, int num2, int num3) {
			int result = num1 +num2 + num3;
			System.out.println("Result is: "+result);
		}
		
		void add(double num1, double num2) {
			double result = num1 + num2;
			System.out.println("Result is :"+result);
		}

		void add(int num1, double num2) {
			double result = num1 + num2;
			System.out.println("Result is :"+result);
		}
		
		void add(double num1, int num2) {
			double result = num1 + num2;
			System.out.println("Result is :"+result);
		}
		
		
	public static void main(String[] args) {
		 
		Overloading ref = new Overloading();
		ref.add(10,20);
		ref.add(22.5,44.67);
		ref.add(10,20,30);
		ref.add(10,2.2);
		ref.add(10.5,20);
		
		
		
	}

}
