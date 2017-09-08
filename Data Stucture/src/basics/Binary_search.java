package basics;

public class Binary_search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		a=sort(a);
		System.out.println(binary(a,10));
	}
	
	static int[] sort(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		return a;
	}
	static int binary(int a[],int x) {
		int p=0,q=a.length-1,r;
		r=(p+q)/2;
		while(p<=q) {
			if(a[r]>x) {
				q=r-1;
				r=(p+q)/2;
			}else if(a[r]<x){
				p=r+1;
				r=(p+q)/2;
			}else
				return r;
		}
		return -1;
	
	}

}
