package session30;

/*	 
 		Throwable
 			Exception
 			RuntimeException [unchecked exception]
 			arrayindexoutofboundsexception
 			nullpointerexception
 			.
 			..
 			IOException      [checked exception]
 			  filenotfoundexceptio
 			  .
 			  ..
 			SQLException
 			.
 			..
 			..
 */

//creating a checked Exception
class InvalidPhoneNumberException extends Exception{
	
	public InvalidPhoneNumberException(String message) {
		super(message);
	}
	
	//other bussiness methods
	
}

//Create an Unchecked Exception
class InvalidEmailException extends RuntimeException{
	
	public InvalidEmailException(String message) {
		super(message);
	}
	
	//other bussiness methods
	
}
public class CustomException {

	public static void main(String[] args) throws InvalidPhoneNumberException, InterruptedException {
	
		System.out.println("Customer Manager app Started");
		
		String phone = "+91 5354424343";
		String email = "john@example.com";
		
		if(phone.isEmpty()) {
			InvalidPhoneNumberException exception = new InvalidPhoneNumberException("Phone Number cannot be empty");
			throw exception;
		}
		
		if(email.isEmpty()) {
			InvalidEmailException exception = new InvalidEmailException("Email cannot be empty");
			throw exception;
		}
		
		System.out.println("Customer Managemant App Finished");
		
		Thread.sleep(3000);
	}

}
