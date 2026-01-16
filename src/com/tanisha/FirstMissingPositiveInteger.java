package com.tanisha;
import java.util.Arrays;
public class FirstMissingPositiveInteger {
	public static void main(String args[]) {
		int a[]= {4,3,-1,6,2,1,7,5,2};
			System.out.println(firstMissingPositiveInteger(a));
		}
	public static int firstMissingPositiveInteger(int a[]) {
	        int n = a.length;
	 
	    	for  (int i = 0; i < n; i++) {
	    		int count = 0;
	    		while (a[i] != i + 1) {
	    			if (a[i] <= 0 || a[i] >= n)
	    				break;
	 
	                	if(a[i]==a[a[i]-1])
	                    		break;
	 
	    			int temp = a[i];
	    			a[i] = a[temp - 1];
	    			a[temp - 1] = temp;
	    			System.out.print(count++);
	    			System.out.println(Arrays.toString(a));
	    		}
	    	}
	 
	    	for (int i = 0; i < n; i++){
	    		if (a[i] != i + 1){
	    			return i + 1;
	    		}
	    	}	
	 
	    	return n + 1;
	}
}



