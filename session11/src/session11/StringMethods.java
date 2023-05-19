package session11;

public class StringMethods {

	public static void main(String[] args) {
	
		String names = "John, Jennie, Jim, Jack, Joe";
		int length = names.length();
		System.out.println("Names is :"+length+" character wide");
		
		char ch = names.charAt(0);
		System.out.println("Character at index 0 is: "+ch);
		
		ch = names.charAt(length-1);
		System.out.println("Character at length-1 is: "+ch);
		
		int idx = names.indexOf('o');
		System.out.println("Index of o is: "+idx);
		
		idx = names.lastIndexOf('o');
		System.out.println("Last Index of o is :"+idx);

		idx = names.lastIndexOf("Jim");
		System.out.println("idx of JIM  is :"+idx);
		
		//Strings are IMMUTABLE
		//Strings cannot be modified
		String upperCaseNames = names.toUpperCase();
		System.out.println("names: "+names);
		System.out.println("upperCaseNames: "+upperCaseNames);
		
		String replaced = names.replace('J','K');
		System.out.println("names: "+names);
		System.out.println("replaced names: "+replaced);
		
		//String.subString = names.substring(idx);
		String subString = names.substring(idx, 17);
		System.out.println("subString is: "+subString);
		
		String[]results = names.split(",");
		for(String name: results) {
			System.out.println(name);
			//System.out.println(name.trim());
		}
	
		String fname = "John";
		String lname = "Watson";
		//String fullName = fname+ " "+lname;
		String fullName = fname.concat(" ").concat(lname);
		System.out.println("Full name is :" +fullName);
		
		String email = "john@example.com";
		if(email.isEmpty()) {
			System.out.println("Email cannot be empty");
		}else {
			if(email.contains("@") && email.endsWith(".com")) {
				System.out.println("Email is vaild. Proceed with registration");
			}else {
				System.out.println("Invaild email: "+email);
			}
		}
		
		String[] phoneNumbers = {
				"+91 354364534245",
				"+91 354364534245",
				"+91 354364534245",
				"+1 354364534245",
				"+1 354364534245"
		};
		
		String searchKeyword = "+1";
		
		for(idx=0;idx<phoneNumbers.length;idx++) {
			/*if(phoneNumbers[idx].startsWith(searchKeyword)) {
				System.out.println(phoneNumbers[idx]);
			}*/
			
			if(phoneNumbers[idx].contains(searchKeyword)) {
				System.out.println(phoneNumbers[idx]);
			}
		}
		
		int count =0;
		char[] charNames = names.toCharArray();
		for(char chr: charNames) {
			System.out.println(chr+" ");
			if
			(chr == 'o') {
				count++;
			}
		}
		System.out.println();
		
		System.out.println("o appers "+count+" times");
	}

}
