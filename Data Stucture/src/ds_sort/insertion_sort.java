package ds_sort;

import java.util.Arrays;

public class insertion_sort {

	public static void main(String[] args) {
		int a[]= {4,5,7,3,9,2,8,1,1};
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	private static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int element = a[i],j;
			for(j=i-1;j>=0 && (a[j]>element);j--) {
				
					a[j+1]=a[j];
			}
			a[j+1]=element;
		}
		
		
	}
}
