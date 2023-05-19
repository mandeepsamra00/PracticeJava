package session6;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int covidCasesState1[] = {431, 41313, 32, 776126};
		int covidCasesState2[] = {123, 124312,53, 121542};
		int covidCasesState3[] = {765, 243143, 12, 162156};
		
		System.out.println("covidCasesState1 array is: "+covidCasesState1+" and length is : "+covidCasesState1.length);
		System.out.println("covidCasesState2 array is: "+covidCasesState2+" and length is : "+covidCasesState2.length);
		System.out.println("covidCasesState3 array is: "+covidCasesState3+" and length is : "+covidCasesState3.length);
	
		//2D Arrays - Array of Arrays
		int[][] covidCases= {
				{431, 41313, 32, 776126},
				{123, 124312,53, 121542},
				{765, 243143, 12, 162156}
		};
		
		System.out.println("covidCases array is: "+covidCases+"and length is: "+covidCases.length);
		
		//int[][] array2D = new int[5][3]; //5 1-D Arrays with 3 element each
		int[][] array2D = new int[5][];    //5 1-D Arrays but elements are not decided yet
		array2D[0] = new int[3];
		array2D[3] = new int [10];
		
		System.out.println("Iterating with for loop");
		for(int i=0;i<covidCases.length;i++) { // 3 times
			for(int j=0;j<covidCases[i].length;j++) {
				System.out.println(covidCases[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("Iterating with enhanced for loop");
		for(int[] array:covidCases) {
			for(int element : array) {
				System.out.println(element+ " ");
			}
			System.out.println();
		}
	}

}
