package com.prev;

public class sortedOrNot {
    public static boolean sortedornot(int a[]) {
    	
    	 for(int i=0;i<a.length-1;i++) {
    		 if(a[i]>a[i+1]) {
    			 return false;
    		 }
    	 }
    	 return true;
     }
    public static void main(String args[]) {
   	 int a[]= {1,4,5,2,1};
   	 System.out.print(sortedornot(a));
    }
}
