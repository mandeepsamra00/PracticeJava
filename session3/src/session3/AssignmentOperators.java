package session3;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = num1;
		
		int amount = 100;
		//amount = amount +10;
		amount +=10;
		System.out.println("amount now is : "+amount);
		
		amount -=20;
		System.out.println("amount now is : "+amount);
		
		amount %= 7;
		System.out.println("amount finally is: "+amount);

	}

}
