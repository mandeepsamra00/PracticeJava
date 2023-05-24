package session23;

class Product{
	
	 int pid;
	String name;
	int price;
	
	Product(){
		System.out.println("Product object constructed");
	}
	
	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price= price;
	}
	
	/*void show() {
		System.out.println("Product Details: "+pid+" "+name+" "+price);
	} */
	
	@Override
	public int hashCode() {
		return pid;
	}
	
	@Override
	public String toString() {
		return "product Details: "+pid+" "+name+" "+price;
	
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Product product = new Product(101, "iPhone11",80000);
		System.out.println("product class is: "+product.getClass());
		System.out.println("Product class now is : "+product.getClass().getSimpleName());
		
		System.out.println("product is: "+product);
		System.out.println("HashCode is: "+product.hashCode());
		
		//Write hexadecimal to decimal and search for online conversion
	/*  Copy the hexadecimal number and paste it here. Select convert, you will see the decimal 
             value coming as 1407343478, which is the same over here
	*/
		
		System.out.println("product.toString is: "+product.toString());
		
		//PS: toString is execute dautomatically whenever you print the refernce variable
		
		Object oRef;
		oRef = new Product();
	}

}
