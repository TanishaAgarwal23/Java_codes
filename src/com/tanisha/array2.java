package com.tanisha;
//maximum continuous sum possible
import java.util.Arrays;
public class array2 {
	  public static void main(String args[]) {
          int a[]= {4,-6,-3,2,1,8,-4,3};
		  
          int sum=0;
          int max=Integer.MIN_VALUE;
          int i=0;
       
          for(i=0;i<a.length;i++)   
        		  {
        	  sum=sum+a[i];
        	  if(sum<0) {
        		 sum=0;  		  
        	  }
        	  else if(sum>max){
        		  max=sum;
        		  
        	  }
          
	  }
       System.out.println(max); 
	  }
	  }
