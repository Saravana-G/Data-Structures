package basics;




public class Linear_search {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(search(a,6));
		System.out.println(search(a,11));
		

	}

	static int search(int a[],int x) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x)
				return i;
		}
		return -1;
	}
}


