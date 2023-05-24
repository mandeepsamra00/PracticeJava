package session19;

//We cannot create the object of Abstract class


abstract class Cab{
	
	Cab(){
		System.out.println("Cab Object constructed");
	}
	
	//we can create abstract methods only inside the abstract class
	//the method which is marked as abstract cannot have definition
	
	//This becomes a RULE be parents :)
	
	abstract void bookCab(String source, String destination);
	//we can have multiple abstract methods
	
}

class MiniCab extends Cab{
	
	MiniCab(){
		System.out.println("MiniCab object Constructed");
	}
	
	void bookCab(String source, String destination) {
		System.out.println("MiniCab Booked from "+source+" to "+destination);
		
	}
}

//Not meant for Extension, but for abstruction i.e. let the child implement the value
//Further, we will not be able to create direct object of the class

abstract class Notification{
	
	abstract void notifyWithMessage(String message);
}

class YoutubeChannel{
	
	Notification notification; //reference variable to notification
	
	void subscribe(Notification nf) { //Polymorphic Statement: nf has Refernce to the User Object
		notification = nf; //reference copy -> notification now has reference now has refernce to john i.e. the User Object
	}
	
	void uploadVideo(String name) {
		String message = "A new video uploaded: "+name;
		notification.notifyWithMessage(message);
	}
}

class User extends Notification{
	
	void notifyWithMessage(String message) {
		System.out.println("-----------------");
		System.out.println("[User] A new Notification !!");
		System.out.println("[User] Message is: "+message);
		System.out.println("-------------------");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Cab cab; //cab is not an object . cab is a reference variable
		//cab = new Cab(); //With new an object will be created in memory
		
		//Polymorphic statement will work in same way
		cab = new MiniCab();
		
		//MiniCab miniCab = new MiniCab();
		//miniCab.bookCab("Home", "Work");
		
		cab.bookCab("Home", "Work");
		
		User john = new User();
		
		YoutubeChannel channel = new YoutubeChannel();
		channel.subscribe(john);
		channel.uploadVideo("Learning Java");
		

	}

}
