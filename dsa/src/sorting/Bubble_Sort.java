package sorting;

public class Bubble_Sort {
	public static void bubbleSort(int arr[]) {

		int i, j;
		int flag = 0;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 ; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("Array Already Sorted !!!");
				break;
			}
		}
		System.out.println("Sorting Completed !!!");
	}

	public static void BubbleSort1(int arr[]) {

		int flag = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = arr.length - 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("Array Already Sorted !!!");
				break;
			}
		}
		System.out.println("Sorting Completed !!!");

	}

	public static void main(String[] args) {
		int a[] = { 5, 9, 7, 38, 14, 12, 45, 3 };
		// Bubble_Sort.bubbleSort(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
		Bubble_Sort.BubbleSort1(a);
		for (int b : a) {
			System.out.print(b + " ");
		}
	}
}
