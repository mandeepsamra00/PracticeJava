package session22;

class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		fname = "john";
		lname = "Watson";
		wealth =10000;
		System.out.println("Parent object constructor");
	}
	
	public Parent(String fname,String lname, int wealth) {
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
		System.out.println("Parent object constructed - Parameterized Constructor");
	}
	
	void purchaseCar() {
		System.out.println("[Parent] Lets buy Honda city");
	}
	
	void show() {
		System.out.println("Parent Details: "+fname+" "+lname+" "+wealth);
	}
}

class Child extends Parent{
	
	Child(){
		
		//super(); //super execution call -> this is execution to the default constructor. this super call is taken care by compiler automatically
		super("Fionna", "Flynn", 30000);
		System.out.println("child object constructed");
	}
	
	void purchaseCar() {
		super.purchaseCar(); //use super as reference variable to differentiate between Parent and Child Propertize
		System.out.println("[Child] Lets buy Honda civic");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.show();
		
		System.out.println();
		child.purchaseCar();

	}

}
