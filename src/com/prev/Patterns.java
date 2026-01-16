package com.prev;
import java.util.*;
public class Patterns {

public static void main(String args[]) {
		int n=6;
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(4,5);
		pattern5(4);
		FloydsTri(6);
		Tri01(5);
	    ButterflyPattern(5);
		SolidRhombus(5);
		HollowRhombus(3);
		DiamondPattern(10);
		NumberPattern(5);
		PalindromePattern(5);
		pattern6(4);
	}
	public static void pattern1(int n){
		System.out.println("pattern1");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}
	public static void pattern2(int n) {
		System.out.println("pattern2");
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
public static void pattern3(int n) {
	System.out.println("pattern3");
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i+1;j++) {
		System.out.print(j+" ");
	}
	System.out.println();
}
}
public static void pattern4(int totRow,int totCol) {
	System.out.println("pattern4");
	//outerloop-rows
	for(int i=1;i<=totRow;i++){
		//innerloop-columns
		for(int j=1;j<=totCol;j++) {
			//cell-(i,j)
			if(i==1||i==totRow||j==1||j==totCol) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
public static void pattern5(int n) {
	System.out.println("pattern5");
	//outer
	for(int i=1;i<=n;i++) {
		//spaces
		for(int j=1;j<=n-i ;j++) {
			System.out.print(" ");
		}
		//stars stars=i
		
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	
	 System.out.println();
	}
}
public static void FloydsTri(int n) { 
	System.out.println("Floyd's Triangle");
	 //outer
	int counter=1;
	 for(int i=1;i<=n;i++) {
		 //inner-how any times will counter be printed
		 for(int j=1;j<=i;j++) {
			 System.out.print(counter+" ");
			 counter++;
		 }
		 System.out.println();
	 }
	
}
public static void Tri01(int n) {
	System.out.println("Triangle-0,1");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			if((i+j)%2==0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
		System.out.println();
	}
}
public static void ButterflyPattern(int n) {
	System.out.println("Butterfly Pattern");
	 for(int i=1;i<=n;i++) {
		// stars-i
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 //spaces-2*(n-i)
		 for(int j=1;j<=2*(n-i);j++) {
			 System.out.print(" ");
		 }
		 //stars-i
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 //2nd half
	 for(int i=n;i>=1;i--) {
			// stars-i
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 //spaces-2*(n-i)
			 for(int j=1;j<=2*(n-i);j++) {
				 System.out.print(" ");
			 }
			 //stars-i
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
}
	
}
public static void SolidRhombus(int n){
	System.out.println("Solid Rhombus");
	for(int i=1;i<=n;i++) {
		//spaces
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		//stars
		for(int j=1;j<=n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void HollowRhombus(int n) {
	System.out.println("Hollow Rhombus");
	for(int i=1;i<=n;i++){
		//spaces
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		//hollow rectangle-stars
		
			for(int j=1;j<=n;j++) {
				
				if(i==1||i==n||j==1||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
public static void DiamondPattern(int n) {
	System.out.println("Diamond Pattern");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=(2*i-1);j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=(2*i-1);j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void NumberPattern(int n) {
	System.out.println("Number Pattern");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
public static void PalindromePattern(int n) {
	System.out.println("Palindrome Pattern");
	for(int i=1;i<=n;i++) {
		//spaces
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		//descending
		for(int j=i;j>=1;j--) {
			System.out.print(j);
		}
		//ascending
		for(int j=2;j<=i;j++) {
			System.out.print(j);		
			}
		System.out.println();
	}
}
public static void pattern6(int n) {
	System.out.println("Pattern 6");
	for(int i=1;i<=n;i++) {
		//spaces
		for(int j=1;j<=(n-i);j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		for(int j=2;j>=1;j--) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}

