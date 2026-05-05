package sorting;

public class MergeSort {
	public int[] merge_Arrays_Ver1(int arr1[], int arr2[]) {
		int target[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				target[k++] = arr1[i++];
			} else if (arr1[i] > arr2[j]) {
				target[k++] = arr2[j++];
			} else {
				target[k++] = arr1[i++];
				j++;
			}
		}
		while (i < arr1.length) {
			target[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			target[k++] = arr2[j++];
		}
		int ans[] = new int[k];
		for (int a = 0; a < k; a++) {
			ans[a] = target[a];
		}
		return ans;
	}
	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		int a1[]= {1,2,8,32,89};
		int a2[]= {2,5,7,9,42,79};
		int ans []= m.merge_Arrays_Ver1(a1, a2) ;
		for(int b : ans) {
			System.out.print(" "+b);
		}
	
	}

}
