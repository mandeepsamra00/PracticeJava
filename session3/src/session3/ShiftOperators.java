package session3;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >> and << | >>>
		int num1 = 8;
		int num2 = 3;
		
		//int result = num1 >> num2;  //8>>3
		
		//0 0 0 0 1 0 0 0 
		// 0 0 0 0 1 0 0 0 >> 3
		// _ _ _ 0 0 0 0 1
		//0 0 0 0 0 0 0 1 -> 1
		
		int result = num1 << num2;
		
		System.out.println("Result is: "+result); //1

	}

}
