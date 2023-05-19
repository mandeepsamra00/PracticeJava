package session14;

//create a class
class Dish{
	//non static attribute belong to object
	String name;	//property of object
	int price;
	int quantity;
	
	//static attribute belong to Class
	static int numOfDishes; //Property of class
	//Property of class i.e. static attribute in constructore as well as methods

		static int totalQuantity;  //static variable totalQuantity
		
	Dish(){
		name = "Salad";
		price = 100;
		quantity = 1;
		
		totalQuantity += quantity;
		numOfDishes++;
	}
	
	Dish(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		totalQuantity += quantity;
		numOfDishes++; //increment the number of dishes
	}
	
	void incrementQuantity() {
		quantity++;
	}
	void decrementQuantity() {
		totalQuantity--;
		quantity--;
	}
	
	void showDish() {
		System.out.println("Dish Detials: "+name+" "+price+" "+quantity);
		
	}
	
	//This is property of class and can be accessed by object reference or the class name
	//Inside the static method, object attributes are not accessible
	static void showNumberOfDishes() {
		System.out.println("Number of Dishes are:"+numOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
		//System.out.println[quantity]; //this is an error
	}
}

public class StaticVsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create real object in memory
		Dish dish1 = new Dish();
		Dish dish2 = new Dish("Pizza", 300, 2);
		//Dish dish3 = new Dish();
		
		//Dish dish4 = dish1; //reference copy operation
		
		dish1.incrementQuantity();
		dish1.incrementQuantity();
		dish2.incrementQuantity();
		
		dish2.incrementQuantity();
		dish2.incrementQuantity();
		
		dish1.decrementQuantity();
		
		
		dish1.showDish();	//2
		dish2.showDish();	//5
		
		//Dish.showNumberOfDishes();
		dish1.showNumberOfDishes();

	}

}
