package LtWeeklyContest;
import java.util.*;
/*You are given a 2D integer array towers, where towers[i] = [xi, yi, qi] represents the coordinates (xi, yi) and quality factor qi of the ith tower.
You are also given an integer array center = [cx, cy​​​​​​​] representing your location, and an integer radius.
A tower is reachable if its Manhattan distance from center is less than or equal to radius.
Among all reachable towers
Return the coordinates of the tower with the maximum quality factor.
If there is a tie, return the tower with the lexicographically smallest coordinate. If no tower is reachable, return [-1, -1].
The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
A coordinate [xi, yi] is lexicographically smaller than [xj, yj] if xi < xj, or xi == xj and yi < yj.
|x| denotes the absolute value of x.
Example 1:
Input: towers = [[1,2,5], [2,1,7], [3,1,9]], center = [1,1], radius = 2
Output: [3,1]
Explanation:
Tower [1, 2, 5]: Manhattan distance = |1 - 1| + |2 - 1| = 1, reachable.
Tower [2, 1, 7]: Manhattan distance = |2 - 1| + |1 - 1| = 1, reachable.
Tower [3, 1, 9]: Manhattan distance = |3 - 1| + |1 - 1| = 2, reachable.
All towers are reachable. The maximum quality factor is 9, which corresponds to tower [3, 1].
Note: Please do not copy the description during the contest to maintain the integrity of your submissions.
 */
public class BestReachableTower {
	
	public static int[] bestTower(int[][] towers, int[] center, int radius) {
		int cx = center[0], cy= center[1];
		int maxQuality = -1, bestX = -1, bestY = -1;
		 for(int[] t : towers) {
			 int x = t[0], y = t[1], q = t[2];
			 
			int manHattanDistance = Math.abs(cx - x) + Math.abs(cy - y);
			if(manHattanDistance <= radius) {
				if(q>maxQuality || q == maxQuality && (x<bestX || (x == bestX && y< bestY))) {
					maxQuality = q;
					bestX = x;
					bestY = y;
				}
			}
			
		 }
		if(maxQuality == -1) return new int[] {-1,-1};
		return new int[] {bestX,bestY};
	}
   public static void main(String args[]) {
	   int towers[][] = {{1,2,5}, {2,1,7}, {3,1,9}};
	   int center[] = {1,1};
	   int radius = 2;
	   
	   int result[] = bestTower(towers,center,radius);
	   System.out.println(Arrays.toString(result));
   }
}
