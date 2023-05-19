package session16;

//Single Level Inheritance
class CA{
	
}

class CB extends CA{
	
}
class User{
	
}
class PrimeUser extends User{
	
}
//Multi level inheritance , parent to child to grand child and may be to the next level
class CC extends CB{
	
}
class Phone{
	
}
class AndroidPhone extends Phone{
	
}
class SamsungAndroidPhone extends AndroidPhone{
	
}

//Hierarchy, 1 parent and multiple children, rum time polimorphism

class CD extends CA{
	
}
class iPhone extends Phone{
	
}
//Multiple inheritance ->Not Supported by java
class CE{
	
}
//class CF extends CA,CE{//error -> cannot extends more than 1 class

//Hybrid -> combination of single, Multi and hierarchy
class CG extends CD{
	
}
class CH extends CD{
	
}


public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
