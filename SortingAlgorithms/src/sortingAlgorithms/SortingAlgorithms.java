package sortingAlgorithms;

public class SortingAlgorithms {
	static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
	
	static void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min_id = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_id])
					min_id = j;
			}
			int temp = arr[min_id];
			arr[min_id] = arr[i];
			arr[i] = temp;
		}
	}
	
	static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int [] a= {12,11,13,5,6};
		System.out.println("Array: ");
		printArray(a);
		insertionSort(a);
		System.out.println();
		System.out.println("Insertion Sort: ");
		printArray(a);
		System.out.println();
		System.out.println("Selection Sort: ");
		selectionSort(a);
		printArray(a);
		System.out.println();
		System.out.println("Bubble Sort: ");
		bubbleSort(a);
		printArray(a);
	}

}
