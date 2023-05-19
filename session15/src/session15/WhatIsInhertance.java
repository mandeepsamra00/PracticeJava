package session15;

class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	
	Parent(){
		fname= "John";
		lname = "Watson";
		wealth = 100000;
		System.out.println("[Parent] - Object Constructor with Default Constructor");
	}
	
	void showDetails() {
		System.out.println("[Parent] Details are ; "+fname+" "+lname+" "+wealth);
	}
}

//inheritance : create a Relationship of parent child using extends keyword between 2 classes/object
class Child extends Parent {
	
		String fname;
		//int wealth;
		String companyName;
		
	Child(){
		fname = "Finna";
		//wealth = 50000;
		companyName = "ABC Venture";
		System.out.println("[Child] - Object constructor with Deafult Constructor");
	}
	
	//method overriding
	void showDetails() {
		super.showDetails(); //Methods of Parents
		System.out.println("[Child] - Details are: "+fname+" "+lname+" "+wealth+" "+companyName);
	}
}
/*
 * 	inheritance rule1: before the object of child object of parent is constructed in memory
 *  inheritance rule2: As a child, it can access attributes/methods of the parent if child does not have it 
 *  Inheritance rules3: if parent has any property marked as private, it will not be accessible by the child
 */



public class WhatIsInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parent parent = new Parent();
		//parent.showDetails();
		
		Child child = new Child();
		child.wealth = 5000;
		child.showDetails();
	}

}
