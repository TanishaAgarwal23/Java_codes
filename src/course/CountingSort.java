package course;

import java.util.Arrays;

public class CountingSort {
public static void countingSort(int Arr[]) {
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<Arr.length;i++) {
		largest=Math.max(largest, Arr[i]);
	}
	int count[]=new int[largest+1];
	for(int i=0;i<Arr.length;i++) {
		count[Arr[i]]++;
	}
	//sorting
	int j=0;
	for(int i=0;i<count.length;i++) {
		while(count[i]>0) {
			Arr[j]=i;
			j++;
			count[i]--;
		}
	}
	System.out.println(Arrays.toString(Arr));
}
	public static void main(String args[]) {
		int Arr[]= {1,2,1,3,2,4,3,7};
		countingSort(Arr);
	}

}
