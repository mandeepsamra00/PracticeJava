package session22;

class User{
	static int objectSrNumber = 0;
	
	String name;
	String email;
	String phone;
	
	User(){
		objectSrNumber++;
		name = "";
		email = "";
		phone = "";
		System.out.println("User object Constructed with Sr Number: "+objectSrNumber+" this is: "+this);
	}
	
	User(String name){
		/*if(name.isEmpty()) {
			this.name = "NA";
		}else {
		this.name = name;
	}*/
		
		this.name = name.isEmpty() ? "NA": name;
}
	
	User(String name, String phone, String email){
		this(name); //execution of the constructor -> User(string name) | => Constructor execution call
		this.phone = phone;
		this.email = email;
	}
	
	void show() {
		System.out.println("User Details: "+name+" "+phone+ " "+email);
	}
}

//Refernce variable this will always hold the HashCode of the current object

public class ThisDemo {

	public static void main(String[] args) {
		
		
		/*User user1 = new User();
		System.out.println("user1 is: "+user1);
		
		System.out.println();
		
		User user2 = new User();
		System.out.println("user2 is: "+user2);*/
		
		User user = new User("", "+913435563", "nothing");
		user.show();

	}

}
