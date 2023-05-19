package session13;

/*
 * Principle of OOPS;
 * 1.  identify the object and write the attributes associated with it
 * 	Product: name, ratings, description, and price
 * 
 * 3. From the class create the real object in memory
 */

//2. create class which will define the object

public class Product {
	
	//Attributes
	String name;
	double ratings;
	String description;
	double price;
	
	//Default constructor
	Product() {
		
	}

	//Parameterized constructor
	Product(String name, double ratings, String description, double price){
		this.name =name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}
	
	void setProductData(String name, double ratings, String description, double price) {
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
		
	}
	
	void showProductData() {
		System.out.println("--------------------------------------");
		System.out.println("Product "+name+" has "+ratings+" ratings");
		System.out.println("Product "+name+" is priced at $ "+price);
		System.out.println("Product "+name+" description is : "+description);
		System.out.println("----------------------------------------");
	}
}
