package session5;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break , continue
		
		for(int i=1, num=9; i<=10; i++) {
			System.out.println(num+" "+i+"'s are "+num*i);
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i is: "+i);
		}
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i <= 5) {
				continue;
			}
			
			System.out.println("i is: "+i);
		}
	}

}
