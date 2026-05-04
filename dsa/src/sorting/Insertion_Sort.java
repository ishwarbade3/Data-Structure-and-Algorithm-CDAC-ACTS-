package sorting;

public class Insertion_Sort {
	public void insertionSort(int arr[]) {
		int j,i,k;
		for(i=1;i<arr.length;i++) {
			k = arr[i];
			for(j=i-1;j>=0&& k< arr[j];j--) {
				arr[j]=arr[j+1];
			}
			arr[j+1]=k
			
		}
	}
}
