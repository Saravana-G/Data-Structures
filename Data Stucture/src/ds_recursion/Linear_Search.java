package ds_recursion;

public class Linear_Search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(linear(a,0,10));
		

	}

	private static int linear(int[] a, int i, int j) {
		if(i>=a.length)
			return -1;
		else if(a[i]==j)
			return i;
		else
			return linear(a,i+1,j);
	}

}
