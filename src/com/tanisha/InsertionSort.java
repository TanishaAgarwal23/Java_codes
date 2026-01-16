 package com.tanisha;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String args[]) {
	
	    int a[]= {5,2,3,1,4};
	   // insertionSort(a);
	     int b[]= new int[a.length];
	       for(int i=0;i<a.length;i++) {
	    	  for(int j=0;j<=i;j++) {
	    		 if(j==i) {
	    			 b[j]=a[i];
	    		          }
	    		   else if(a[i]<b[j]){     //shift
	    			   for(int k=i;k>j;k--) {
	    				   b[k]=b[k-1];
	    				   System.out.println(i+","+j);
	    			   }
	    			        b[j]=a[i];
	    			        break;
	    		   }
	    		 
	    	  }
	    }
	       System.out.println(Arrays.toString(b));  
	       InsertionSortt(a);
   }
	public static void insertionSort(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j>=0; j--) {
                if (j>0 && a[i] < b[j-1]) {
                    b[j] = b[j-1];
                    System.out.println(i+","+j);
                } else {
                    b[j] = a[i];
                    break;
                }
            }
            System.out.println(Arrays.toString(b));
        }
        System.out.println("Final result is: ");
        System.out.println(Arrays.toString(b));
    }
	public static void InsertionSortt(int a[]) {
		int n = a.length;
		for(int i = 1;i<n;i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		System.out.println(Arrays.toString(a));
	}
}
