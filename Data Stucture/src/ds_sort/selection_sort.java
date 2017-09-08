package ds_sort;

import java.util.Arrays;

public class selection_sort {
	public static void main(String[] args) {
		int a[]= {4,5,7,3,9,2,8,1,1};
		a=sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static int[] sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int temp=i,tmp;
			for(int j=i;j<a.length;j++) {				
				if(a[temp]>a[j])
					temp=j;
			}
			tmp=a[i];
			a[i]=a[temp];
			a[temp]=tmp;
		}
		return a;
		
	}
}
