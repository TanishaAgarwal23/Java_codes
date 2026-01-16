package com.tanisha;
import java.util.Arrays;

public class binarysearch {
  public static void main(String args[]) {
	  int a[]= {1,2,3,4,5,6,7,8};
	  int n=8;
      int result = binarySearch(a,n);
        System.out.println(result);
		} 
  public static int binarySearch(int a[],int n) {
	  return binarySearch(a,0,a.length-1,n);
  }

  public static int binarySearch(int a[],int start,int end,int n) {
	  int mid=(start+end)/2;
	  if(n==a[mid]) {
		  return mid;
	  }
	  if(start==end) {
		  return -1;
	  }
	  else if(n<a[mid]) {
		return binarySearch(a,start,mid-1,n);
		  
	  }
	  else {
		 return binarySearch(a,mid+1,end,n);
	  }
	  
         }
             }




