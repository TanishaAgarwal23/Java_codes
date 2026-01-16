package course;

public class Subarrays {

	public static void Subarrays(int numbers[]) {
		int totalSub=0;
		for(int i=0;i<numbers.length;i++) {
			//start=i
			for(int j=i;j<numbers.length;j++) {
				//end=j
				for(int k=i;k<=j;k++) {//print
					System.out.print(numbers[k]+" ");
				}
				totalSub++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total subarrays =" + totalSub);
	}
	
	public static void main(String args[]) {
		int numbers[]= {2,4,6,8,10};
		Subarrays(numbers);
	}

}
