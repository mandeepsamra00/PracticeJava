package session35;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int iVar = 100;
		double dVar = 2.2;
		char cVar = 'A';
		
		System.out.println("iVar: "+iVar);
		System.out.println("dVar: "+dVar);
		System.out.println("cVar: "+cVar);

		
		//wrapper classes
		//for every primitive we have a class called wrapper class
		//int -> Integer
		//double -> Double
		//char -> character
		
		//boxing
		//we wrapped the primitive into an object
		
		Integer iRef = Integer.valueOf(iVar);
		Double dRef = Double.valueOf(dVar);
		
		//Character cRef = new Character(cVar);
		Character cRef = Character.valueOf(cVar);
		
		//unboxing
		System.out.println("iVar is: "+iRef.intValue());
//		System.out.println("dVar is: "+dRef.doubleValue());
//		System.out.println("cVar is: "+cRef.charValue());
		}

	private Integer iVar;
	
		//aUTO -BOXING
		Integer iRef1 = iVar; //Implicity way
		Double dRef1 = dVar;
		Character cRef1 = cVar;
		
		//auto-Unboxing
		int i = iRef1;
		double d = dRef1;
		char c = cRef1; 
		
		
		
		
		
}
