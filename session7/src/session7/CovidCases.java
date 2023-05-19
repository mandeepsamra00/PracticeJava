package session7;

import java.util.Scanner;

public class CovidCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* in your browser, open the world meters dot info for 
        the coronavirus*/

		String[] countryNames = {"USA", "INDIA", "BRAZIL", "UK", "FRANCE"};
		int totalCases = 0;
		int totalRecoveredCases = 1;
		int activeCases =2;
		
		int [][] covidCases = {
				{66995533 , 4309044, 23031325}, // 0 -> USA
				{245464343,5676553,5767475}, 	//1->INDIA
				{6564346, 75657442, 755746},	//2 ->BRAZIL
				{746744354, 57674534, 676464},	//3-> UK
				{5356436, 75673545, 46456346}	//4 ->FRANCE
		};
		
		System.out.println("Total cases\tTotal Recovered\tActive cases");
		System.out.println("------------------------------------------");
		
		for(int idx=0;idx<covidCases.length;idx++) {
			
			System.out.println(countryNames[idx]);
			System.out.println("---------------------------------------");
			
			for(int j=0;j<covidCases[idx].length;j++) {
				System.out.println(covidCases[idx][j]+"\t");
				
			}
			System.out.println();
			System.out.println();
		}
		
		//filter covid Case based on: country Name, Total Cases, Recovered Cases, Active Cases

		System.out.println("Filter Covid Case Data");
		System.out.println("1. Name");
		System.out.println("2. Total Cases");
		System.out.println("3. Recovered Cases");
		System.out.println("4. Active Cases");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice = scanner.nextInt();
	
		
		switch (choice) {
		case 1:
			scanner.nextLine();
			System.out.println("Enter name of country: ");
			String name = scanner.nextLine();
			
			int idx = -1;
			for(int i=0; i<countryNames.length;i++) {
				if(name.equalsIgnoreCase(countryNames[i])) {
					idx = 1;
					break;
				}
			}
			
			System.out.println("idx is: "+idx);
			
			if(idx == -1) {
				System.out.println("Sorry! Country Not Found");
			}else {
				for(int element : covidCases[idx]) {
					System.out.println(element+"\t");
				}
				System.out.println();
			}
			
			break;
			
		case 2:
			
			System.out.println("Total Case");
			System.out.println("-------------------");
			
			/* for(int i=0;i<covidCases.length;i++) {
				
				System.out.println(countryNames[i]);
				System.out.println("-----------------");
				
				System.out.println(covidCases[i][totalCases]);
				
				System.out.println();
				System.out.println();
			}*/
			
			CovidCases.printCases(covidCases, countryNames, totalCases);
			
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			System.out.println("active Case");
			System.out.println("-------------------");
			
			/*for(int i=0;i<covidCases.length;i++) {
				
				System.out.println(countryNames[i]);
				System.out.println("-----------------");
				
				System.out.println(covidCases[i][activeCases]);
				
				System.out.println();
				System.out.println();
			}
			*/
			
			CovidCases.printCases(covidCases, countryNames, activeCases);
			
			break;
			
			default:
				System.out.println("Invalid Choice :(");
		}
		scanner.close();
	}

	private static void printCases(int[][] covidCases, String[] countryNames, int totalCases) {
		// TODO Auto-generated method stub
		
	}

}
