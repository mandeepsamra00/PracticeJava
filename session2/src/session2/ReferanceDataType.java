package session2;

public class ReferanceDataType {

	public static void main(String[] args) {
		// Referance Data Type: Storage Containers created at run time
		//	They are created inside the HEAD Area
		//	They have referance variables which can refer to them from the stack
		//	Represent Multi Stroage Container (Store More than one value)
		//	Arrays, String, Objects
		
		int marksMaths = 90;
		int marksPhysics = 80;
		int marksChemistry = 85;
		
		int marks[] = {90,80,85};
		System.out.println("Marks is: "+marks);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		char ch = 'J';
		String name = "John";
		/*For storing more than one single character for example you want to store the name John, 
        you can write the string name John, and store it in the double quotes.*/
	}

}
