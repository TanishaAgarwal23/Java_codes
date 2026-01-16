package course;

import java.util.Arrays;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void insertionSort(int n[]) {
		
		for(int i=1;i<n.length;i++) {
			int curr=n[i];
			int prev=i-1;
			while(prev>=0 && n[prev]>curr) {
				n[prev+1]=n[prev];
				prev--;
				}
			//insertion
		    	n[prev+1]=curr;
			}
		System.out.println(Arrays.toString(n));
	}
public static void main(String args[]) {
	int n[]= {5,4,1,3,2};
	insertionSort(n);
}
}
