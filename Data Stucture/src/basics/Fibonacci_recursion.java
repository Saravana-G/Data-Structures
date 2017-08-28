package basics;

import java.util.Scanner;

public class Fibonacci_recursion {
	public static void main(String args[]) {
int input,result=0;
		
		Scanner console = new Scanner(System.in); 
		System.out.println("Enter the Value:");
		input=console.nextInt();
		result = fibonacci(input);
		System.out.println("The result is : "+result);
		console.close();
	}

	private static int fibonacci(int input) {
		if(input==0)
			return 0;
		if(input==1)
			return 1;
		else
			return fibonacci(input-1) + fibonacci(input-2);
	}
}
