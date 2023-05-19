package session3;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// & | ^
		int  num1 = 8; //0 0 0 0 1 0 0 0 
		int num2 = 10; // 0 0 0 0 1 0 1 0
		
		int resul1 = num1 & num2; // 0 0 0 0 1 0 0 0 
		int resul2 = num1 | num2; // 0 0 0 0 1 0 1 0
		int resul3 = num1 ^ num2; // 0 0 0 0 0 0 1 0 
		
		System.out.println("result is: "+resul1);
		System.out.println("result is: "+resul2);
		System.out.println("result is: "+resul3);
				
	
	}

}
