package session13;

import java.util.Date;

/* 
 		Object: Multi Value Container (Homo/Hetro)
 		class: Textual Tepresentation of an object
 		
 		Principle of OOPS:
 		1. identify the object and write the attributes associated to it
 		2. create a class that will define the object
 		3. from the class create the real object in the memory


 */
// 1. identify the object and write the attributes associated to it
// 		User: name,Phone, email, gender, birthDate, password

//Create the class
class User{
	
	//Attributes: Property og object
	String name;
	String phone;
	String email;
	char gender;
	Date birthDate;
	String password;
	
	//Default constructor or No Arg Constructor
	User(){
		name = "";
		phone = "NA";
		email = "demo@example.com";
		gender = 'F';
		birthDate = new Date();
		password = "password";
	}
	
	//Parameterized Constructor
	User(String n, String phone, String e, char gender, Date birthDate, String password){
		name = n;
		this.phone = phone;
		email = e;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}
	
	void setUserData(String name, String phone, String email, char gender, Date birthDate, String password) {
		this.name = name;
		this.phone =phone;
		this.email =email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}
	
	void showUserData() {
		System.out.println("--------------------------");
		System.out.println(name+" can be called at"+phone);
		System.out.println(name+" can be emailed at"+name);
		System.out.println(name+" has a gender: "+gender+" and was born on "+birthDate);
		System.out.println("--------------------------");
	}
}

public class OOPS {

	public static void main(String[] args) {
		
		// 3. From the class create the real object in memory
		User user1 = new User();
		User user2 = new User();
		
		User user3 = user1; //Reference copy Operation
		
		User user4 = new User();
		User user5 = new User("Leo", "+91 345453424", "leo@example.com", 'M', new Date(), "pass123");
		
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		System.out.println("user3 is: "+user3);
		System.out.println("user4 is : "+user4);
		
		//operations on object
		// 1. Write/Update i.e. Set the data
		user1.name = "john";
		user3.name = "john watson";
		
		user3.phone = "+91 3546635353";
		user3.email = "john.watson@example.com";
		user1.birthDate = new Date();
		user1.password = "john@123";
		
	/*	user2.phone = "+91 3546635346553";
		user2.email = "fionna@example.com";
		user2.birthDate = new Date();
		user2.password = "fionna@123";
	*/
		user2.setUserData("Fionna", "+91 354635","fionna@example.com", 'F', new Date(), "fionna@123");
		
		//2. Read the data
	/*	System.out.println("Reading Data from user1");
		System.out.println(user1.name+" can be called at "+user1.phone+" and can be emailed at "+user1.email+"birthdate: "+user1.birthDate);
		
		System.out.println("Reading Data from user2");
		System.out.println(user2.name+" can be called at "+user2.phone+" and can be emailed at "+user2.email+"birthdate: "+user2.birthDate);
		
		System.out.println("Reading Data from user3");
		System.out.println(user3.name+" can be called at "+user3.phone+" and can be emailed at "+user3.email+"birthdate: "+user3.birthDate);
		
		System.out.println("Reading Data from user4");
		System.out.println(user4.name+" can be called at "+user4.phone+" and can be emailed at "+user4.email+"birthdate: "+user4.birthDate);
		
		System.out.println("Reading Data from user3");
		System.out.println(user5.name+" can be called at "+user5.phone+" and can be emailed at "+user5.email+"birthdate: "+user1.birthDate);
	*/
		
		user1.showUserData();
		user2.showUserData();
		user3.showUserData();
		user4.showUserData();
		user5.showUserData();
		
		Product p1 = new Product();
		
		Product p2 = new Product("iPhone 11 pro max", 4.7, "Apple iPhone with 3 cameras", 800);
		
		Product p3 = new Product();
		p3.setProductData("Ultrasound Shoe", 5.0, "Adidas comfortable Ultrasound shoe 21", 200);
		
		p1.showProductData();
		p2.showProductData();
		p3.showProductData();
		
		//Delete the data -> Automatically
		System.gc();

	}

}
