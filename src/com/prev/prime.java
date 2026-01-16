package com.prev;
import java.util.Scanner;
public class prime {

	public static void main(String args[]) {
		int n, i,count=0;
		System.out.print("Enter any number");
		Scanner r = new Scanner(System.in);
	    n= r.nextInt();
	      for(i=1;i<=n;i++) {
	    	  if(n%i==0) 
	    	  {
	    		  count++;
	    	  }
	      }
	      if(count==2) 
	    	  System.out.println("prime number");
	      else
	    	  System.out.println("not prime number");
	    	  
	      }
	}


