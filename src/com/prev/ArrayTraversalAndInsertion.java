package com.prev;
import java.util.Scanner;
public class ArrayTraversalAndInsertion {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
	//	int length=sc.nextInt();
		int[] array=new int[size];
	
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("length of array");
		System.out.println(array.length);
		System.out.println("Array elements:");
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
	
	}
	sc.close();
	
}
	
}
