package session6;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive Type: Single Value Containers
		int confirmed = 431;
		int recovered = 41313;
		int deceased = 21;
		int vaccinated = 54524;
		
		//Referance Type: Multiple Value Container
		int covidCases[] = {431, 41313, 21, 54524};
		
		int array1[]= {10 , 20, 30, 40, 50};
		int[] array2 = {10, 20, 30, 40, 50};
		 
		int a1[], a2;
		int a3, a4;
		
		int array3[] = new int [] {10, 20, 30, 40, 50};
		int[] array4 =new int[] {10, 20, 30, 40, 50};
		
		//All the values will be 0 by default initially
		int array5[] = new int[5];
		int[] array6 = new int[10];
		
		array5[0] =10;
		array5[1] =20;
		
		System.out.println("confirmed is: "+confirmed);
		System.out.println("covidCases is :"+covidCases);
		
		int[] data = covidCases;//Referance copy operation
		//HashCode of covidCases is copied into data
		System.out.println("data is: "+data);
		
		data[1] = 66412;
		System.out.println("covidCases[1]: "+covidCases[1]);
		System.out.println();
		
		System.out.println("Iterating in ID array");
		for(int idx=0;idx<covidCases.length;idx++) {
			System.out.println("covidCases["+idx+"] is : "+covidCases[idx]);
		}
		
		System.out.println("Iterating with Enhanced for loop");
		for(int element:array5) {
			System.out.println("Element is: "+element);
		}
		
		//Open the browser window and open Google draw

	}

}
