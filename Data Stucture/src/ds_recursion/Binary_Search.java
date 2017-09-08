package ds_recursion;

public class Binary_Search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(binary(a,9,0,a.length-1));

	}

	private static int binary(int[] a,int value,int p, int q ) {
		int r=(p+q)/2;
		if(p>q)
			return -1;
		else if(a[r]==value)
			return r;
		else if(a[r]>value) {
			q=r-1;
			return binary(a,value,p,q);
		}		
		else {
			p=r+1;
			return binary(a,value,p,q);
		}
			
	}

}
