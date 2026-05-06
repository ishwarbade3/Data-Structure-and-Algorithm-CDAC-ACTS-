package sorting;

public class Bubble_Sort {
	public static void bubbleSort(int arr[]) {

		int i, j;
		int flag = 0;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1; j++) {
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

	public void sort_Employee(Employee[] a) {

		int i, j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1; j++) {
				if (a[j].getEmpId() > a[j + 1].getEmpId()) {
					Employee temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
			System.out.println("Sorting Completed!!!");

		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 9, 7, 38, 14, 12, 45, 3 };
		// Bubble_Sort.bubbleSort(a);
//		for (int b : a) {
//			System.out.print(b + " ");
//		}
//		Bubble_Sort.BubbleSort1(a);
//		for (int b : a) {
//			System.out.print(b + " ");
//		}
		Bubble_Sort b = new Bubble_Sort();
		Employee[] std = new Employee[5];

		std[0] = new Employee(21, "Virat", 1500.1);
		std[1] = new Employee(13, "Yash", 1500.1);
		std[2] = new Employee(145, "AMAN", 1500.1);
		std[3] = new Employee(36, "Monty", 1500.1);
		std[4] = new Employee(1, "bob", 1500.1);

		for (Employee e : std) {
			System.out.println(e);
		}
		b.sort_Employee(std);
		for (Employee e : std) {
			System.out.println(e);
		}
		
	}
}
