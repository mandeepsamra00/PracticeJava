package session11;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		
		String email = "john@example.com"; //Internal strings
		String password = "john@123";
		
		String myEmail = new String("john@example.com"); //String Object
		String yourEmail = "john@example.com";
		
		if(email == myEmail) { //comparison on refereance variable and not be data
			System.out.println("MyEmail matched");
		}else {
			System.out.println("MyEmail MisMatched");
		}
		
		if(email == yourEmail) {//comparing 2 interned string
			System.out.println("YourEmail Matched");
		}else {
			System.out.println("YourEmail MisMatched");
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String userEmail = scanner.nextLine();
		
		
		System.out.println("Enter password: ");
		String userPassword = scanner.nextLine();
		
		scanner.close();
		
		/*if(email == userEmail && password == userPassword) {
			System.out.println("Email and password Matched. Please Enter Home");
		}else {
			System.out.println("Emial and Password MisMatches. please try Again");
		}

		if(email.equals(userEmail) && password.equals(userPassword)) {
			System.out.println("Email and password Matched. Please Enter Home");
		}else {
			System.out.println("Emial and Password MisMatches. please try Again");
		}*/
		
		if(email.compareToIgnoreCase(userEmail) == 0 && password.compareTo(userPassword)  == 0) {
			System.out.println("Email and password Matched. Please Enter Home");
		}else {
			System.out.println("Emial and Password MisMatches. please try Again");
		}

	}

}
