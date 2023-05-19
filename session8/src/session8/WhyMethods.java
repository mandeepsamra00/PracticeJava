package session8;

public class WhyMethods {
	
	//non static method
	int getMax(int[] array) {
		
		int max = array[0];
		
		for(int idx=1;idx<array.length;idx++) {
			if(array[idx]> max) {
				max = array[idx];
			}
		}
		return max;
	}
	
	//static method | Executed by class Name
	static int getMaxFromArray(int[] array) {
		int max = array[0];
		
		for(int idx=1;idx<array.length;idx++) {
			if(array[idx]> max) {
				max = array[idx];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		
		int[] productPrices = {1200, 2300, 3300, 1600, 1900};
		int[] cricketerScores = {90, 88, 45, 67, 12, 34, 55, 19, 20, 22, 11};
		int[] covidCases = {442424, 53534, 64534, 64535, 6453, 564, 67443,454};
		
		//Object constructor statement
		//WhyMethods ref = new WhyMethods();
		//System.out.println("Maximum in product prices is : "+ref.getMax(productPrices));
		//System.out.println("Maximum in cricketer scores is : "+ref.getMax(cricketerScores));
		//System.out.println("Maximum in covid case is : "+ref.getMax(covidCases));
		
		System.out.println("Maximum in Product prices is: "+WhyMethods.getMaxFromArray(productPrices));
		System.out.println("Maximum in cricketer scores is : "+WhyMethods.getMaxFromArray(cricketerScores));
		System.out.println("MMaximum in covid case is : "+WhyMethods.getMaxFromArray(covidCases));
		
		int max = productPrices[0];
		for(int idx=1;idx<productPrices.length;idx++) {
			if(productPrices[idx] > max) {
				max = productPrices[idx];
			}
		
		}
		System.out.println("Maximum in product prices is : "+max);
		
		max = cricketerScores[0];
		
		for(int idx=1;idx<cricketerScores.length;idx++) {
			if(cricketerScores[idx] > max) {
				max = cricketerScores[idx];
			}
		}
			System.out.println("Maximum in cricketer Scores is :" +max);
			
			max = covidCases[0];
			
			for(int idx=1;idx<covidCases.length;idx++) {
				if(covidCases[idx] > max) {
					max = covidCases[idx];
				}
			}
			
			System.out.println("Maximum inCovid Cases is: "+max);
	}

}
