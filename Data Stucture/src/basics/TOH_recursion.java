package basics;

import java.util.Scanner;

public class TOH_recursion {

	public static void main(String[] args) {
		int n;		
		Scanner console = new Scanner(System.in); 
		System.out.println("Enter the Value :");
		n=console.nextInt();
		TOH(n,"A","C","B");
		console.close();
	}

	private static void TOH(int n, String frompeg, String topeg, String auxpeg) {
		if(n==1) {
			System.out.println("Move disk1 from peg "+ frompeg +"to peg"+ topeg);
			return;
		}
		TOH(n-1,frompeg,auxpeg,topeg);
		System.out.println("Move disk"+n+" from peg "+ frompeg +"to peg"+ topeg);
		TOH(n-1,auxpeg,topeg,frompeg);
		
	}

}
