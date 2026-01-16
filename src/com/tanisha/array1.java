//given an array find if a given number can be achieved by summing continuous elements.
package com.tanisha;
 import java.util.Arrays;
    public class array1 {
	  public static void main(String args[]) {
          int a[]= {4,6,3,9,2,3,7};
          int n=9;
          int sum=0;
          int start=0;
          int end=0;
          boolean flag=false;
          while(end<a.length || sum>=n)
        		  {
        	  if(sum<n) {
        		  sum=sum+a[end];
        		  end++;
        		 // System.out.println(sum+","+start+","+end);
        	  }
        	  else if(sum==n) {
        		flag=true;
        		  break;
        		  
        	  }
        	  else if(sum>n) {
        		  sum=sum-a[start];
        		  start++;
        	  }
        	  
        	 // System.out.println(sum+","+start+","+end);
          }
        
          System.out.println(flag);   
	  }
	  
    }

    
    
    