package course;
import java.util.Arrays;
import java.util.Collections;
public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void selectionSort(int array[]) {
		for(int i=0;i<array.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[smallest]>array[j]) {
					smallest=j;
				}
			}
			int temp=array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
	public static void printArr(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
public static void main(String args[]) {
	int array[]= {4,7,8,5,2,1,3,6};
	selectionSort(array);
	//Arrays.sort(array);
	//Arrays.sort(array,0,5);
	//Arrays.sort(array,Collections.reverseOrder());
	//printArr(array);
	
}
}
