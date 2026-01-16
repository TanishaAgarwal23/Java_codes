package com.tanisha.revision;

public class MaxContinuousSum {

	public static void main(String args[]) {
		int a[]= {5,2,-8,6,0,-7,4,-1};
		int sum=0;
		int maxSum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
			if(sum<0) {
				sum=0;
			
				
			}
			else if(maxSum<sum) {
				maxSum=sum;
			}
		}
		System.out.println(maxSum);
		
	}

}
