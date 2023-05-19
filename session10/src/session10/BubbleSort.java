package session10;

public class BubbleSort {
	
	static void printArray(int[] array) {
		for(int element : array) {
			System.out.println(element+"    ");
		}
		System.out.println();
	}
	
	static void bubbleSort(int[] array) {
		
		int length = array.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-i-1;j++) {
				if(array[j]> array[j+1]) {
					int temporary = array[j];
					array[j] = array[j+1];
					array[j+1] = temporary;
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		
		int[] ages = {10, 12, 34, 54, 42, 80, 75, 9, 7, 33};
		
		System.out.println("Array Before sorting");
		BubbleSort.printArray(ages);
		
		
		BubbleSort.bubbleSort(ages);
		
		System.out.println("Array After sorting");
		BubbleSort.printArray(ages);
		

	}

}
