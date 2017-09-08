package ds_sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[]= {4,5,7,3,9,2,8,1,1};
		quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}

	private static void quicksort(int[] a, int start, int end) {
		int pivot;
		if(start<end) {
			pivot=partition(a,start,end);
			quicksort(a, start, pivot-1);
			quicksort(a,pivot+1,end);
		}
		
	}

	private static int partition(int[] a, int start, int end) {
		int pivot= end,i=start-1,j=start;
		while(j<=end) {
			if(a[j]<=a[pivot]) {
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
				
		}
		return i;
	}

}
