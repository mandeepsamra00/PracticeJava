package session18;

class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 50;
		System.out.println("Cab Object Constructed");
	}
	
	void bookCab(String from,String to) {
		System.out.println("Cab Booked frm "+from+" to  "+to+" location.Please pay " +baseFare);
	}
}

//Hierarchy

class MiniCab extends Cab{
	
	boolean isStreamingAvailable;
	
	MiniCab(){
		baseFare+=30;
		isStreamingAvailable = true;
		System.out.println("Mini Cab Object Constructed");
	}
	
	void bookCab(String from, String to) {
		System.out.println("Mini Cab Booked from "+from+" to "+to+" location. Please pay "+baseFare);
		System.out.println("On the way you can stream the videos on the tab placed next to you");
	}
}

class SharedCab extends Cab{
	
	int numberOfPeople;
	
	SharedCab(){
		numberOfPeople = 4;
		baseFare -= 20;
		System.out.println("Shared Cab object Constructed");
	}
	
	void bookCab(String from,String to) {
		System.out.println("Shared Cab Booked from "+from+" to "+to+" location. Please pay "+baseFare);
		System.out.println("On the route you will share the cab with "+(numberOfPeople-1)+" passengers");

	}
}

class LuxuryCab extends Cab{
	
	int softDrinks;
	int chips;
	
	LuxuryCab(){
		System.out.println("Luxury Cab object Constructed");
		softDrinks = 3;
		chips = 5;
		baseFare +=50;
	}
	
	void bookCab(String from, String to) {
		System.out.println("Luxury Cab booked from "+from+" to "+to+" location. Please pay "+baseFare);
		System.out.println("On the route you can eat "+chips+" chips and can drink upto "+softDrinks+" soft Drinks");
	}
}

class CabBookingApp{
	
	static Cab book(int type) {
		
		Cab cab = null;
		
		if(type == 1) {
			cab = new MiniCab();
		}else if(type == 2) {
			cab = new SharedCab();
		}else if(type == 3) {
			cab = new LuxuryCab();
		}else {
			System.out.println("Invalid Selection");
		}
		
		return cab;
	}
}

public class RTP {

	public static void main(String[] args) {
		
		//Cab cab;
		//cab = new Cab();
		//cab.bookCab("Home", "work");
		
		/*cab = new MiniCab();
		cab.bookCab("Home","Work");
		
		cab = new SharedCab();
		cab.bookCab("Home", "Work");*/
		
		Cab cab = CabBookingApp.book(3);
		cab.bookCab("Home", "Work");

	}

}
