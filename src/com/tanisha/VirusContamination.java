package com.tanisha;
import java.util.Queue;
/*Q8. Given a matrix of size NxM, where N represents the number of rows and M represents the number of columns containing 0’s and 1’s, where 0 represents empty cells, 1 represents cells with healthy people.
 *  A virus is introduced at cell (x,y) which after 1 unit of time passes can jump both horizontally and 
 *  vertically if there is a person in the adjacent cell. How long will it take for the virus 
 *  to infect the whole population?
-	What is the final count of infected people.
For instance, given a 1x5 matrix [1, 1, 1, 1, 1], if a virus is introduced at (0,2) the virus will spread as below:
At time 1 the virus will spread from (0,2) -> (0,1) & (0,3)
At time 2 the virus will spread from (0,1) -> (0,0) and (0,3) -> (0,4) resulting in infecting the whole population.
So it tool 2 units of time the infection will be complete.*/
public class VirusContamination {

	public static void main(String args) {
		int[][] a= {
				{0,1,1,0,0,1},
				{1,1,1,0,1,0},
				{0,0,1,1,0,1},
				{1,1,0,0,1,0}	
				};
		
	}
	public static void virusContamination(int a[][],int x,int y )
	{
		Queue<Pair<Integer,Integer>> queue=new Queue<>();
		
		}
	}

};
