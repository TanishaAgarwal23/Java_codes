package course;

public class DiagonalSum {

	public static int DiagonalSum(int n[][]) {//O(n2)
		int sum=0;
		 //primary diagonal
		/*for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[0].length;j++) {
				if(i==j) {
					sum+=n[i][j];
				}
				else if(i+j==n.length-1) {
					sum+=n[i][j];
					}
			}
		
		}
		
		return sum;
	}*/
		//O(n)
		for(int i=0;i<n.length;i++) {
			//primaryDiagonal
			sum+=n[i][i];
			//secondaryDiagional
			if(i!=n.length-1-i)
			sum+=n[i][n.length-i-1];
		}
		return sum;
		}
	public static void main(String args[]) {
		int n[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
			System.out.print(DiagonalSum(n));  
	}
}
