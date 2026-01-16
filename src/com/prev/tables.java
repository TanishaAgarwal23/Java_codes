package com.prev;
import java.util.Scanner;

public class tables {
	public static void main(String args[]) {
		int n,i;
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(n + "*" + i + "="+ n*i);
		
		}
	}

}
