package basics;

import java.util.Arrays;
import java.util.Scanner;

public class summa {

	public static void main(String[] args) {
		int nums[] = new int[10],target,input,result[] = new int[2];
		Scanner console = new Scanner(System.in); 
		System.out.println("Enter the number of Values :");
		input=console.nextInt();
		for(int i=0;i<input;i++)
			nums[i]=console.nextInt();
		System.out.println("Enter the number of Target :");
		target=console.nextInt();
		
		System.out.println("The result is : "+ Arrays.toString(twoSum(nums,target)));
		console.close();

	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int i,j;
	        for(i=0;i<nums.length;i++)
	            for(j=i;j<nums.length-1;j++)
	                if(nums[j]+nums[j+1]==target){
	                	System.out.println("The result is : "+nums[j]+ nums[j+1]);
	                    return new int[]{j,j+1};
	                }
	        return new int[] {0};   
	    }

}
