package searching;

public class Sequential_Search {
	public int seq_search(int arr[], int key) {
		int pos = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				pos = i + 1;
				break;
			}
		}
		return pos;
	}

	public int seq_earch2Occr(int arr[], int key) {
		int pos = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key && count != 2) {
				count++;
				pos = i + 1;
			}
		}
		return pos;
	}

	public int last2_occurance(int arr[], int key) {
		int pos = -1, count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key && count != 2) {
				pos = i + 1;
				count++;
			}
		}
		return pos;
	}

	public int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = low + (high - low) / 2;
		while (arr[mid] != key && low <= high) {
			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = low + (high - low) / 2;
		}
		if (arr[mid] == key) {
			return mid + 1;
		} else {
			return -1;
		}
	}
	public int binarySearchRec(int arr[],int key , int low ,int high) {
		if(low > high) {
			return -1;
		}
		int mid = low+(high-low)/2;
		if(arr[mid]== key) {
			return mid+1;
		}
		else if(key < arr[mid]) {
			return binarySearchRec(arr, key, low, mid-1);
		}
		else{
			return binarySearchRec(arr, key, mid+1, high);
		}
	}

	public static void main(String[] args) {
		Sequential_Search s = new Sequential_Search();
		int arr[] = { 10, 5, 53, 4, 25, 245, 24, 124, 1, 2, 5, 6, 89, 25, 5 };
		int arr1[] = { 2, 3, 7, 9, 15, 25, 54, 84, 94 };
		System.out.println("First : " + s.seq_search(arr, 97));
		System.out.println("Second : " + s.seq_earch2Occr(arr, 5));
		System.out.println("Second Last : " + s.last2_occurance(arr, 5));
		System.out.println("Binary Search : " + s.binarySearch(arr1, 14));
		System.out.println("Binary Search : " + s.binarySearchRec(arr1,14,0,arr1.length));
	}
}
