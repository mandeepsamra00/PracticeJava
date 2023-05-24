package session18;

class CA{
	
	void show() {
		System.out.println("This is show of CA");
	}
}

class CB extends CA{
	
	void show() {
		System.out.println("This is show of CB");
	}
	
	void hello() {
		System.out.println("This is hello form CB");
	}
}

public class PolymorphicStatement {

	public static void main(String[] args) {
		
		//CA caRef = null;
		//caRef = new CB(); //Polymorphic Statement
		
		CA caRef = new CB(); //Polymorphic Statement
		
		//Reference variable of parent can refer to the child object
		//Vice verse not allowed i.e. Child cannot refer the parent object
		
		
		caRef.show();
		//caRef.hello(); //error -> With parent's Reference, we can only execute the method which is overrid
		
		//Downcasting: getting the reference back into child reference variable from parent reference variable
		CB cbRef = (CB)caRef;
		cbRef.hello();
	}

}
