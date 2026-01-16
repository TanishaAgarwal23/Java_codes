package com.prev;
import java.util.Arrays;

public class DutchNationalFlagProb {
 public static void main(String args[]) {
	 int arr[]= {0,1,2,0,1,2};
	 int n=arr.length;
	 int left=0,mid=0,right=n-1;
	  while(mid<=right) {
		  if(arr[mid]==0) {
			  int temp=arr[left];
			  arr[left]=arr[mid];
			  arr[mid]=temp;
			  left++;
			  mid++;
		  }
		  else if(arr[mid]==1) {
			  mid++;
		  }
		  else {
			  int temp = arr[mid];
			  arr[mid]=arr[right];
			  arr[right]=temp;
			  right--;
		  }
	  }
	 System.out.println(Arrays.toString(arr));
 }
}


