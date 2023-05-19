package session12;

public class MutableVsImmutableStrings {
	
	static void printString(CharSequence string) {
		System.out.println(string+" length: "+string.length());
	}
	
	public static void main(String[] args) {
		
		String string = new String("Hello");
		string.concat("World");
		
		System.out.println("string is: "+string);
		
		//Multiple String
		
		//Thread-Safe version
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("World");
		System.out.println("buffer is: "+buffer);
		
		//Not Thread-Safe
		StringBuilder builder = new StringBuilder("Hello");
		builder.append("World");
		System.out.println("builder is: "+builder);
		
		String str1 = buffer.toString();
		String str2 = builder.toString();
		
		MutableVsImmutableStrings.printString(string);
		MutableVsImmutableStrings.printString(buffer);
		MutableVsImmutableStrings.printString(builder);
		
	
	}

}
