package com.tanisha;
//merge two sorted arrays
import java.util.Arrays;
public class merge {
public static void main(String args[]) {
	int a[]= {1,2,3,5,6};
	int b[]= {4,7,8};
	Merge(a,b);
}
public static void Merge(int a[],int b[]) {
	int t[] = new int[a.length+b.length];
    int k=0;
    int i=0;
    int j=0;
    for(;i<a.length && j<b.length;k++) {
    	if(a[i]<b[j]) {
    		t[k]=a[i];
    		i++;
    	}
    	else {
    		t[k]=b[j];
    		j++;
    	}
    }
    while(i<a.length) {
    	t[k]=a[i];
    	i++;
    	k++;
    }
    while(j<b.length) {
    	t[k]=b[j];
    	j++;
    	k++;
    }
System.out.println(Arrays.toString(t));
}
}
