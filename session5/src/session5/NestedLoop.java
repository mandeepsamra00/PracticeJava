package session5;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			System.out.println("i is: "+i);
			//System.out.println("This will come again and again");
			
			for(int j=1;j<=3;j++) {
				System.out.println("   j is: "+i);
			}
		}

	}

}
