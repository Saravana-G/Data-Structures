package basics;


import java.util.Scanner;

public class Factorial_recursion {
	public static void main(String[] args)  {
		int input,result;
		
		Scanner console = new Scanner(System.in); 
		System.out.println("Enter the Value :");
		input=console.nextInt();
		result = factorial(input);
		System.out.println("The result is : "+result);
		console.close();

	}

	private static int factorial(int input) {
		if(input==0)
			return 1;
		else if(input==1)
			return 1;
		else
			return input*factorial(input-1);
	}

}
