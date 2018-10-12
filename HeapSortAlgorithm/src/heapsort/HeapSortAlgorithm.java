/**
 * 
 */
package heapsort;

public class HeapSortAlgorithm {
	public int[] sorting(int[] array) {
		Integer n = array.length;
		while (n > 1) {
			for (int i = n / 2 - 1; i >= 0; i--) {
				int parent = i;
				int left = 2 * (i) + 1;
				int right = 2 * (i) + 2;
				int max = parent;
				if (left < n && array[left] > array[max]) {
					max = left;
				}
				if (right < n && array[right] > array[max]) {
					max = right;
				}
				if (max != parent) {
					int temp = array[max];
					array[max] = array[parent];
					array[parent] = temp;
				}
			}
			int temp = array[0];
			array[0] = array[n - 1];
			array[n - 1] = temp;
			n = n - 1;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 9, 4, 8, 5, 1, 0 };
		HeapSortAlgorithm h = new HeapSortAlgorithm();
		h.sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
