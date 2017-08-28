package basics;

import java.util.Scanner;

public class sortedarray_recursion {

	public static void main(String[] args) {
		int nums[] = new int[10],input;
		Scanner console = new Scanner(System.in); 
		System.out.println("Enter the number of Values :");
		input=console.nextInt();
		for(int i=0;i<input;i++)
			nums[i]=console.nextInt();
		
		System.out.println("The result is : "+ twoSum(nums,nums.length));
		console.close();
	}

	private static int twoSum(int[] nums, int index) {
		if(nums.length==1)
			return 1;
		if(nums[index-2]>nums[index-1])
			return 0;
		else
			return twoSum(nums,index-1);
	}

}
