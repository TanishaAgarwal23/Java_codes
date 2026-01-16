package course;

public class maxSubArraySum {
//brute force=n^3
	public static void maxSubArraySum(int numbers[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			//start=i
			for(int j=i;j<numbers.length;j++) {
				//end=j
				currSum=0;
				for(int k=i;k<=j;k++) {//print
					currSum+=numbers[k];
				}
				System.out.println(currSum);
				if(maxSum<currSum) {
					maxSum=currSum;
			   }
				
			}
		}
		System.out.println("Maximum sum is:"+ maxSum);
} 
	//n
	public static void maxSumKadanes(int number[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<number.length;i++) {
			currSum=currSum+number[i];
			if(currSum<0) {
				currSum=0;
			}
			maxSum=Math.max(maxSum, currSum);
		}
		System.out.println("our maximum subarray sum is:"+ maxSum);
	}
	
	public static void main(String args[]) {
		int numbers[]= {2,-1,0,9,8,7};
		int number[]= {-2,-3,4,-1,-2,1,5,-3};
	//	maxSubArraySum(numbers);
		maxSumKadanes(number);
	}
}
