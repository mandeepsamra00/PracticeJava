package session17;

class Authentication{
	
	void login(String email, String password) {
		System.out.println("Logging in the user with "+email+" and password");
	}
	
	void login(String phone, int otp) {
		System.out.println("Logging in the user with "+phone+" and otp");
	}
}

//Overriding is wrt Parent Child Relational
class Theme{
	void themeColorScheme() {
		System.out.println("Primary: red");
		System.out.println("Secondary: white");
	}
	
	public void darkToLightMode(boolean enable) {
		System.out.println("Mode enabled form black to white");
	}
}

class CustomTheme extends Theme{
	
	void themeColorScheme() {
		System.out.println("Primary: green");
		System.out.println("Secondary: yellow");
	}
	//void darkLightMode(boolean enable, int brightnessLevel) {
	public void darkToLightMode(boolean enable) {
		System.out.println("Mode enanbled form Dark Gray to Amber and white");
		
	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
