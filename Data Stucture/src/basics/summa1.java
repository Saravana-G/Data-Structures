package basics;

public class summa1 {

	public static void main(String[] args) {
		int a=5,b=6;int c[]= {1,2,3};
				System.out.println(a+b);
		bla(a,b,c);
		
		System.out.println(a+b+""+c[0]);
		wow aa=new wow();
		aa.a=6;
		System.out.println(aa.a);
		aa.ma();
		System.out.println(aa.a);
	}

	private static void bla(int a, int b,int c[]) {
		a=7;
				b=8;
				c[0]=2;
		
	}
	
	private static int[] blabla(int a[]) {
		return new int []{a[0],a[1]};
	}

}

class wow{
	int a;
	public void ma() {
		a=10;
	}
}
