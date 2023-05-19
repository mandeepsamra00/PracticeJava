package session15;
/*
class Shoe{
	int id;
	String name;
	String description;
	int price;
	String brand;
	int[] sizes;
	String[] colors;
}
class TV{
	int id;
	String name;
	String description;
	int price;
	int screensizes;
	String[] colors;
	String ledTechnology;
}
class MobilePhone{
	int id;
	String name;
	String description;
	int price;
	int brand;
	int ram;
	int storage;
	String ot;
}
*/

class Product{
	int id;
	String name;
	String description;
	int price;
	String brand;
	
	Product(){
		
	}
	public Product(int id, String name, String description, int price, String brand) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price= price;
		this.brand= brand;
	}
	void showProduct() {
		System.out.println("------------Product Details--------------");
		System.out.println(id+ " "+name);
		System.out.println(description);
		System.out.println(price+ " "+brand);
		System.out.println("-----------------------------------------");
	}
}

class Shoe extends Product{
	int[] sizes;
	String[] colors;
	
	Shoe(){
		
	}
	
	public Shoe(int id, String name, String description, int price, String brand, int[] sizes, String[] colors) {
		super(id, name, description, price, brand);
		this.sizes = sizes;
		this.colors = colors;
		}
	
	void showShoe() {
		showProduct();
		System.out.println(sizes);
		System.out.println(colors);
	}
}
class TV extends Product{
	int screenSize;
	String color;
	String ledTechnology;
	
	TV(){
		
	}
	public TV(int id, String name, String description, int price, String brand, int screenSize, String color, String ledTechnology) {
		super(id, name, description, price, brand);
		this.screenSize = screenSize;
		this.color = color;
		this.ledTechnology = ledTechnology;
		}
	void showTV() {
		showProduct();
		System.out.println(screenSize);
		System.out.println(color);
		System.out.println(ledTechnology);
		
	}
}
class MobilePhone extends Product{
	int ram;
	int storage;
	String ot;
	
	MobilePhone(){
		
	}
	public MobilePhone(int id, String name, String description, int price, String brand, int ram,int storage, String ot) {
		super(id, name, description, price, brand);
		this.ram = ram;
		this.storage =storage;
		this.ot = ot;
		}
	
	void showMobilePhone() {
		showProduct();
		System.out.println(ram);
		System.out.println(storage);
		System.out.println(ot);
	}
}


public class WhyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}


