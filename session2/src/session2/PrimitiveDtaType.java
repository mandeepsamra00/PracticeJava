package session2;

public class PrimitiveDtaType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 10; //8bits -> 2power8 ->256/2 -> -128to 0 to 127
		//age is a storage container with value as 10 in it and a size of 8bits
		
		//updating the container
		age = 12;
		//read the container
		System.out.println("age is: "+age);
		//Delete the container -> Automatically whenever main method finishes
		
		short number = 2000; //16bits or 2 byte
		int numberOfTrees = 544212; //32 bits or 4 byte
		long phoneNumber = 949399499; //64bits or 8 byte
		
		//Floating Point: Float, Double
		float amount = 2500.25F; // 32bits or 4 bytes
		double discount = 0.55; //64 bits of data or 8 byte
		
		System.out.println("Discount is: "+discount);
		
		//Character: char
		char ch = 'A'; //16bits or 2 byte
		ch = '\u2606'; 
/*		Google unicode table -> unicode character table Here in the Unicode table, you can have Unicode for all the characters which are not 
        available on the keyboard.
        When you click on any of the Unicode, then you will see the code as displayed.
        In the stars, you have a code 2606, let us use this and save it and run the program and 
        then you can see a star coming in.
*/

		System.out.println("ch is: "+ch);
		
		/*logical : boolean Boolean : 8 bits or 1 byte
		 * is a data type that can store either true or false. For example, let us write is 
		internet enabled so that the value can be either true or false.*/

		boolean isInternetEnabled = true;  //true or false
		
		//For example, let’s write Boolean, CanIbookcab, it can be either true or it can be false.
		boolean canIBookCab = false;
	}

}
