package session9;

public class Authentication {
	
	/*void register(String email, String password, String phone, int otp) {
		
		if(!email.isEmpty()) {
			System.out.println("Register the user with email and password");
			
		}else if(!phone.isEmpty()) {
			System.out.println("Resgister the user with phone and OTP");
		}
		else if(true) {
			
		}else {
			
		}
	}*/
	
	void register(String email, String password) {
		System.out.println("User registration with email and password");
	}
	
	void register(String phone, int otp) {
		System.out.println("User registration with phone and otp");
	}
	
	void register(String googleEmail) {
		if(googleEmail.endsWith("@gmail.com")) { //if user use @example.com it will show invaild user
			System.out.println("User registration with Google");
			
		}else {
			System.out.println("Invaild Google Account");
		}
		
	}
	
	void login(String email, String password) {
		System.out.println("User registration with email and password");
	}
	
	void login(String phone, int otp) {
		System.out.println("User registration with phone and otp");
	}
	
	void login(String googleEmail) {
		System.out.println("User registration with Google");
	}


	public static void main(String[] args) {
		
		Authentication auth = new Authentication();
		//auth.register("john@example.com", "john123");
		//auth.register("+91 9999991111", 2345);
		//auth.register("john@gmail.com");
		
		//auth.login("john@example.com","john123");
		auth.login("fionna@gmail.com");
	}

}
