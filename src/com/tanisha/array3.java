package com.tanisha;
//maximum continuous product
import java.util.Arrays;
public class array3 {
	 public static void main(String args[]) {
         int a[]= {4,-1,4,-1,4,-1,6,0,4,-1,4};        
         int product=1;
         int max=0;
         int start=0;
         for(int i=0;i<=a.length;i++)   
       		  {
        	 if( i==a.length||a[i]==0 ) {
        		for(int j=start;j<i && product<0; j++ ) {
        			product=product/a[j];
        		}
        		if(product>max) {
        			max=product;
        		}
        		start=i+1;
        		product=1;
        	 }
        	 else { 
        		 product=product*a[i];
       	  if(product>max) 
       	  {
       		  	max=product;	  
       	  }
       	  }     
	  }
      System.out.println(max); 
	  }
	  }
	








