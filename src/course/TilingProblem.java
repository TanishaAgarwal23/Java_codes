package course;
/*Given a "2*n" floor and tiles of size "2*1",count the number of ways to tile 
the given board using the 2*1 tiles(tile can be placed horizontally or vertically.*/
public class TilingProblem {

	public static int TilingProblem(int n) {//2xn floor size
		
		//base case
		if(n==0||n==1) {
			return 1;
		}
		
		
		//kaam
		//vertical choice
		int fnm1=TilingProblem(n-1);
		//horizontal choice
		int fnm2=TilingProblem(n-2);
		
		
		int totWays=fnm1+fnm2;
		return totWays;
	}
public static void main(String args[]) {
	System.out.println(TilingProblem(4));
}
}
