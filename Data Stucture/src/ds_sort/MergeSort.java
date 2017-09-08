package ds_sort;

import java.util.Arrays;

public class MergeSort {
	public static void main(String args[]) {
		int a[]= {4,5,7,3,9,2,8,1,1};
		mergesort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	

	private static void mergesort(int[] a, int start, int end) {
		int mid=(start+end)/2;
		if(start<end) {
			mergesort(a,start,mid);
			mergesort(a,mid+1,end);
			merge(a,start,mid,end);
		}
		
	}

	private static void merge(int[] a, int start, int mid, int end) {
		int temp[] = new int[end-start+1];
		int leftnode=start;
		int rightnode=mid+1;
		int k=0;
		while(leftnode<=mid && rightnode<=end)
			if(a[leftnode]<a[rightnode]) 
				temp[k++]=a[leftnode++];
			else 
				temp[k++]=a[rightnode++];
		
		if(leftnode<=mid) 
			while(leftnode<=mid) 
				temp[k++]=a[leftnode++];
		else if(rightnode<=end) 
			while(rightnode<=end) 
				temp[k++]=a[rightnode++];	
		for(int i=0;i<temp.length;i++) {
			a[start+i]=temp[i];
		}
		
	}
}
