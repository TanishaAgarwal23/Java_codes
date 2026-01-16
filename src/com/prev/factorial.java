package com.prev;
 import java.util.Scanner;
   public class factorial {
	  public static void main(String args[]){
		   int n,i,fact=1;
		     System.out.println("Enter any number");
		       Scanner s=new Scanner(System.in);
		         n=s.nextInt();
		          for(i=n;i>=1;i--) {
		        	  fact=fact*i;
		          }
		          System.out.print(fact);
	 }

}
